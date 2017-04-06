package fr.inria.diverse.objectalgebragenerator

import ale.xtext.ale.AddOperation
import ale.xtext.ale.Block
import ale.xtext.ale.BooleanAndOperation
import ale.xtext.ale.BooleanLiteral
import ale.xtext.ale.BooleanOrOperation
import ale.xtext.ale.BooleanXorOperation
import ale.xtext.ale.ChainedCall
import ale.xtext.ale.ChainedCallArrow
import ale.xtext.ale.Class
import ale.xtext.ale.CompareGEOperation
import ale.xtext.ale.CompareGOperation
import ale.xtext.ale.CompareLEOperation
import ale.xtext.ale.CompareLOperation
import ale.xtext.ale.CompareNEOperation
import ale.xtext.ale.ConstructorOperation
import ale.xtext.ale.DivOperation
import ale.xtext.ale.EqualityOperation
import ale.xtext.ale.Expression
import ale.xtext.ale.ForLoop
import ale.xtext.ale.IfStatement
import ale.xtext.ale.ImpliesOperation
import ale.xtext.ale.IntLiteral
import ale.xtext.ale.IntRange
import ale.xtext.ale.LetStatement
import ale.xtext.ale.LiteralType
import ale.xtext.ale.MultOperation
import ale.xtext.ale.NegInfixOperation
import ale.xtext.ale.NotInfixOperation
import ale.xtext.ale.NullLiteral
import ale.xtext.ale.OperationCallOperation
import ale.xtext.ale.OrderedSetDecl
import ale.xtext.ale.OrderedSetType
import ale.xtext.ale.OutOfScopeType
import ale.xtext.ale.RealLiteral
import ale.xtext.ale.ReturnStatement
import ale.xtext.ale.Root
import ale.xtext.ale.SelfRef
import ale.xtext.ale.SequenceDecl
import ale.xtext.ale.SequenceType
import ale.xtext.ale.StringLiteral
import ale.xtext.ale.SubOperation
import ale.xtext.ale.SuperRef
import ale.xtext.ale.Type
import ale.xtext.ale.VarAssign
import ale.xtext.ale.VarRef
import ale.xtext.ale.WhileStatement
import fr.inria.diverse.objectalgebragenerator.Graph.GraphNode
import java.util.Collection
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.ETypedElement

class GenerateAlgebra {

	public def List<EClass> getListAllClasses(EPackage ePackage) {
		val graph = buildGraph(ePackage)
		graph.nodes.map[elem].toList
	}

	public def Graph<EClass> buildGraph(EPackage ePackage) {
		val graph1 = new Graph<EClass>()
		visitPackages(newHashSet(), ePackage, graph1)
		graph1
	}

	private def Map<String, List<GraphNode<EClass>>> buildAllTypes(List<List<GraphNode<EClass>>> clusters) {
		clusters.toMap(new CharsSequence)
	}

	private def List<List<GraphNode<EClass>>> calculateClusters(Graph<EClass> graphCurrentPackage) {
		graphCurrentPackage.clusters().map[x|x.sortBy[y|y.elem.name]].sortBy[z|z.head.elem.name].toList
	}

	def calculateAllTypes(EPackage ePackage, boolean global) {
		buildConcretTypes(buildAllTypes(calculateClusters(buildGraph(ePackage)))).mapValues [ e |
			if(global) e else e.filter[f|f.elem.EPackage.equals(ePackage)]
		].filter[p1, p2|!p2.empty]

	}

	private def String operationInterfacePath(EClass clazz,
		String filenameDSL) '''«filenameDSL».algebra.operation.«clazz.EPackage.name».«filenameDSL.toFirstUpper»«clazz.name.toFirstUpper»Operation'''

	def String processConcreteOperation(GraphNode<EClass> entry, EPackage epackage, String filenameDsl, Class behaviorClass) {
		val clazz = entry.elem
		val graph = buildGraph(
			epackage)
		'''
		package «epackage.name».algebra.impl.operation;
		public class «clazz.EPackage.name.toFirstUpper»«clazz.name.toFirstUpper»Operation implements «clazz.operationInterfacePath(filenameDsl)» { 
					
			private final «clazz.javaFullPath» self;
			private final «epackage.name».algebra.«epackage.name.toFirstUpper»Algebra«FOR clazzS : graph.nodes.sortBy[x|x.elem.name] BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.elem.operationInterfacePath(filenameDsl)»«ENDFOR» algebra;
			
			public «clazz.EPackage.name.toFirstUpper»«clazz.name.toFirstUpper»Operation(final «clazz.javaFullPath» self, final «epackage.name».algebra.«epackage.name.toFirstUpper»Algebra«FOR clazzS : graph.nodes.sortBy[x|x.elem.name] BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.elem.operationInterfacePath(filenameDsl)»«ENDFOR» algebra) {
				this.self = self;
				this.algebra = algebra;
			}
			
			
			«IF behaviorClass != null»
			«FOR field:behaviorClass.fields»
			public «field.type.solveStaticType(epackage)» get«field.name.toFirstUpper»() {
				return self.get«field.name.toFirstUpper»();
			}
			public void set«field.name.toFirstUpper»(«field.type.solveStaticType(epackage)» «field.name») {
				self.set«field.name.toFirstUpper»(«field.name»);
			}
			«ENDFOR»
			«FOR method: behaviorClass.methods»
			public «method.type.solveStaticType(epackage)» «method.name»(«FOR p: method.params»«p.type.solveStaticType(epackage)» «p.name»«ENDFOR») {
	 			«method.block.printBlock(epackage)»
			}
			«ENDFOR»
			«ENDIF»
		}
		'''

	}
	
	def String printBlock(Block block, EPackage ePackage) '''
	«FOR stmt: block.body»
	«stmt.printStatement(ePackage)»
	«ENDFOR»
	'''
	
	
	def dispatch String printExpression(AddOperation addOperation) {
		'''«addOperation.left.printExpression» + «addOperation.right.printExpression»'''
	}
	
	def dispatch String printExpression(BooleanAndOperation booleanAndOperation) 
		'''«booleanAndOperation.left.printExpression» && «booleanAndOperation.right.printExpression»'''
	
	def dispatch String printExpression(BooleanLiteral booleanLit) {
		return booleanLit.value
	}
	
	def dispatch String printExpression(BooleanOrOperation exp) '''«exp.left.printExpression» || «exp.right.printExpression»'''
	def dispatch String printExpression(BooleanXorOperation exp) '''«exp.left.printExpression» ^ «exp.right.printExpression»'''
	def dispatch String printExpression(ChainedCall exp) '''«exp.left.printExpression».«exp.right.printExpression»'''
	def dispatch String printExpression(ChainedCallArrow exp) '''«exp.left.printExpression».«exp.right.printExpression»'''
	def dispatch String printExpression(CompareGEOperation exp) '''«exp.left.printExpression» >= «exp.right.printExpression»'''
	def dispatch String printExpression(CompareGOperation exp) '''«exp.left.printExpression» > «exp.right.printExpression»'''
	def dispatch String printExpression(CompareLEOperation exp) '''«exp.left.printExpression» <= «exp.right.printExpression»'''
	def dispatch String printExpression(CompareLOperation exp) '''«exp.left.printExpression» < «exp.right.printExpression»'''
	def dispatch String printExpression(CompareNEOperation exp) '''«exp.left.printExpression» != «exp.right.printExpression»'''
	def dispatch String printExpression(DivOperation exp) '''«exp.left.printExpression» / «exp.right.printExpression»'''
	def dispatch String printExpression(EqualityOperation exp) '''«exp.left.printExpression» == «exp.right.printExpression»'''
	def dispatch String printExpression(ImpliesOperation exp) '''!«exp.left.printExpression» || «exp.right.printExpression»'''
	def dispatch String printExpression(IntLiteral exp) '''«exp.value»'''
	def dispatch String printExpression(IntRange exp) '''__TODO IntRange__'''
	def dispatch String printExpression(MultOperation exp) '''«exp.left.printExpression» * «exp.right.printExpression»'''
	def dispatch String printExpression(NegInfixOperation exp) '''-«exp.expression.printExpression»'''
	def dispatch String printExpression(NotInfixOperation exp) '''!«exp.expression.printExpression»'''
	def dispatch String printExpression(NullLiteral exp) '''null'''
	def dispatch String printExpression(OperationCallOperation exp) {
		if(exp.name == 'println') exp.name='System.out.println';
		'''«exp.name»(«FOR param: exp.parameters SEPARATOR ',' »«IF param.lambda!= null»«param.lambda» -> «ENDIF»«param.expression.printExpression»«ENDFOR»)''' // TODO deal with lambdas !
	}
	def dispatch String printExpression(OrderedSetDecl exp) '''__TODO OrderSetDecl__'''
	def dispatch String printExpression(RealLiteral exp) '''«exp.value»'''
	def dispatch String printExpression(SelfRef exp) '''self''' // TODO: probably more smart than that!! aka delegation
	def dispatch String printExpression(SequenceDecl exp) '''__TODO SequenceDECL__'''
	def dispatch String printExpression(StringLiteral exp) '''"«exp.value»"'''
	def dispatch String printExpression(SubOperation exp) '''«exp.left.printExpression» - «exp.right.printExpression»'''
	def dispatch String printExpression(SuperRef exp) '''__TODO call super__''' // TODO: has to resolve where to call!!
	def dispatch String printExpression(VarRef exp) '''«exp.value»'''
	def dispatch String printExpression(ConstructorOperation exp) '''new XXXFactory.eInstance.create«exp.name»()'''
	def dispatch String printStatement(Expression expression, EPackage ePackage) '''«printExpression(expression)»;'''
	
	def dispatch String printStatement(ForLoop forLoop, EPackage ePackage) {
		'''
		for(«forLoop.type.solveStaticType(ePackage)» «forLoop.name»: «forLoop.collection.printExpression») {
			«forLoop.block.printBlock(ePackage)»
		}
		'''
	}
	
	def dispatch String printStatement(IfStatement ifStatement, EPackage ePackage) {
		'''if(«ifStatement.condition.printExpression») {
			«ifStatement.thenBranch.printBlock(ePackage)»
		} «IF ifStatement.elseBranch != null» else {
			«ifStatement.elseBranch.printBlock(ePackage)»
		}
		«ENDIF»'''
	}
	
	def dispatch String printStatement(LetStatement letStatement, EPackage ePackage) {
		'''__TODO__'''
	}
	
	def dispatch String printStatement(ReturnStatement returnStatement, EPackage ePackage) {
		'''return «returnStatement.returned.printExpression»;'''
	}
	
	def dispatch String printStatement(VarAssign varAssign, EPackage ePackage) 
		'''«varAssign.type.solveStaticType(ePackage)» «varAssign.name» = «varAssign.value.printExpression»;'''
	
	
	def dispatch String printStatement(WhileStatement whileStatement, EPackage ePackage) {
		'''
		while(«whileStatement.condition.printExpression») {
			«whileStatement.whileBlock.printBlock(ePackage)»
		}
		'''
	}

	def String processConcreteAlgebra(EPackage ePackage, String filenameDsl) {

		/*
		 * Here we have to generate one method per class
		 */
		val graph = buildGraph(
			ePackage)

		'''
			package «ePackage.name».algebra.impl;
			
			public interface «ePackage.name.toFirstUpper»AlgebraImpl extends «ePackage.name».algebra.«ePackage.name.toFirstUpper»Algebra«FOR clazz : graph.nodes.sortBy[x|x.elem.name] BEFORE '<' SEPARATOR ',' AFTER '>'»«clazz.elem.operationInterfacePath(filenameDsl)»«ENDFOR» {
				«FOR x : graph.nodes.filter[c|!c.elem.abstract].map[elem]»
					@Override
					default «ePackage.name».algebra.impl.operation.«x.EPackage.name.toFirstUpper»«x.name.toFirstUpper»Operation «x.name.toFirstLower»(final «x.javaFullPath» «x.name.toFirstLower») {
						return new «ePackage.name».algebra.impl.operation.«x.EPackage.name.toFirstUpper»«x.name.toFirstUpper»Operation(«x.name.toFirstLower», this);
					} 
				«ENDFOR»
			}
		'''
	}

	private def Collection<EClass> ancestors(EClass clazz) {
		val ret = newHashSet()
		if (!clazz.ESuperTypes.empty) {
			clazz.ESuperTypes.forEach [ st |
				ret.add(st)
				ret.addAll(st.ancestors)
			]
		}

		ret
	}

	def allClasses(EPackage ePackage) {
		ePackage.eAllContents.filter[e|e instanceof EClass].map[e|e as EClass].toList.sortBy[e|e.name]
	}

	def String genericType(EClass clazz, boolean extend) '''«clazz.EPackage.name.replaceAll("\\.","").toFirstUpper»__«clazz.name»T «IF clazz.ESuperTypes.size == 1 && extend» extends «clazz.ESuperTypes.head.genericType(false)»«ENDIF»'''

	def generateOperation(EClass clazz, String dslName, Class openClass, EPackage ePackage) {

		val clazzName = dslName.toFirstUpper + clazz.name.toFirstUpper +
			"Operation";
		val fileContent = '''
		package «dslName».algebra.operation.«clazz.EPackage.name»;
		
		public interface «clazzName» «FOR ext : clazz.ESuperTypes BEFORE 'extends ' SEPARATOR ', '»«dslName».algebra.operation.«ext.EPackage.name».«dslName.toFirstUpper»«ext.name.toFirstUpper»Operation«ENDFOR» {
			«IF openClass != null»
				«FOR field:openClass.fields»
				«field.type.solveStaticType(ePackage)» get«field.name.toFirstUpper»();
				void set«field.name.toFirstUpper»(«field.type.solveStaticType(ePackage)» «field.name»);
				«ENDFOR»
				«FOR method: openClass.methods»
					«method.type.solveStaticType(ePackage)» «method.name»(«FOR p: method.params»«p.type.solveStaticType(ePackage)» «p.name»«ENDFOR»);
				«ENDFOR»
			«ENDIF»
		}'''

		fileContent
	}

	private def String solveStaticType(Type type, EPackage ePackage) {
		if(type == null) return 'void'
		if (type instanceof LiteralType) return type.lit
		if(type instanceof OrderedSetType) return '''org.eclipse.emf.common.util.EList<«type.subType.solveStaticType(ePackage)»>'''
		if(type instanceof SequenceType) return '''org.eclipse.emf.common.util.EList<«type.subType.solveStaticType(ePackage)»>'''
		if(type instanceof OutOfScopeType) {
			val  allClasses = buildGraph(ePackage).nodes.map[elem];
			val foundClazz = allClasses.filter[c | c.name == type.externalClass].head
			return foundClazz?.javaFullPath.toString // TODO: resolve the type by scanning classes of the syntax
		}
	}

	def static String toJavaType(ETypedElement opp) {
		if (opp.EGenericType != null) {
			val type = opp.
				EType
			return '''«type.instanceClassName»«FOR t : opp.EGenericType.ETypeArguments BEFORE '<' SEPARATOR ', ' AFTER '>'»«t.EClassifier.instanceClassName»«ENDFOR»'''
		} else {
			return '''«opp.EType.instanceClassName»'''
		}
	}

	def static String toJavaType(Class clazz) {
		val behavior = clazz.eContainer as Root
		'''«behavior.name».algebra.operation.«behavior.name.toFirstUpper»«clazz.name.toFirstUpper»Operation'''
	}

	def String processAlgebra(EPackage ePackage) {

//		val allEClasses = ePackage.allClasses
		val graph = buildGraph(ePackage)
		val allMethods = graph.nodes.sortBy[e|e.elem.name].filter[e|e.elem.EPackage.equals(ePackage)].filter [ e |
			!e.elem.abstract
		]
		val allDirectPackages = allMethods.allDirectPackages(
			ePackage)

		'''
			package «ePackage.name».algebra;
			
			public interface «ePackage.toPackageName»«FOR clazz : graph.nodes.sortBy[x|x.elem.name] BEFORE '<' SEPARATOR ',' AFTER '>'»«clazz.elem.genericType(true)»«ENDFOR»
				«FOR ePp : allDirectPackages.sortBy[name] BEFORE ' extends ' SEPARATOR ', '»«ePp.name».algebra.«ePp.toPackageName»«FOR x : ePp.allClasses BEFORE '<' SEPARATOR ', ' AFTER '>'»«x.genericType(false)»«ENDFOR»«ENDFOR» {
				«FOR clazzNode : allMethods»
				«clazzNode.elem.genericType(false)» «clazzNode.elem.name.toFirstLower»(final «clazzNode.elem.javaFullPath» «clazzNode.elem.name.toFirstLower»);
				«FOR parent: clazzNode.elem.ancestors»
					«parent.genericType(false)» «parent.name.toFirstLower»_«clazzNode.elem.name.toFirstLower»(final «clazzNode.elem.javaFullPath» «clazzNode.elem.name.toFirstLower»);
				«ENDFOR»
				
				«ENDFOR»
				
				«FOR clazz : graph.nodes»
				default «clazz.elem.genericType(false)» $(final «clazz.elem.javaFullPath» «clazz.elem.name.toFirstLower») {
					«FOR subClazz:clazz.incomings.filter[sc|!sc.elem.abstract]»
					«IF clazz.elem.ESuperTypes.size == 1»
						if(«clazz.elem.name.toFirstLower» instanceof «subClazz.elem.javaFullPath») return «subClazz.elem.name.toFirstLower»((«subClazz.elem.javaFullPath») «clazz.elem.name.toFirstLower»);
					«ELSE»
						if(«clazz.elem.name.toFirstLower» instanceof «subClazz.elem.javaFullPath») return «clazz.elem.name.toFirstLower»_«subClazz.elem.name.toFirstLower»((«subClazz.elem.javaFullPath») «clazz.elem.name.toFirstLower»);
					«ENDIF»
					«ENDFOR»
					«IF clazz.elem.abstract»
						return null;
					«ELSE»
						return «clazz.elem.name.toFirstLower»(«clazz.elem.name.toFirstLower»);
					«ENDIF»
				}
				«ENDFOR»
			}
		'''
	}

	private def buildConcretTypes(Map<String, List<GraphNode<EClass>>> allTypes) {
		allTypes.mapValues[x|x.filter[y|!y.elem.abstract]].filter[p1, p2|!p2.empty]
	}

	private def List<EPackage> allDirectPackages(Iterable<GraphNode<EClass>> nodes, EPackage ePackage) {
		val allDirectPackagesByInheritance = nodes.getDirectPackageByInheritance(ePackage)

		val allDirectPackageByReference = nodes.getAllDirectPackagesByReference(ePackage)

		allDirectPackagesByInheritance.addAll(allDirectPackageByReference)
		allDirectPackagesByInheritance.sortBy[name]
	}

	private def Set<EPackage> getAllDirectPackagesByReference(Iterable<GraphNode<EClass>> nodes, EPackage ePackage) {
		nodes.map[e|e.elem.EReferences].map[e|e.directlyRelatedTypes].flatten.map[e|e.EPackage].filter [ e |
			!e.equals(ePackage)
		].toSet
	}

	private def Set<EPackage> getDirectPackageByInheritance(Iterable<GraphNode<EClass>> nodes, EPackage ePackage) {
		nodes.map[e|e.outgoing].flatten.map[e|e.elem.EPackage].filter [ e |
			!e.equals(ePackage)
		].toSet
	}

	private def String toTryCatch(Iterable<EPackage> packages, String typeVarName) {
		'''
			«IF packages.size == 1»
				ret = «packages.head.name».algebra.«packages.head.toPackageName».super.$(«typeVarName»);
			«ELSE»
				try {
					ret = «packages.head.toPackageName».super.$(«typeVarName»);
				} catch(RuntimeException e) {
					«toTryCatch(packages.tail, typeVarName)»
				}
			«ENDIF»
		'''
	}

	public def static EClass getFindRootType(Iterable<GraphNode<EClass>> nodes) {
		val roots = nodes.map[roots].flatten.toSet
		if (roots.size >
			1) {
			throw new RuntimeException('''A classes cluster can't have more than one roots. We find a cluster composed of those roots: «FOR node : roots SEPARATOR ', '»«node.elem.EPackage.name».«node.elem.name»«ENDFOR»''')
		} else {
			roots.head.elem
		}
	}

	private def Iterable<GraphNode<EClass>> getListTypesRec(HashSet<EPackage> visited, EPackage ePackage,
		Graph<EClass> graph, Map<String, List<GraphNode<EClass>>> allTypes) {
		if (!visited.contains(ePackage)) {
			visited.add(ePackage)
			val List<GraphNode<EClass>> relatedToCurrentPackage = graph.nodes.sortBy[e|e.elem.name].filter [ e |
				e.elem.EPackage.equals(ePackage) || e.children.exists[f|f.elem.EPackage.equals(ePackage)] ||
					e.elem.EReferences.directlyRelatedTypes.exists[v|v.EPackage.equals(ePackage)]
			].toList

			val List<EPackage> letgo = relatedToCurrentPackage.allDirectPackages(ePackage)
			letgo.forEach [ n |
				relatedToCurrentPackage.addAll(getListTypesRec(visited, n, graph, allTypes))
			]

			relatedToCurrentPackage

		} else {
			newArrayList()
		}
	}

	private def void visitPackages(HashSet<EPackage> visitedpackage, EPackage ePackage, Graph<EClass> graph1) {
		visitedpackage.add(ePackage)
		val allEClasses = ePackage.eAllContents.filter[e|e instanceof EClass].map[e|e as EClass].toList.sortBy [ e |
			e.name
		]
		allEClasses.forEach[e|addParents(graph1, e)]
		allEClasses.forEach[e|e.EReferences.directlyRelatedTypes.forEach[f|addParents(graph1, f)]]

		val notYetVisited = graph1.nodes.sortBy[e|e.elem.name].map[e|e.elem.EPackage].toSet.filter [ e |
			!visitedpackage.contains(e)
		]
		notYetVisited.forEach [ e |
			visitPackages(visitedpackage, e, graph1)
		]
	}

	private def List<EClass> getDirectlyRelatedTypes(EList<EReference> list) {
		list.map[f|f.EType].filter[z|z instanceof EClass].map[q|q as EClass].filter [ x |
			!x.EPackage.name.equals("ecore")
		].toList
	}

	private def void addParents(Graph<EClass> graph1, EClass e) {
		// println('''# Add class «e.name»''')
		val node = graph1.addNode(e)
		e.ESuperTypes.forEach [ f |
			val node2 = graph1.addNode(f)
			if (!e.root) {
				graph1.addEdge(node, node2)
			}
			addParents(graph1, f)
		]
	}

	/**
	 * A root element is an element with no super type or explicitly defined with @OARoot.
	 */
	private def static boolean isRoot(EClass eClass) {
		eClass.ESuperTypes.empty // || eClass.hasOARootAnnotation
	}

	private def static EClass findRootParent(EClass eClass) {
		if(eClass.isRoot) eClass else findRootParent(eClass.ESuperTypes.head)
	}

	private def static String toClassName(String name) {
		name.split("\\.").map[e|e.toFirstUpper].join
	}

	private def static toPackageName(EPackage ePackage) '''«ePackage.name.toClassName»Algebra'''

	private def static javaFullPath(EClass eClass) {
		'''«eClass.EPackage.name».«eClass.name»'''
	}

//		private def static operationFullPath(EClass eClass,
//			EPackage rootPackage) '''«rootPackage.name».algebra.operation.«rootPackage.name.toFirstUpper»«eClass.name»Operation'''
}
