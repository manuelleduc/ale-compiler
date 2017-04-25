package ale.compiler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import ale.xtext.AleStandaloneSetup;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.ContainmentField;
import ale.xtext.ale.Field;
import ale.xtext.ale.LiteralType;
import ale.xtext.ale.NewClass;
import ale.xtext.ale.OpenClass;
import ale.xtext.ale.OrderedSetType;
import ale.xtext.ale.OutOfScopeType;
import ale.xtext.ale.RefField;
import ale.xtext.ale.Root;
import ale.xtext.ale.SequenceType;
import ale.xtext.ale.Type;
import dsl.xtext.DslStandaloneSetup;
import dsl.xtext.dsl.Behavior;
import dsl.xtext.dsl.DSL;
import dsl.xtext.dsl.Syntax;
import fr.inria.diverse.objectalgebragenerator.GenerateAlgebra;
import fr.inria.diverse.objectalgebragenerator.Graph;

/**
 * 
 * This compiler compiles a given semantic, which conform itself to a bunch of
 * syntaxes, to a bunch of (conforming) target syntaxes.
 * 
 * @author mleduc
 *
 */
public class AleCompiler {

	private final java.net.URI dslURI;
	private List<EPackage> syntaxes;
	private List<EPackage> models;
	private final String filenamedsl;
	private ArrayList<AleClass> aleScope;

	public AleCompiler(final java.net.URI uri, final String filenamedsl) {
		this.dslURI = uri;
		this.filenamedsl = filenamedsl;
	}

	private GenModel saveGenModel(final ResourceSetImpl resSet, final String languageName, final EPackage rootPackage,
			final String projectName) {
		/*
		 * Final step: Generating the emf code from the ecore generated
		 */

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());

		final GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.getForeignModel().add("http://" + languageName);
		genModel.setModelName(languageName);
		genModel.setModelPluginID(projectName);
		genModel.getForeignModel().add(rootPackage.getNsURI());
		genModel.initialize(Collections.singleton(rootPackage));
		genModel.setModelDirectory("/" + projectName + "/src");

		// TODO: Update genmodel in order to avoid the regeneration of
		// cross-references

		final URI createURI = URI
				.createPlatformResourceURI("/" + projectName + "/src-gen/" + languageName + ".genmodel", true);
		final Resource res = resSet.createResource(createURI);

		res.getContents().add(genModel);

		try {
			res.save(null);

		} catch (final IOException e) {
			e.printStackTrace();
		}

		return genModel;
	}

	private void proceedToGeneration(final GenModel genModel) {
		genModel.reconcile();
		genModel.setCanGenerate(true);
		genModel.setValidateModel(true);
		genModel.setUpdateClasspath(true);

		final org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor.Registry reg = GeneratorAdapterFactory.Descriptor.Registry.INSTANCE;
		final Generator generator = new Generator(reg);
		generator.setInput(genModel);

		generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, new NullMonitorImplementation(this));

	}

	private EPackage load(final Syntax stx, final ResourceSet rs) {
		return load(stx.getValue().replaceAll("\"", ""), rs);
	}

	private EPackage load(final String uri, final ResourceSet rs) {
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI))
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());

		return rs.getPackageRegistry().getEPackage(uri);
	}

	public void compile(final IProject project) throws IOException, CoreException {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("dsl", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ale", new XMIResourceFactoryImpl());
		final ResourceSetImpl resSet = new ResourceSetImpl();

		final com.google.inject.Injector injector = new DslStandaloneSetup().createInjectorAndDoEMFRegistration();

		final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		final Resource resource = resourceSet.getResource(URI.createURI(this.dslURI.toString()), true);
		final DSL model = (DSL) resource.getContents().get(0);

		final EList<Behavior> behaviors = model.getBehaviours();
		initModels(resSet, model);

		final EPackage rootPackage = initRootPackage();

		final List<EPackage> aleSyntacticDeps = collectSyntacticDependenciesInAle(resSet, model);

		final List<EPackage> ecoreSyntacticDeps = collectSyntacticDependencies(resSet, aleSyntacticDeps);
		
		for(EPackage x : ecoreSyntacticDeps) {
			if(!aleSyntacticDeps.contains(x)) aleSyntacticDeps.add(x);
		}
		this.syntaxes = aleSyntacticDeps;

		final List<Root> roots = behaviors.stream().map(b -> convertBehaviorToRoot(resourceSet, b))
				.collect(Collectors.toList());

		this.aleScope = new ArrayList<AleClass>();
		roots.stream().forEach(r -> r.getClasses().forEach(c -> this.aleScope.add(c)));
		final Set<String> imported = roots.stream().flatMap(r -> r.getSuperAle().stream()).map(x -> x + ".ale")
				.collect(Collectors.toSet());
		for (final IResource m : project.members()) {
			if ("ale".equals(m.getFileExtension()) && imported.contains(m.getName())) {
				final String string = m.getLocationURI().toString();
				final URI createURI = URI.createURI(string);
				final Root root = (Root) resourceSet.getResource(createURI, true).getContents().get(0);
				root.getClasses().forEach(c -> this.aleScope.add(c));
			}
		}

		final List<AleClass> allAleClasses = roots.stream().flatMap(r -> r.getClasses().stream())
				.collect(Collectors.toList());

		generateRequiredAlgebraInterfaces(project, resSet, resourceSet, behaviors, rootPackage, roots, this.syntaxes);

		this.generateAlgebraInterface(rootPackage, this.syntaxes, project, true);
		for (final EPackage ePackage : this.syntaxes) {
			this.generateAlgebraInterface(ePackage, new ArrayList<>(), project, false);
		}

		final List<EClass> listAllClasses = new GenerateAlgebra().getListAllClasses(rootPackage, this.syntaxes);
		listAllClasses.forEach(clazz -> {
			final ale.xtext.ale.AleClass openClass = lookupClass(resourceSet, behaviors, clazz.getName());
			generateOperationInterface(project, rootPackage, allAleClasses, clazz, openClass);
		});

		this.generateConcreteAlgebra(rootPackage, this.syntaxes, project, allAleClasses, this.aleScope);

		this.generateConcreteOperations(rootPackage, this.syntaxes, behaviors, project, resourceSet, allAleClasses);

	}

	private List<EPackage> collectSyntacticDependenciesInAle(final ResourceSetImpl resSet, final DSL model) {
		return model.getSyntaxes().stream().map((final Syntax stx) -> load(stx, resSet))
				.collect(Collectors.toList());
	}

	private List<EPackage> collectSyntacticDependencies(final ResourceSetImpl resSet, final List<EPackage> tmp) {
		final List<EPackage> tmp2 = new ArrayList<>();
		for (final EPackage ePack : tmp) {
			if (ePack != null && ePack.getEAnnotations() != null) {
				for (final EAnnotation eAnnot : ePack.getEAnnotations()) {
					if (eAnnot.getSource().equals("aleParent")) {
						final EPackage pack = load(eAnnot.getDetails().get("uri"), resSet);
						tmp2.add(pack);
					}
				}
			}
		}
		return tmp2;
	}

	private void generateOperationInterface(final IProject project, final EPackage rootPackage,
			final List<AleClass> allAleClasses, final EClass clazz, final ale.xtext.ale.AleClass openClass) {
		new GenerateOperationInterface().generate(clazz, project, openClass, rootPackage, this.syntaxes, allAleClasses,
				this.aleScope);
		if (openClass != null) {
			final GenerateAlgebra generateAlgebra = new GenerateAlgebra();
			for (final String superAC : openClass.getSuperClass()) {
				final String[] spl = superAC.split("\\.");

				final AleClass orElse = this.aleScope.stream().filter(allA -> {
					boolean b;
					if (spl.length > 1) {
						b = allA.getName().equals(spl[1]) && ((Root) allA.eContainer()).getName().equals(spl[0]);
					} else {
						b = allA.getName().equals(spl[0]);
					}
					return b;
				}).findFirst().orElse(null);
				if (orElse != null) {
					final EClass newClazz = generateAlgebra.getListAllClasses(rootPackage, this.syntaxes).stream()
							.filter(c -> c.getName().equals(orElse.getName())).findFirst().orElse(null);
					// if(newClazz == null) newClazz =
					// generateAlgebra.allClasses(rootPackage).
					generateOperationInterface(project, rootPackage, allAleClasses, newClazz, orElse);
				}
			}
		}
	}

	private void initModels(final ResourceSetImpl resSet, final DSL model) {
		this.models = model.getSyntaxes().stream().map(syntax -> {
			if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI))
				EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
			return resSet.getPackageRegistry().getEPackage(syntax.getValue());
		}).filter(x -> x != null).collect(Collectors.toList());
	}

	private EPackage initRootPackage() {
		final String fileNameDsl = this.filenamedsl.substring(0, this.filenamedsl.length() - 4);
		final EPackage rootPackage = EcoreFactory.eINSTANCE.createEPackage();
		rootPackage.setName(fileNameDsl.replaceAll("\\.", ""));
		rootPackage.setNsPrefix(fileNameDsl);
		rootPackage.setNsURI("http://" + fileNameDsl);
		return rootPackage;
	}

	private void generateRequiredAlgebraInterfaces(final IProject project, final ResourceSetImpl resSet,
			final XtextResourceSet resourceSet, final EList<Behavior> behaviors, final EPackage rootPackage,
			final List<Root> roots, final List<EPackage> dependencies) throws IOException {
		final String projectName = project.getName();
		for (final Root root : roots) {
			this.generateDynamicModel(projectName, resSet, root, rootPackage, resourceSet, behaviors, dependencies);
			final GenModel genModel = this.saveGenModel(resSet, root.getName(), rootPackage, projectName);
			this.proceedToGeneration(genModel);

			for (final EPackage ePackage : dependencies) {
				final GenModel genModel2 = this.saveGenModel(resSet, ePackage.getName(), ePackage, projectName);
				this.proceedToGeneration(genModel2);
			}

			this.syntaxes.forEach(ePackage -> {
				this.generateAlgebraInterface(ePackage, null, project, false);
			});
		}
	}

	private ale.xtext.ale.AleClass lookupClass(final XtextResourceSet resourceSet, final EList<Behavior> behaviors,
			final String className) {
		final ale.xtext.ale.AleClass clazz = behaviors.stream().map(b -> convertBehaviorToRoot(resourceSet, b))
				.flatMap(b -> b.getClasses().stream()).filter(b -> {
					final String name2 = b.getName();
					return name2.equals(className) || className.endsWith("_Aspect")
							&& name2.equals(className.substring(0, className.length() - "_Aspect".length()));
				}).findFirst().orElse(null);
		return clazz;
	}

	private Root convertBehaviorToRoot(final XtextResourceSet resourceSet, final Behavior behavior) {
		final Injector injector2 = new AleStandaloneSetup().createInjectorAndDoEMFRegistration();
		final XtextResourceSet resourceSet2 = injector2.getInstance(XtextResourceSet.class);
		resourceSet2.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		final URI createURI = URI.createURI(behavior.getValue());
		final Resource resource2 = resourceSet.getResource(createURI, true);
		return (Root) resource2.getContents().get(0);
	}

	private void generateConcreteOperations(final EPackage rootPackage, final List<EPackage> dependencies,
			final EList<Behavior> behaviors, final IProject project, final XtextResourceSet resourceSet,
			final List<AleClass> allAleClasses) {
		final Graph<EClass> res = new GenerateAlgebra().buildGraph(rootPackage, dependencies);
		res.nodes.forEach(entry -> {
			final ale.xtext.ale.AleClass openClass = lookupClass(resourceSet, behaviors, entry.elem.getName());
			generateConceteOperation(entry.elem, project, rootPackage, openClass, dependencies, allAleClasses,
					this.aleScope);
		});

	}

	private void generateConceteOperation(final EClass entry, final IProject project, final EPackage ePackage,
			final ale.xtext.ale.AleClass openClass, final List<EPackage> deppendencies,
			final List<AleClass> allAleClasses, final List<AleClass> aleScope) {
		generateConcreteOperationRec(entry, project, ePackage, openClass, deppendencies, allAleClasses, aleScope);
		if (openClass != null) {
			final GenerateAlgebra generateAlgebra = new GenerateAlgebra();
			for (final String superAC : openClass.getSuperClass()) {
				final String[] spl = superAC.split("\\.");

				final AleClass orElse = this.aleScope.stream().filter(allA -> {
					boolean b;
					if (spl.length > 1) {
						b = allA.getName().equals(spl[1]) && ((Root) allA.eContainer()).getName().equals(spl[0]);
					} else {
						b = allA.getName().equals(spl[0]);
					}
					return b;
				}).findFirst().orElse(null);
				if (orElse != null) {
					final EClass newClazz = generateAlgebra.getListAllClasses(ePackage, this.syntaxes).stream()
							.filter(c -> c.getName().equals(orElse.getName())).findFirst().orElse(null);
					generateConcreteOperationRec(newClazz, project, ePackage, orElse, deppendencies, allAleClasses,
							aleScope);

				}
			}
		}
	}

	private void generateConcreteOperationRec(final EClass elem, final IProject project, final EPackage ePackage,
			final ale.xtext.ale.AleClass openClass, final List<EPackage> deppendencies,
			final List<AleClass> allAleClasses, final List<AleClass> aleScope) {
		
//		final List<EPackage> aleSyntacticDeps = collectSyntacticDependenciesInAle(new ResourceSetImpl(), model);

//		final List<EPackage> ecoreSyntacticDeps = collectSyntacticDependencies(new ResourceSetImpl(), aleSyntacticDeps);
		
		final boolean overloaded = openClass != null && openClass.getFields().size() > 0
				&& !((EPackage) elem.eContainer()).getName().equals(((Root) openClass.eContainer()).getName());
		final String fileContent = new GenerateAlgebra().processConcreteOperation(elem, ePackage, deppendencies,
				openClass, overloaded, allAleClasses, aleScope);

		final String packageName = elem.getEPackage().getName();
		final String aleName;
		if (openClass != null) {
			aleName = ((Root) openClass.eContainer()).getName();
		} else {
			aleName = "$default";
		}

		final IPath directoryAlgebra = project.getLocation().append("src").append(packageName).append(aleName)
				.append("algebra").append("impl").append("operation");
		directoryAlgebra.toFile().mkdirs();

		final IPath fileJavaAlgebra = directoryAlgebra
				.append(toFirstUpper(packageName) + toFirstUpper(aleName) + elem.getName() + "OperationImpl")
				.addFileExtension("java");

		try {
			final FileWriter fileWriter = new FileWriter(fileJavaAlgebra.toFile());
			fileWriter.write(fileContent);
			fileWriter.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private void generateConcreteAlgebra(final EPackage ePackage, final List<EPackage> dependencies,
			final IProject project, final List<AleClass> allAleClasses, final List<AleClass> aleScope) {
		final String fileContent = new GenerateAlgebra().processConcreteAlgebra(ePackage, dependencies, allAleClasses,
				aleScope);
		final IPath directoryAlgebra = project.getLocation().append("src").append(ePackage.getName()).append("algebra")
				.append("impl");
		directoryAlgebra.toFile().mkdirs();
		final IPath fileJavaAlgebra = directoryAlgebra.append(
				ePackage.getName().substring(0, 1).toUpperCase() + ePackage.getName().substring(1) + "AlgebraImpl")
				.addFileExtension("java");

		try {
			final FileWriter fileWriter = new FileWriter(fileJavaAlgebra.toFile());
			fileWriter.write(fileContent);
			fileWriter.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Generates a ecore file from the dynamic data declared in the implemented
	 * behavior
	 * 
	 * @param projectName
	 * @param resSet
	 * @param resourceSet
	 * @param behaviors
	 * @param rootPackage
	 * @param rootPackage
	 * @param dependencies
	 * @return
	 * 
	 * @throws IOException
	 */
	private void generateDynamicModel(final String projectName, final ResourceSet resSet, final Root modelBehavior,
			final EPackage rootPackage, final XtextResourceSet resourceSet, final EList<Behavior> behaviors,
			final List<EPackage> dependencies) throws IOException {
		final String behaviourName = modelBehavior.getName();
		final Map<ale.xtext.ale.AleClass, List<Field>> clazzList = new HashMap<>();

		for (final EPackage parent : dependencies) {
			final EAnnotation createEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			createEAnnotation.setSource("aleParent");
			createEAnnotation.getDetails().put("uri", parent.getNsURI());
			rootPackage.getEAnnotations().add(createEAnnotation);
		}

		// init the list of classes with all the extended classes
		final List<ale.xtext.ale.AleClass> classExtensions = modelBehavior.getClasses();
		classExtensions.forEach(extendedClass -> {
			final List<Field> attributes = extendedClass.getFields();
			clazzList.put(extendedClass, attributes);
		});

		final Map<ale.xtext.ale.AleClass, EClass> mapClassEClass = new HashMap<>();

		// in a first step we reference all classes
		clazzList.entrySet().stream().forEach(entry -> {
			final ale.xtext.ale.AleClass fromClazz = entry.getKey();
			final EClass clazz = EcoreFactory.eINSTANCE.createEClass();

			final EClass eClazz = this.getClassFromName(fromClazz.getName());
			boolean hasNewFields = hasNewFieldsInHierarchy(clazzList, fromClazz, eClazz);
			if (fromClazz instanceof OpenClass && hasNewFields) {
				// a _Aspect clazz is created is an open class needs to define
				// more fields
				clazz.setName(fromClazz.getName() + "_Aspect");
				

				if (eClazz != null) {
					clazz.getESuperTypes().add(eClazz);
				}

				mapClassEClass.put(fromClazz, clazz);
				rootPackage.getEClassifiers().add(clazz);
			} else if (fromClazz instanceof NewClass) {
				// case of the create
				clazz.setName(fromClazz.getName());

				if (eClazz != null) {
					clazz.getESuperTypes().add(eClazz);
				}

				mapClassEClass.put(fromClazz, clazz);
				rootPackage.getEClassifiers().add(clazz);
			}
		});

		// then we resolve the hierarchy
		clazzList.keySet().stream().forEach(aleClass -> {
			final EClass syntacticClazz = mapClassEClass.get(aleClass);
			final List<EClass> allClasses = new GenerateAlgebra().getListAllClasses(rootPackage, dependencies);
			aleClass.getSuperClass().forEach((final String sc) -> {
				String[] split = sc.split("\\.");
				String splt = split[split.length-1];
				final Stream<String> filter = allClasses.stream()
						.map(x1 -> x1.getName()).filter((final String n) -> splt.equals(n));
				final long count = filter.count();
				System.out.println(count);
				if (count > 0) {
					// if the class have been redefined in ale

					final EClass parent;
					parent = allClasses.stream()
							.filter(x -> x.getName().equals(splt + "_Aspect") || x.getName().equals(splt)).findFirst()
							.get();
					if (syntacticClazz != null) {
						syntacticClazz.getESuperTypes().add(parent);
					}

				}

			});

			final EClass syntacticClass = allClasses.stream().filter(x -> x.getName().equals(aleClass.getName()))
					.findFirst().orElse(null);
			if (syntacticClass != null && syntacticClass.getESuperTypes() != null) {
				for (final EClass superParent : syntacticClass.getESuperTypes()) {
					// if parents of the weave class are themselves
					// weaved, add the to the class parents.
					if (clazzList.keySet().stream().filter(x -> x instanceof OpenClass).map(x1 -> x1.getName())
							.filter(n -> superParent.getName().equals(n)).count() > 0) {
						final EClass superParentEClass = allClasses.stream()
								.filter(x -> x.getName().equals(superParent.getName() + "_Aspect")).findFirst()
								.orElse(null);
						if (superParentEClass != null && syntacticClazz != null) {
							syntacticClazz.getESuperTypes().add(superParentEClass);
						}
					}
				}
			}
		});

		final Map<Field, EReference> solvedRefs = new HashMap<>();

		// then we complet them with the fields
		clazzList.entrySet().stream().forEach(entry -> {
			final EClass clazz = mapClassEClass.get(entry.getKey());
			entry.getValue().stream().forEach(variableDecl -> {

				final ETypedElement typedElem = resolveType(variableDecl.getType(), resourceSet, behaviors, rootPackage,
						dependencies, clazzList);
				if (variableDecl instanceof RefField) {
					final RefField refField = (RefField) variableDecl;
					final EReference createEReference = EcoreFactory.eINSTANCE.createEReference();

					createEReference.setName(refField.getName());
					createEReference.setLowerBound(0);
					createEReference.setUpperBound(refField.getType() instanceof SequenceType ? -1 : 1);
					createEReference.setEType(typedElem.getEType());
					createEReference.setContainment(false);

					solvedRefs.put(variableDecl, createEReference);

					clazz.getEReferences().add(createEReference);

				} else if (variableDecl instanceof ContainmentField) {
					final ContainmentField contField = (ContainmentField) variableDecl;
					final EReference createEReference = EcoreFactory.eINSTANCE.createEReference();

					createEReference.setName(contField.getName());
					createEReference.setLowerBound(0);
					createEReference.setUpperBound(contField.getType() instanceof SequenceType ? -1 : 1);
					createEReference.setEType(typedElem.getEType());
					createEReference.setContainment(true);

					clazz.getEReferences().add(createEReference);
				} else {

					final EClassifier resolveType = typedElem.getEType();
					if (resolveType instanceof EDataType) {
						final EAttribute createEAttribute = EcoreFactory.eINSTANCE.createEAttribute();
						createEAttribute.setName(variableDecl.getName());
						if (variableDecl.getType() instanceof SequenceType) {
							createEAttribute.setEGenericType(typedElem.getEGenericType());
						} else {
							createEAttribute.setEType(resolveType);
						}
						clazz.getEAttributes().add(createEAttribute);
					} else {
						final EReference ref = EcoreFactory.eINSTANCE.createEReference();
						ref.setName(variableDecl.getName());
						ref.setEType(resolveType);
						clazz.getEReferences().add(ref);

					}
				}

			});

		});

		// Resolution of the opposite references
		clazzList.entrySet().stream().forEach(entry -> {
			entry.getValue().stream().forEach(variableDecl -> {
				if (variableDecl instanceof RefField) {
					final RefField refField = (RefField) variableDecl;
					if (refField.getReverse() != null) {

						final EReference createEReference = solvedRefs.get(variableDecl);

						final EReference value = ((EClass) createEReference.getEType()).getEReferences().stream()
								.filter(f -> f.getName().equals(refField.getReverse())).findFirst().orElse(null);

						createEReference.setEOpposite(value);
					}
				}

			});

		});

		final URI createUri = URI.createPlatformResourceURI("/" + projectName + "/src-gen/" + behaviourName + ".ecore",
				true);

		final Resource resource = resSet.createResource(createUri);

		resource.getContents().add(rootPackage);

		resource.save(null);

	}

	private boolean hasNewFieldsInHierarchy(final Map<ale.xtext.ale.AleClass, List<Field>> clazzList,
			final ale.xtext.ale.AleClass fromClazz, final EClass eClazz) {
		long countFieldsInParents;
		if(eClazz != null) {
		EList<EClass> eSuperTypes = eClazz.getESuperTypes();
		Stream<Long> map = eSuperTypes.stream().map((EClass action) -> {
			List<Entry<AleClass,List<Field>>> filter = clazzList.entrySet().stream().filter(ec -> {
				return ec.getKey().getName().equals(action.getName());
			}).collect(Collectors.toList());
			return filter.stream().map(x -> !x.getKey().getFields().isEmpty() ).count();
		});
		
		countFieldsInParents = map.filter(x -> x > 0).count();
		} else {
			countFieldsInParents = 0;
		}
		
		
		boolean b = !fromClazz.getFields().isEmpty() || countFieldsInParents > 0;
		return b;
	}

	private ETypedElement resolveType(final Type type, final XtextResourceSet resourceSet,
			final EList<Behavior> behaviors, final EPackage ePackage, final List<EPackage> dependencies,
			final Map<AleClass, List<Field>> clazzList) {
		if (type == null)
			return null;
		if (type instanceof LiteralType) {
			final LiteralType lt = (LiteralType) type;
			EClassifier primitiveType;
			switch (lt.getLit().toLowerCase()) {
			case "string":
				primitiveType = EcorePackage.eINSTANCE.getEString();
				break;
			case "boolean":
				primitiveType = EcorePackage.eINSTANCE.getEBoolean();
				break;
			case "integer":
				primitiveType = EcorePackage.eINSTANCE.getEInt();
				break;
			case "float":
				primitiveType = EcorePackage.eINSTANCE.getEFloat();
				break;
			case "void":
				primitiveType = null;
				break;
			default:
				primitiveType = null;
				break;
			}
			final EAttribute ret = EcoreFactory.eINSTANCE.createEAttribute();
			ret.setEType(primitiveType);
			return ret;
		}

		if (type instanceof OrderedSetType)
			return null;
		if (type instanceof SequenceType) {
			final SequenceType seqType = (SequenceType) type;
			final EClassifier eType = this
					.resolveType(seqType.getSubType(), resourceSet, behaviors, ePackage, dependencies, clazzList)
					.getEType();
			final EAttribute ret2 = EcoreFactory.eINSTANCE.createEAttribute();
			ret2.setEType(eType);
			return ret2;
		}
		if (type instanceof OutOfScopeType) {
			final String sc = ((OutOfScopeType) type).getExternalClass();
			final long count = clazzList.keySet().stream().map(x1 -> x1.getName()).filter(n -> (sc).equals(n)).count();
			if (count > 0) {
				final List<EClass> allClasses = new GenerateAlgebra().getListAllClasses(ePackage, dependencies);
				final EClass parent = allClasses.stream()
						.filter(x -> x.getName().equals(sc + "_Aspect") || x.getName().equals(sc)).findFirst().get();
				final EAttribute ret = EcoreFactory.eINSTANCE.createEAttribute();
				ret.setEType(parent);
				return ret;
			} else {

				final String externalClass = ((OutOfScopeType) type).getExternalClass();
				final GenerateAlgebra generateAlgebra = new GenerateAlgebra();
				final List<EClass> allClasses = generateAlgebra.getListAllClasses(ePackage, dependencies);
				final Optional<EClass> firstStep = allClasses.stream().filter(c -> c.getName().equals(externalClass))
						.findFirst();
				final EClass eclassType = firstStep.orElseGet(() -> this.syntaxes.stream()
						.flatMap(s -> generateAlgebra.getListAllClasses(s, dependencies).stream()).filter(c -> {
							final String name = c.getName();
							return name.equals(externalClass);
						}).findFirst().orElse(null));
				final EAttribute ret = EcoreFactory.eINSTANCE.createEAttribute();
				ret.setEType(eclassType);
				return ret;
			}
		}
		return null;
	}

	private EClass getClassFromName(final String name) {
		for (final EPackage packagz : this.models) {

			final EClassifier pack = packagz.getEClassifier(name);
			if (pack != null && pack instanceof EClass) {
				return (EClass) pack;
			}
		}
		return null;

	}

	private void generateAlgebraInterface(final EPackage ePackage, final List<EPackage> otherPackages,
			final IProject project, final boolean isRootPackage) {

		final String name = ePackage.getName();
		final IPath directoryAlgebra = project.getLocation().append("src").append(name).append("algebra");
		directoryAlgebra.toFile().mkdirs();
		final IPath fileJavaAlgebra = directoryAlgebra.append(toFirstUpper(name) + "Algebra").addFileExtension("java");

		// generates code only if directly specified in the specification or if
		// needed and does not exists
		if (isRootPackage || !isRootPackage && !fileJavaAlgebra.toFile().exists()) {
			final String fileContent = new GenerateAlgebra().generateAlgebraInterface(ePackage, otherPackages);

			try {
				final FileWriter fileWriter = new FileWriter(fileJavaAlgebra.toFile());
				fileWriter.write(fileContent);
				fileWriter.close();
			} catch (final IOException e) {
				e.printStackTrace();
			}
		}
	}

	private String toFirstUpper(final String string) {
		return string.substring(0, 1).toUpperCase() + string.substring(1);
	}

}
