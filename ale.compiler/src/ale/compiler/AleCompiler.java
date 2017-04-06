package ale.compiler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
import ale.xtext.ale.Field;
import ale.xtext.ale.LiteralType;
import ale.xtext.ale.OpenClass;
import ale.xtext.ale.OrderedSetType;
import ale.xtext.ale.OutOfScopeType;
import ale.xtext.ale.Root;
import ale.xtext.ale.Type;
import dsl.xtext.DslStandaloneSetup;
import dsl.xtext.dsl.Behavior;
import dsl.xtext.dsl.DSL;
import dsl.xtext.dsl.Syntax;
import fr.inria.diverse.objectalgebragenerator.GenerateAlgebra;
import fr.inria.diverse.objectalgebragenerator.Graph;
import fr.inria.diverse.objectalgebragenerator.Graph.GraphNode;

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

	public AleCompiler(final java.net.URI uri) {
		this.dslURI = uri;
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
		genModel.setModelName("MODELNAMETEST");
		genModel.setModelPluginID("ModelPluginIDTest");
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
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI))
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());

		return rs.getPackageRegistry().getEPackage(stx.getValue().replaceAll("\"", ""));
	}

	public void compile(final IProject project) throws IOException {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("dsl", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ale", new XMIResourceFactoryImpl());
		final ResourceSetImpl resSet = new ResourceSetImpl();

		final com.google.inject.Injector injector = new DslStandaloneSetup().createInjectorAndDoEMFRegistration();

		final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		final Resource resource = resourceSet.getResource(URI.createURI(this.dslURI.toString()), true);
		final DSL model = (DSL) resource.getContents().get(0);

		this.syntaxes = model.getSyntaxes().stream().map((final Syntax stx) -> load(stx, resSet))
				.collect(Collectors.toList());

		final EList<Behavior> behaviors = model.getBehaviours();
		this.models = model.getSyntaxes().stream().map(syntax -> {
			if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI))
				EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
			return resSet.getPackageRegistry().getEPackage(syntax.getValue());
		}).collect(Collectors.toList());

		final String fileNameDsl = "executefsm";
		final String projectName = "test";

		final EPackage rootPackage = EcoreFactory.eINSTANCE.createEPackage();
		rootPackage.setName(fileNameDsl.replaceAll("\\.", ""));
		rootPackage.setNsPrefix(fileNameDsl);
		rootPackage.setNsURI("http://" + fileNameDsl);
		final List<Root> roots = behaviors.stream().map(b -> convertBehviorToRoot(resourceSet, b))
				.collect(Collectors.toList());
		for (final Root root : roots) {
			this.generateDynamicModel(projectName, resSet, root, rootPackage, resourceSet, behaviors);
			final GenModel genModel = this.saveGenModel(resSet, root.getName(), rootPackage, projectName);
			this.proceedToGeneration(genModel);

			this.syntaxes.forEach(ePackage -> {
				this.generateAlgebra(ePackage, project);
			});
		}

		this.generateAlgebra(rootPackage, project);

		final List<EClass> listAllClasses = new GenerateAlgebra().getListAllClasses(rootPackage);
		listAllClasses.forEach(clazz -> {
			final ale.xtext.ale.Class openClass = lookupClass(resourceSet, behaviors, clazz.getName());
			new GenerateOperation().generate(clazz, project, fileNameDsl, openClass, rootPackage);
		});

		this.generateConcreteAlgebra(rootPackage, project, fileNameDsl);

		this.generateConcreteOperations(rootPackage, behaviors, project, fileNameDsl, resourceSet);

	}

	private ale.xtext.ale.Class lookupClass(final XtextResourceSet resourceSet, final EList<Behavior> behaviors,
			final String className) {
		final ale.xtext.ale.Class clazz =  behaviors.stream().map(b -> convertBehviorToRoot(resourceSet, b))
				.flatMap(b -> b.getClasses().stream()).filter(b -> {
					final String name2 = b.getName();
					return name2.equals(className);
				}).findFirst().orElse(null);
		return clazz;
	}

	private Root convertBehviorToRoot(final XtextResourceSet resourceSet, final Behavior behavior) {
		final Injector injector2 = new AleStandaloneSetup().createInjectorAndDoEMFRegistration();
		final XtextResourceSet resourceSet2 = injector2.getInstance(XtextResourceSet.class);
		resourceSet2.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		final URI createURI = URI.createURI(behavior.getValue());
		final Resource resource2 = resourceSet.getResource(createURI, true);
		return (Root) resource2.getContents().get(0);
	}

	private void generateConcreteOperations(final EPackage rootPackage, final EList<Behavior> behaviors,
			final IProject project, final String filenameDsl, final XtextResourceSet resourceSet) {
		final Graph<EClass> res = new GenerateAlgebra().buildGraph(rootPackage);
		res.nodes.forEach(entry -> {
			final ale.xtext.ale.Class openClass = lookupClass(resourceSet, behaviors, entry.elem.getName());
			generateConceteOperation(entry, project, rootPackage, filenameDsl, openClass);
		});

	}

	private void generateConceteOperation(final GraphNode<EClass> entry, final IProject project,
			final EPackage ePackage, final String fileNameDsl, final ale.xtext.ale.Class openClass) {
		final String fileContent = new GenerateAlgebra().processConcreteOperation(entry, ePackage, fileNameDsl,
				openClass);
		final IPath directoryAlgebra = project.getLocation().append("src").append(ePackage.getName()).append("algebra")
				.append("impl").append("operation");
		directoryAlgebra.toFile().mkdirs();

		final EClass rootType = entry.elem;
		final String ePackageName = rootType.getEPackage().getName().substring(0, 1).toUpperCase()
				+ rootType.getEPackage().getName().substring(1);
		final String rootTypeName = rootType.getName().substring(0, 1).toUpperCase() + rootType.getName().substring(1);
		// String typeName = entry.getValue()
		final IPath fileJavaAlgebra = directoryAlgebra.append(ePackageName + rootTypeName + "Operation")
				.addFileExtension("java");

		try {
			final FileWriter fileWriter = new FileWriter(fileJavaAlgebra.toFile());
			fileWriter.write(fileContent);
			fileWriter.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private void generateConcreteAlgebra(final EPackage ePackage, final IProject project, final String filenameDsl) {
		final String fileContent = new GenerateAlgebra().processConcreteAlgebra(ePackage, filenameDsl);
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
	 * @return
	 * 
	 * @throws IOException
	 */
	private void generateDynamicModel(final String projectName, final ResourceSet resSet, final Root modelBehavior,
			final EPackage rootPackage, final XtextResourceSet resourceSet, final EList<Behavior> behaviors)
			throws IOException {
		final String behaviourName = modelBehavior.getName();
		final Map<ale.xtext.ale.Class, List<Field>> clazzList = new HashMap<>();

		final List<ale.xtext.ale.Class> classExtensions = modelBehavior.getClasses();
		classExtensions.forEach(extendedClass -> {
			if (!extendedClass.getFields().isEmpty()) {
				final List<Field> attributes = extendedClass.getFields();
				clazzList.put(extendedClass, attributes);
			}
		});

		clazzList.entrySet().stream().forEach(entry -> {
			final ale.xtext.ale.Class fromClazz = entry.getKey();
			final EClass clazz = EcoreFactory.eINSTANCE.createEClass();
			clazz.setName(fromClazz.getName());
			final EClass superClazz = this.getClassFromName(fromClazz.getName());

			if(superClazz != null) {
				clazz.getESuperTypes().add(superClazz);
			}

			entry.getValue().stream().forEach(variableDecl -> {
				final EClassifier resolveType = resolveType(variableDecl.getType(), resourceSet, behaviors,
						rootPackage);
				if (resolveType instanceof EDataType) {

					final EAttribute createEAttribute = EcoreFactory.eINSTANCE.createEAttribute();
					createEAttribute.setName(variableDecl.getName());
					createEAttribute.setEType(resolveType);
					clazz.getEAttributes().add(createEAttribute);
				} else {
					final EReference ref = EcoreFactory.eINSTANCE.createEReference();
					ref.setName(variableDecl.getName());
					ref.setEType(resolveType);
					// ref.setEGenericType(variableDecl.getType().getEGenericType());
					// // attr.setE
					//
					// // TODO : solve why currentState has an error in modeling
					// // workbench
					//
					clazz.getEReferences().add(ref);

				}
			});

			rootPackage.getEClassifiers().add(clazz);
		});

		final URI createUri = URI.createPlatformResourceURI("/" + projectName + "/src-gen/" + behaviourName + ".ecore",
				true);

		final Resource resource = resSet.createResource(createUri);

		resource.getContents().add(rootPackage);

		resource.save(null);

	}

	private EClassifier resolveType(final Type type, final XtextResourceSet resourceSet,
			final EList<Behavior> behaviors, final EPackage ePackage) {
		if (type == null)
			return null;
		if (type instanceof LiteralType) {
			final LiteralType lt = (LiteralType) type;
			switch (lt.getLit().toLowerCase()) {
			case "string":
				return EcorePackage.eINSTANCE.getEString();
			case "boolean":
				return EcorePackage.eINSTANCE.getEBoolean();
			case "byte":
				return EcorePackage.eINSTANCE.getEByte();
			case "char":
				return EcorePackage.eINSTANCE.getEChar();
			case "short":
				return EcorePackage.eINSTANCE.getEShort();
			case "int":
				return EcorePackage.eINSTANCE.getEInt();
			case "long":
				return EcorePackage.eINSTANCE.getELong();
			case "float":
				return EcorePackage.eINSTANCE.getEFloat();
			case "double":
				return EcorePackage.eINSTANCE.getEDouble();
			case "void":
				return null;
			default:
				return null;
			}
		}

		if (type instanceof OrderedSetType)
			return null;
		if (type instanceof OutOfScopeType) {
			final String externalClass = ((OutOfScopeType) type).getExternalClass();
			final ale.xtext.ale.Class res = lookupClass(resourceSet, behaviors, externalClass);
			if (res != null) {
				return res.eClass();
			} else {
				final GenerateAlgebra generateAlgebra = new GenerateAlgebra();
				final List<EClass> allClasses = generateAlgebra.allClasses(ePackage);
				return allClasses.stream().filter(c -> c.getName().equals(externalClass)).findFirst()
						.orElseGet(() -> this.syntaxes.stream().flatMap(s -> generateAlgebra.allClasses(s).stream())
								.filter(c -> c.getName().equals(externalClass)).findFirst().orElse(null));
			}
		}
		/*
		 * 
		 * '''org.eclipse.emf.common.util.EList<«type.subType.solveStaticType»>'
		 * '' if(type instanceof SequenceType) return
		 * '''org.eclipse.emf.common.util.EList<«type.subType.solveStaticType»>'
		 * '' if(type instanceof OutOfScopeType) return type.externalClass //
		 * TODO: resolve the type by scanning classes of the syntax
		 */
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

	private void generateAlgebra(final EPackage ePackage, final IProject project) {
		final String fileContent = new GenerateAlgebra().processAlgebra(ePackage);
		final IPath directoryAlgebra = project.getLocation().append("src").append(ePackage.getName()).append("algebra");
		directoryAlgebra.toFile().mkdirs();
		final IPath fileJavaAlgebra = directoryAlgebra
				.append(ePackage.getName().substring(0, 1).toUpperCase() + ePackage.getName().substring(1) + "Algebra")
				.addFileExtension("java");

		try {
			final FileWriter fileWriter = new FileWriter(fileJavaAlgebra.toFile());
			fileWriter.write(fileContent);
			fileWriter.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

}