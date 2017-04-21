package fr.inria.diverse.objectalgebragenerator

import ale.xtext.ale.AddOperation
import ale.xtext.ale.AleClass
import ale.xtext.ale.Block
import ale.xtext.ale.BooleanAndOperation
import ale.xtext.ale.BooleanLiteral
import ale.xtext.ale.BooleanOrOperation
import ale.xtext.ale.BooleanXorOperation
import ale.xtext.ale.ChainedCall
import ale.xtext.ale.ChainedCallArrow
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
import ale.xtext.ale.OADenot
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
import ale.xtext.ale.VarDeclaration
import ale.xtext.ale.NewSequence
import ale.xtext.ale.InstanceofOperation
import ale.xtext.ale.CasttoOperation
import ale.xtext.ale.Method
import ale.xtext.ale.Field
import ale.xtext.ale.OpenClass

class StatementContext {
	public val EPackage ePackage
	public val List<EPackage> dependencies;
	public val AleClass selfAleClass
	public val List<AleClass> aleScope
	public val List<AleClass> allAleClasses
	
	new(EPackage ePackage, List<EPackage> dependencies, AleClass selfAleClass, List<AleClass> aleScope, List<AleClass> allAleClasses) {
		this.ePackage = ePackage
		this.dependencies = dependencies
		this.selfAleClass = selfAleClass
		this.aleScope = aleScope
		this.allAleClasses = allAleClasses
	}
}

class ExpressionContext {
	public val EPackage ePackage
	public val AleClass selfAleClass
	public val List<EPackage> dependencies
	public val List<AleClass> aleScope
	public val List<AleClass> allAleClasses
	
	new(EPackage ePackage, AleClass selfAleClass, List<AleClass> aleScope, List<EPackage> dependencies, List<AleClass> allAleClasses) {
		this.ePackage = ePackage
		this.selfAleClass = selfAleClass
		this.dependencies = dependencies
		this.aleScope = aleScope
		this.allAleClasses = allAleClasses
	}
}

class GenerateAlgebra {

	public def List<EClass> getListAllClasses(EPackage ePackage, List<EPackage> dependencies) {
		val graph = buildGraph(ePackage, dependencies)
		graph.nodes.map[elem].toList
	}

	public def Graph<EClass> buildGraph(EPackage ePackage, List<EPackage> otherPackages) {
		val graph1 = new Graph<EClass>()
		val vp = newHashSet()
		visitPackages(vp, ePackage, graph1)
		if(otherPackages != null) otherPackages.forEach[visitPackages(vp, it, graph1)]
		graph1
	}

	private def Map<String, List<GraphNode<EClass>>> buildAllTypes(List<List<GraphNode<EClass>>> clusters) {
		clusters.toMap(new CharsSequence)
	}

	private def List<List<GraphNode<EClass>>> calculateClusters(Graph<EClass> graphCurrentPackage) {
		graphCurrentPackage.clusters().map[x|x.sortBy[y|y.elem.name]].sortBy[z|z.head.elem.name].toList
	}

	def calculateAllTypes(EPackage ePackage, boolean global) {
		buildConcretTypes(buildAllTypes(calculateClusters(buildGraph(ePackage, null)))).mapValues [ e |
			if(global) e else e.filter[f|f.elem.EPackage.equals(ePackage)]
		].filter[p1, p2|!p2.empty]

	}

	private def String operationInterfacePath(EClass clazz, 
		AleClass aleClazz) {
			val ecoreName = clazz.EPackage.name
			val aleName = if (aleClazz != null) (aleClazz.eContainer as Root).name else "$default"
		'''«ecoreName».«aleName».algebra.operation.«ecoreName.toFirstUpper»«aleName.toFirstUpper»«clazz.name.toFirstUpper»Operation'''
		}
		
		
	private def AleClass resolveCrossRef(String aleClazz, List<AleClass> aleScope, EPackage ePackage) {
		val elems = aleClazz.split("\\.")
		if(elems.size > 1) {
		aleScope.filter[aleS | aleS.name == elems.get(1) && (aleS.eContainer as Root).name == elems.get(0)].head
		} else if(elems.size > 0) {
		aleScope.filter[aleS | aleS.name == elems.get(0) && (aleS.eContainer as Root).name == ePackage.name].head	
		} else {
			null
		}
	}

	def String processConcreteOperation(EClass clazz, EPackage epackage, List<EPackage> dependencies, AleClass behaviorClass, Boolean overloaded, List<AleClass> allAleClasses, List<AleClass> aleScope) {
		val graph = buildGraph(epackage, dependencies)
		
		val packageName = clazz.EPackage.name
		val aleName = if (behaviorClass != null) (behaviorClass.eContainer as Root).name else "$default"
		
		val className= '''«packageName.toFirstUpper»«aleName.toFirstUpper»«clazz.name.toFirstUpper»OperationImpl'''
		
		'''
		package «packageName».«aleName».algebra.impl.operation;
		public class «className» implements «clazz.operationInterfacePath(behaviorClass)» { 
					
					
			private class EListCollector<T> implements java.util.stream.Collector<T, org.eclipse.emf.common.util.EList<T>, org.eclipse.emf.common.util.EList<T>> {
		
				@Override
				public java.util.function.Supplier<org.eclipse.emf.common.util.EList<T>> supplier() {
					return org.eclipse.emf.common.util.BasicEList::new;
				}
		
				@Override
				public java.util.function.BiConsumer<org.eclipse.emf.common.util.EList<T>, T> accumulator() {
					return (a, b) -> a.add(b);
				}
		
				@Override
				public java.util.function.BinaryOperator<org.eclipse.emf.common.util.EList<T>> combiner() {
					return (a, b) -> {
						a.addAll(b);
						return a;
					};
				}
		
				@Override
				public java.util.function.Function<org.eclipse.emf.common.util.EList<T>, org.eclipse.emf.common.util.EList<T>> finisher() {
					return java.util.function.Function.identity();
				}
		
				@Override
				public java.util.Set<java.util.stream.Collector.Characteristics> characteristics() {
					java.util.HashSet<java.util.stream.Collector.Characteristics> hashSet = new java.util.HashSet<>();
					hashSet.add(java.util.stream.Collector.Characteristics.UNORDERED);
					return hashSet;
				}
		
			}
				
			private final «clazz.javaFullPath» self;
			«IF aleName != "$default"»private final «epackage.name».algebra.«epackage.name.toFirstUpper»Algebra«FOR clazzS : graph.nodes.sortBy[x|x.elem.name] BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.elem.operationInterfacePath(clazzS.elem.findAleClass(aleScope, epackage, dependencies))»«ENDFOR» algebra;«ENDIF»
			«FOR sc: behaviorClass.getAllSuperClasses(aleScope, epackage, dependencies, allAleClasses).map[c|c.getEClass(epackage, dependencies)]»
			private final «sc.EPackage.name».«(sc.name.resolveCrossRef(aleScope, epackage).eContainer as Root).name».algebra.impl.operation.«sc.EPackage.name.toFirstUpper»«(sc.name.resolveCrossRef(aleScope, epackage).eContainer as Root).name.toFirstUpper»«sc.name.toFirstUpper»OperationImpl delegate«sc.name.toFirstUpper»;
			«ENDFOR»
			«IF behaviorClass != null && clazz.EPackage.name == (behaviorClass.eContainer as Root).name»
			«FOR sc: behaviorClass.getAllSuperClasses(aleScope, epackage, dependencies, allAleClasses).filter[it instanceof OpenClass].map[c|c.getEClassAspect(epackage, dependencies)]»
			private final «sc.EPackage.name».«(sc.findAleClass(aleScope, epackage, dependencies).eContainer as Root).name».algebra.impl.operation.«sc.EPackage.name.toFirstUpper»«(sc.findAleClass(aleScope, epackage, dependencies).eContainer as Root).name.toFirstUpper»«sc.name.toFirstUpper»OperationImpl delegate«sc.name.toFirstUpper»;
			«ENDFOR»
			«ENDIF»
			
			public «className»(final «clazz.javaFullPath» self, «IF aleName == "$default"»Object«ELSE»final «epackage.name».algebra.«epackage.name.toFirstUpper»Algebra«FOR clazzS : graph.nodes.sortBy[x|x.elem.name] BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.elem.operationInterfacePath(clazzS.elem.findAleClass(aleScope, epackage, dependencies))»«ENDFOR»«ENDIF» algebra) {
				this.self = self;
				«IF aleName != "$default"»this.algebra = algebra;«ENDIF»
				«FOR sc: behaviorClass.getAllSuperClasses(aleScope, epackage, dependencies, allAleClasses).map[c|c.getEClass(epackage, dependencies)]»
				this.delegate«sc.name.toFirstUpper» = new «sc.EPackage.name».«(sc.name.resolveCrossRef(aleScope, epackage).eContainer as Root).name».algebra.impl.operation.«sc.EPackage.name.toFirstUpper»«(sc.name.resolveCrossRef(aleScope, epackage).eContainer as Root).name.toFirstUpper»«sc.name.toFirstUpper»OperationImpl(self, algebra);
				«ENDFOR»
				«IF behaviorClass != null && clazz.EPackage.name == (behaviorClass.eContainer as Root).name»
				«FOR sc: behaviorClass.getAllSuperClasses(aleScope, epackage, dependencies, allAleClasses).filter[it instanceof OpenClass].map[c|c.getEClassAspect(epackage, dependencies)]»
				this.delegate«sc.name.toFirstUpper» = new «sc.EPackage.name».«(sc.findAleClass(aleScope, epackage, dependencies).eContainer as Root).name».algebra.impl.operation.«sc.EPackage.name.toFirstUpper»«(sc.findAleClass(aleScope, epackage, dependencies).eContainer as Root).name.toFirstUpper»«sc.name.toFirstUpper»OperationImpl(self, algebra);
				«ENDFOR»
				«ENDIF»
			}
			
			
			
			
			«IF behaviorClass != null»
			«FOR field:behaviorClass.flattenParentsFields(aleScope, epackage, dependencies, allAleClasses, true)»
			public «field.value.type.solveStaticType(epackage, dependencies)» get«field.value.name.toFirstUpper»() {
				«IF !overloaded»
				«IF field.key == behaviorClass»
«««				return this.self.get«field.value.name.toFirstUpper»();
				«IF field.value.type instanceof LiteralType && (field.value.type as LiteralType).lit == 'Boolean'»
				return this.self.is«field.value.name.toFirstUpper»();
				«ELSE»
				return this.self.get«field.value.name.toFirstUpper»();
				«ENDIF»
				«ELSE»
				return this.delegate«field.key.name.toFirstUpper».get«field.value.name.toFirstUpper»();
				«ENDIF»
				«ELSE»return null;
				«ENDIF»
			}
			«IF !(field.value.type instanceof SequenceType)»
			public void set«field.value.name.toFirstUpper»(«field.value.type.solveStaticType(epackage, dependencies)» «field.value.name») {
				«IF !overloaded»
				«IF field.key == behaviorClass» 
				this.self.set«field.value.name.toFirstUpper»(«field.value.name»);
				«ELSE»
				this.delegate«field.key.name.toFirstUpper».set«field.value.name.toFirstUpper»(«field.value.name»);
				«ENDIF»
				«ENDIF»
			}
			«ENDIF»
			«ENDFOR»
			«FOR method: behaviorClass.flattenParentMethods(aleScope, epackage, dependencies, allAleClasses, true)»
			public «method.value.type.solveStaticType(epackage, dependencies)» «method.value.name»(«FOR p: method.value.params»«p.type.solveStaticType(epackage, dependencies)» «p.name»«ENDFOR») {
 				«IF behaviorClass != null && clazz.mustBeImplemented(epackage, dependencies)»
	 			«method.value.block.printBlock(new StatementContext(epackage, dependencies, behaviorClass, aleScope, allAleClasses))»
	 			«ELSE» 
	 			«IF method.value.type.solveStaticType(epackage, dependencies) != 'void'»return null;
	 			«ENDIF»
	 			«ENDIF»
			}
			«ENDFOR»
			«ENDIF»
		}
		'''

	}
	
	def boolean mustBeImplemented( EClass eClazz, EPackage ePackage, List<EPackage> dependencies) {
		val allClasses = getListAllClasses(ePackage, dependencies);
		(!eClazz.name.endsWith("_Aspect") && !allClasses.exists[c | c.name == eClazz.name + "_Aspect"]) || eClazz.name.endsWith("_Aspect")
	}
	
	
	def List<Pair<AleClass,Field>> flattenParentsFields(AleClass aleClazz, List<AleClass> aleScope, EPackage ePackage, List<EPackage> dependencies, List<AleClass> allAleClasses, boolean includeSelf) {
		val List<Pair<AleClass,Field>> ret = newArrayList()
		if(includeSelf) {
			ret.addAll(aleClazz.fields.map[f | (aleClazz -> f)])
		}
		val listAllParents = aleClazz.getAllSuperClasses(aleScope, ePackage, dependencies, allAleClasses)
		for(AleClass p:listAllParents) {
			for(Field pp: p.fields) {
				if(!(ret.exists[f | f.value.name == pp.name])) {
					ret.add(p -> pp)
				}
			}
		}
		ret
	}
	
	
	def List<AleClass> getIndirectSuperClasses(AleClass aleClazz, EPackage ePackage, List<EPackage> dependencies, List<AleClass> allAleClasses, List<AleClass> aleScope) {
		val ret = newArrayList()
		val classes = this.getListAllClasses(ePackage, dependencies)
		val aspectClass = classes.filter[c | c != null && aleClazz != null && c.name == aleClazz.name+"_Aspect"].head
		val parentClass = 
		if(aspectClass == null) {
			classes.filter[c | c != null && aleClazz != null && c.name == aleClazz.name].head
		} else {
			aspectClass
		}
		if(parentClass != null) {
			for(EClass eClass: parentClass.ancestors) {
				val clazz = eClass.findAleClass(aleScope, ePackage, dependencies)
				if(!ret.contains(clazz)) {
					ret.add(clazz);
				}
			}
		
		}
		return ret
	}
	
	
	def List<AleClass> getAllSuperClasses(AleClass aleClazz, List<AleClass> aleScope, EPackage ePackage, List<EPackage> dependencies, List<AleClass> allAleClasses) {
		val ret = newArrayList()
		if(aleClazz != null && aleClazz.superClass != null) {
			for(AleClass parentz: aleClazz.superClass.map[it.resolveCrossRef(aleScope, ePackage)]) {
				if(!ret.contains(parentz)) {
					ret.add(parentz)
					for(x: parentz.getAllSuperClasses(aleScope, ePackage, dependencies, allAleClasses)) {
						if(!ret.contains(x)) {
							ret.add(x);
						}
					}
				}
			}
		}
		for(AleClass parentAC: aleClazz.getIndirectSuperClasses(ePackage, dependencies, allAleClasses, aleScope).map[it.name.resolveCrossRef(aleScope, ePackage)]) {
			if(!ret.contains(parentAC)) {
				ret.add(parentAC)
				for(x : parentAC.getAllSuperClasses(aleScope, ePackage, dependencies, allAleClasses)) {
					if(!ret.contains(x)) {
						ret.add(x)
					}
				}
			}			
		}
		ret
	}
	
	def List<Pair<AleClass,Method>> flattenParentMethods(AleClass aleClazz, List<AleClass> aleScope, EPackage ePackage, List<EPackage> dependencies, List<AleClass> allAleClasses, boolean includeSelf) {
		val List<Pair<AleClass,Method>> ret = newArrayList()
		if(includeSelf) {
			for(Method sc: aleClazz.methods) {
				ret.add(aleClazz -> sc)
			}
		}
		val listAllParents = aleClazz.getAllSuperClasses(aleScope, ePackage, dependencies, allAleClasses)
		for(AleClass parent: listAllParents) {
			for(Method meth: parent.methods) {
				if(!ret.exists[m | m.value.name == meth.name && m.value.params.size == meth.params.size]) {
					ret.add(parent -> meth)
				} 
			}
		}
		return ret;
	}
	
	def EClass getEClass(AleClass aleClass, EPackage epackage, List<EPackage> dependencies) {
		val classes = this.getListAllClasses(epackage, dependencies)
		val res = classes.filter[c | c.name == aleClass.name].head
		return res;
	}
	
	def EClass getEClassAspect(AleClass aleClass, EPackage epackage, List<EPackage> dependencies) {
		val classes = this.getListAllClasses(epackage, dependencies)
		val res = classes.filter[c | c.name == (aleClass.name + '_Aspect')].head
		return res;
	}
	
	def String printBlock(Block block, StatementContext ctx) '''
	«IF block != null»
	«FOR stmt: block.body»
	«stmt.printStatement(ctx)»
	«ENDFOR»
	«ENDIF»
	'''
	
	
	def dispatch String printExpression(AddOperation addOperation, ExpressionContext ctx) {
		'''«addOperation.left.printExpression(ctx)» + «addOperation.right.printExpression(ctx)»'''
	}
	
	def dispatch String printExpression(BooleanAndOperation booleanAndOperation, ExpressionContext ctx) 
		'''«booleanAndOperation.left.printExpression(ctx)» && «booleanAndOperation.right.printExpression(ctx)»'''
	
	def dispatch String printExpression(BooleanLiteral booleanLit, ExpressionContext ctx) {
		return booleanLit.value
	}
	
	def dispatch String printExpression(BooleanOrOperation exp, ExpressionContext ctx) '''«exp.left.printExpression(ctx)» || «exp.right.printExpression(ctx)»'''
	def dispatch String printExpression(BooleanXorOperation exp, ExpressionContext ctx) '''«exp.left.printExpression(ctx)» ^ «exp.right.printExpression(ctx)»'''
	def dispatch String printExpression(ChainedCall exp, ExpressionContext ctx) {
		val defaultResult = ['''«exp.left.printExpression(ctx)».«exp.right.printExpression(ctx)»'''.toString] 
		if(exp.left instanceof SelfRef) {
			if(exp.right instanceof OperationCallOperation) {
				val opc = exp.right as OperationCallOperation
				val method = ctx.selfAleClass.flattenParentMethods(ctx.aleScope, ctx.ePackage, ctx.dependencies, ctx.allAleClasses, true).filter[it.value.name==opc.name && it.value.params.size == opc.parameters.size].head
				if(method != null) {
					if(method.key == ctx.selfAleClass) '''this.«exp.right.printExpression(ctx)»'''
					else '''this.delegate«method.key.name.toFirstUpper».«exp.right.printExpression(ctx)»'''
				} else {
					// let's look at the fields
					val field = ctx.selfAleClass.flattenParentsFields(ctx.aleScope, ctx.ePackage, ctx.dependencies, ctx.allAleClasses, true).filter[('get'+it.value.name.toFirstUpper) == opc.name ||  ('set'+it.value.name.toFirstUpper) == opc.name].head
					if(field != null) {
						if(field.key == ctx.selfAleClass) '''self.«exp.right.printExpression(ctx)»'''
						else '''this.delegate«field.key.name.toFirstUpper».«exp.right.printExpression(ctx)»'''
					} else {
						defaultResult.apply(null)
					}
				}
			} else {
				defaultResult.apply(null)
			}
			
		} else if(exp.left instanceof SuperRef) {
			if(exp.right instanceof OperationCallOperation) {
				val oco = exp.right as OperationCallOperation
				val unfilteredMethods = ctx.selfAleClass.flattenParentMethods(ctx.aleScope, ctx.ePackage, ctx.dependencies, ctx.allAleClasses, false).toList
				val method = unfilteredMethods.filter[it.value.name==oco.name && it.value.params.size == oco.parameters.size].head
				if(method != null) {
					'''this.delegate«method.key.name.toFirstUpper»«IF method.key instanceof OpenClass && !(method.key as OpenClass).fields.empty»_Aspect«ENDIF».«exp.right.printExpression(ctx)»'''
				} else {
					// let's look at the fields
					val field = ctx.selfAleClass.flattenParentsFields(ctx.aleScope, ctx.ePackage, ctx.dependencies, ctx.allAleClasses, false)
						.filter[('get'+it.value.name.toFirstUpper) == oco.name ||  ('set'+it.value.name.toFirstUpper) == oco.name].head
					if(field != null) {
						'''this.delegate«field.key.name.toFirstUpper».«exp.right.printExpression(ctx)»'''
					} else {
						defaultResult.apply(null)
					}
				}
			} else {
				defaultResult.apply(null)
			}
		} else {
			defaultResult.apply(null)
		}
	}
	def dispatch String printExpression(ChainedCallArrow exp, ExpressionContext ctx) '''«exp.left.printExpression(ctx)».«exp.right.printExpression(ctx)»'''
	def dispatch String printExpression(CompareGEOperation exp, ExpressionContext ctx) '''«exp.left.printExpression(ctx)» >= «exp.right.printExpression(ctx)»'''
	def dispatch String printExpression(CompareGOperation exp, ExpressionContext ctx) '''«exp.left.printExpression(ctx)» > «exp.right.printExpression(ctx)»'''
	
	def dispatch String printExpression(InstanceofOperation exp, ExpressionContext ctx) '''«exp.left.printExpression(ctx)» instanceof «exp.right.printExpression(ctx)»'''
	def dispatch String printExpression(CasttoOperation exp, ExpressionContext ctx) '''((«exp.right.printExpression(ctx)»)«exp.left.printExpression(ctx)»)'''
	
	def dispatch String printExpression(CompareLEOperation exp, ExpressionContext ctx) '''«exp.left.printExpression(ctx)» <= «exp.right.printExpression(ctx)»'''
	def dispatch String printExpression(CompareLOperation exp, ExpressionContext ctx) '''«exp.left.printExpression(ctx)» < «exp.right.printExpression(ctx)»'''
	def dispatch String printExpression(CompareNEOperation exp, ExpressionContext ctx) '''«exp.left.printExpression(ctx)» != «exp.right.printExpression(ctx)»'''
	def dispatch String printExpression(DivOperation exp, ExpressionContext ctx) '''«exp.left.printExpression(ctx)» / «exp.right.printExpression(ctx)»'''
	def dispatch String printExpression(EqualityOperation exp, ExpressionContext ctx) '''java.util.Objects.equals(«exp.left.printExpression(ctx)», «exp.right.printExpression(ctx)»)'''
	def dispatch String printExpression(ImpliesOperation exp, ExpressionContext ctx) '''!«exp.left.printExpression(ctx)» || «exp.right.printExpression(ctx)»'''
	def dispatch String printExpression(IntLiteral exp, ExpressionContext ctx) '''«exp.value»'''
	def dispatch String printExpression(IntRange exp, ExpressionContext ctx) '''__TODO IntRange__'''
	def dispatch String printExpression(MultOperation exp, ExpressionContext ctx) '''«exp.left.printExpression(ctx)» * «exp.right.printExpression(ctx)»'''
	def dispatch String printExpression(NegInfixOperation exp, ExpressionContext ctx) '''-«exp.expression.printExpression(ctx)»'''
	def dispatch String printExpression(NotInfixOperation exp, ExpressionContext ctx) '''!«exp.expression.printExpression(ctx)»'''
	def dispatch String printExpression(NullLiteral exp, ExpressionContext ctx) '''null'''
	def dispatch String printExpression(OperationCallOperation exp, ExpressionContext ctx) {
		if(exp.eContainer instanceof ChainedCallArrow) {
			return switch(exp.name) {
				case 'select': '''stream().filter(«exp.parameters.head.lambda» -> «exp.parameters.head.expression.printExpression(ctx)»).collect(new EListCollector<>())'''
				case  'reject': '''stream().filter(«exp.parameters.head.lambda» -> !(«exp.parameters.head.expression.printExpression(ctx)»)).collect(new EListCollector<>())'''
				case 'collect': '''stream().map(«exp.parameters.head.lambda» -> «exp.parameters.head.expression.printExpression(ctx)»).collect(new EListCollector<>())'''
				case  'any': '''stream().filter(«exp.parameters.head.lambda» -> «exp.parameters.head.expression.printExpression(ctx)»).findAny().orElse(null)''' 
				case 'exists' : '''stream().stream().findAny().map(«exp.parameters.head.lambda» -> «exp.parameters.head.expression.printExpression(ctx)»).orElse(false)'''
				case  'forAll': '''stream().stream().allMatch(«exp.parameters.head.lambda» -> «exp.parameters.head.expression.printExpression(ctx)»)'''
				case 'isUnique' : '''__TODO__'''
				case 'one' : '''__TODO__'''
				case 'sortedBy': '''__TODO__''' 
				case  'closure':'''__TODO__'''
			}
		} else {
			if(exp.name == 'println') exp.name='System.out.println';
			'''«exp.name»(«FOR param: exp.parameters SEPARATOR ',' »«IF param.lambda!= null»«param.lambda» -> «ENDIF»«param.expression.printExpression(ctx)»«ENDFOR»)''' // TODO deal with lambdas !
		}
	}
	def dispatch String printExpression(OrderedSetDecl exp, ExpressionContext ctx) '''__TODO OrderSetDecl__'''
	def dispatch String printExpression(RealLiteral exp, ExpressionContext ctx) '''«exp.value»'''
	def dispatch String printExpression(OADenot exp, ExpressionContext ctx) '''algebra.$(«exp.exp.printExpression(ctx)»)'''
	def dispatch String printExpression(SelfRef exp, ExpressionContext ctx) '''self'''
	def dispatch String printExpression(SequenceDecl exp, ExpressionContext ctx) '''__TODO SequenceDECL__'''
	def dispatch String printExpression(StringLiteral exp, ExpressionContext ctx) '''"«exp.value»"'''
	def dispatch String printExpression(SubOperation exp, ExpressionContext ctx) '''«exp.left.printExpression(ctx)» - «exp.right.printExpression(ctx)»'''
	def dispatch String printExpression(SuperRef exp, ExpressionContext ctx) {
		// TODO: scan parents (so we have to know the context) and call the delegate to the first found class with the lookef for method 
		// so cannot be done without the called methods 
		'''__TODO call super__'''
	} // TODO: has to resolve where to call!!
	def dispatch String printExpression(VarRef exp, ExpressionContext ctx) '''«exp.value»'''
	def dispatch String printExpression(NewSequence exp, ExpressionContext ctx) '''new org.eclipse.emf.common.util.BasicEList<>();'''
	def dispatch String printExpression(ConstructorOperation exp, ExpressionContext ctx) '''«exp.getPackageName(ctx.ePackage)»Factory.eINSTANCE.create«exp.name»()'''
	
	def String getPackageName(ConstructorOperation co, EPackage epackage) {
		val graph = buildGraph(epackage, null)
		var packageName = graph.nodes.filter[e | e.elem.name == co.name].head.elem.EPackage.name
		return '''«packageName».«packageName.toFirstUpper»'''
		
	}
	
	def dispatch String printStatement(Expression expression, StatementContext ctx) '''«expression.printExpression(new ExpressionContext(ctx.ePackage, ctx.selfAleClass, ctx.aleScope, ctx.dependencies, ctx.allAleClasses))»;'''
	
	def dispatch String printStatement(ForLoop forLoop, StatementContext ctx) {
		'''
		for(«forLoop.type.solveStaticType(ctx.ePackage, ctx.dependencies)» «forLoop.name»: «forLoop.collection.printExpression(new ExpressionContext(ctx.ePackage, ctx.selfAleClass, ctx.aleScope, ctx.dependencies, ctx.allAleClasses))») {
			«forLoop.block.printBlock(ctx)»
		}
		'''
	}
	
	def dispatch String printStatement(IfStatement ifStatement, StatementContext ctx) {
		'''if(«ifStatement.condition.printExpression(new ExpressionContext(ctx.ePackage, ctx.selfAleClass, ctx.aleScope, ctx.dependencies, ctx.allAleClasses))») {
			«ifStatement.thenBranch.printBlock(ctx)»
		} «IF ifStatement.elseBranch != null» else {
			«ifStatement.elseBranch.printBlock(ctx)»
		}
		«ENDIF»'''
	}
	
	def dispatch String printStatement(LetStatement letStatement, StatementContext ctx) {
		'''__TODO__'''
	}
	
	def dispatch String printStatement(ReturnStatement returnStatement, StatementContext ctx) {
		'''return «returnStatement.returned.printExpression(new ExpressionContext(ctx.ePackage, ctx.selfAleClass, ctx.aleScope, ctx.dependencies, ctx.allAleClasses))»;'''
	}
	
	def dispatch String printStatement(VarDeclaration varAssign, StatementContext ctx) 
		'''«varAssign.type.solveStaticType(ctx.ePackage, ctx.dependencies)» «varAssign.name» = «varAssign.value.printExpression(new ExpressionContext(ctx.ePackage, ctx.selfAleClass, ctx.aleScope, ctx.dependencies, ctx.allAleClasses))»;'''
		
	def dispatch String printStatement(VarAssign varAssign, StatementContext ctx) 
		'''«varAssign.name» = «varAssign.value.printExpression(new ExpressionContext(ctx.ePackage, ctx.selfAleClass, ctx.aleScope, ctx.dependencies, ctx.allAleClasses))»;'''
	
	
	def dispatch String printStatement(WhileStatement whileStatement, StatementContext ctx) {
		'''
		while(«whileStatement.condition.printExpression(new ExpressionContext(ctx.ePackage, ctx.selfAleClass, ctx.aleScope, ctx.dependencies, ctx.allAleClasses))») {
			«whileStatement.whileBlock.printBlock(ctx)»
		}
		'''
	}
	
	def findAleClass(EClass clazz, List<AleClass> aleScope, EPackage ePackage, List<EPackage> dependencies) {
		
		
//		val lidependencies.map[name].add(ePackage.name)
		val aspectLookup = aleScope.filter[c | c.name == clazz.name + "_Aspect"].head
		if(aspectLookup != null) return aspectLookup
		else return  aleScope.filter[c | c.name == clazz.name].head
//		allClasses.findFirst[ac | ac.name == clazz.name || clazz.name.endsWith("_Aspect") && ac.name == clazz.name.substring(0, clazz.name.length-"_Aspect".length) ]
//	aleScope.filter[]
	}
	
	
	def findNameOrDefault(AleClass clazz) {
		if(clazz != null) {
			(clazz.eContainer as Root).name
		} else {
			"$default"
		}
	}

	def String processConcreteAlgebra(EPackage ePackage, List<EPackage> dependencies, List<AleClass> allAleClasses, List<AleClass> aleScope) {
		/*
		 * Here we have to generate one method per class
		 */
		val graph = buildGraph(ePackage, dependencies)

		'''
			package «ePackage.name».algebra.impl;
			
			public interface «ePackage.name.toFirstUpper»AlgebraImpl extends «ePackage.name».algebra.«ePackage.name.toFirstUpper»Algebra
				«FOR clazz : graph.nodes.sortBy[x|x.elem	.name].map[elem] BEFORE '<' SEPARATOR ',' AFTER '>'»«clazz.operationInterfacePath(clazz.findAleClass(aleScope, ePackage, dependencies))»«ENDFOR» {
				«FOR clazz : graph.nodes.sortBy[elem.name].filter[c|!c.elem.abstract].map[elem]»
					@Override
					default «clazz.operationInterfacePath(clazz.findAleClass(aleScope, ePackage, dependencies))» «clazz.name.toFirstLower»(final «clazz.javaFullPath» «clazz.name.toFirstLower») {
						return new «clazz.EPackage.name».«clazz.findAleClass(aleScope, ePackage, dependencies).findNameOrDefault».algebra.impl.operation.«clazz.EPackage.name.toFirstUpper»«clazz.findAleClass(aleScope, ePackage, dependencies).findNameOrDefault.toFirstUpper»«clazz.name.toFirstUpper»OperationImpl(«clazz.name.toFirstLower», this);
					} 
					«FOR parent: clazz.ancestors»
					@Override
					default «clazz.operationInterfacePath(clazz.findAleClass(aleScope, ePackage, dependencies))» «parent.name.toFirstLower»_«clazz.name.toFirstLower»(final «clazz.javaFullPath» «clazz.name.toFirstLower») {
						return new «clazz.EPackage.name».«clazz.findAleClass(aleScope, ePackage, dependencies).findNameOrDefault».algebra.impl.operation.«clazz.EPackage.name.toFirstUpper»«clazz.findAleClass(aleScope, ePackage, dependencies).findNameOrDefault.toFirstUpper»«clazz.name.toFirstUpper»OperationImpl(«clazz.name.toFirstLower», this);
					} 
					«ENDFOR»
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
		if(ePackage != null) ePackage.eAllContents.filter[e|e instanceof EClass].map[e|e as EClass].toList.sortBy[e|e.name] else newArrayList()
	}
	
	def allClassesRec(EPackage e) {
		val graph = buildGraph(e, null)
		graph.nodes.map[elem].toList.sortBy[name]
	}

	def String genericType(EClass clazz, boolean extend) '''«clazz.EPackage.name.replaceAll("\\.","").toFirstUpper»__«clazz.name»T «IF clazz.ESuperTypes.size == 1 && extend» extends «clazz.ESuperTypes.head.genericType(false)»«ENDIF»'''

	def String generateOperation(EClass clazz, AleClass openClass, EPackage ePackage, List<EPackage> dependencies, List<AleClass> allAleClasses, List<AleClass> aleScope) {

		val packageName = clazz.EPackage.name
		val aleName = if (openClass != null) (openClass.eContainer as Root).name else "$default"

		val clazzName =  '''«packageName.toFirstUpper»«aleName.toFirstUpper»«clazz.name»Operation'''
		 '''
		package «packageName».«aleName».algebra.operation;
		
		public interface «clazzName» «FOR ext : clazz.ESuperTypes BEFORE 'extends ' SEPARATOR ', '»«ext.operationInterfacePath(ext.findAleClass(aleScope, ePackage, dependencies))»«ENDFOR» {
			«IF openClass != null»
				«FOR field:openClass.fields»
				«field.type.solveStaticType(ePackage, dependencies)» get«field.name.toFirstUpper»();
				«IF !(field.type instanceof SequenceType)»
				void set«field.name.toFirstUpper»(«field.type.solveStaticType(ePackage, dependencies)» «field.name»);
				«ENDIF»
				«ENDFOR»
				«FOR method: openClass.methods»
					«method.type.solveStaticType(ePackage, dependencies)» «method.name»(«FOR p: method.params»«p.type.solveStaticType(ePackage, dependencies)» «p.name»«ENDFOR»);
				«ENDFOR»
			«ENDIF»
		}'''
	}

	private def String solveStaticType(Type type, EPackage ePackage, List<EPackage> dependencies) {
		if(type == null) return 'void'
		if (type instanceof LiteralType) return type.lit
		if(type instanceof OrderedSetType) return '''org.eclipse.emf.common.util.EList<«type.subType.solveStaticType(ePackage, dependencies)»>'''
		if(type instanceof SequenceType) return '''org.eclipse.emf.common.util.EList<«type.subType.solveStaticType(ePackage, dependencies)»>'''
		if(type instanceof OutOfScopeType) {
			val  allClasses = buildGraph(ePackage, dependencies).nodes.map[elem];
//			val foundClazz1 = allClasses.filter[c | c.name == type.externalClass + '_Aspect'].head
			val foundClazz = /*if(foundClazz1 != null) foundClazz1 else*/ allClasses.filter[c | c.name == type.externalClass].head
			// TODO: resolve the type by scanning classes of the syntax
			return foundClazz?.javaFullPath.toString 
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

	def static String toJavaType(AleClass clazz) {
		val behavior = clazz.eContainer as Root
		'''«behavior.name».algebra.operation.«behavior.name.toFirstUpper»«clazz.name.toFirstUpper»Operation'''
	}
	
	def Boolean isSuperType(EClass a, EClass b) { // , List<EClass> subTree
		if(a === b) return true;
		b.ESuperTypes
			//.filter[subTree.contains(it)]
			.exists[it == a || a.isSuperType(it)]
	}

	def String generateAlgebraInterface(EPackage ePackage, List<EPackage> otherPackages) {

//		val allEClasses = ePackage.allClasses
		val graph = buildGraph(ePackage, otherPackages)
		val allMethods = graph.nodes.sortBy[e|e.elem.name].filter[e|e.elem.EPackage.equals(ePackage)].filter [ e |
			!e.elem.abstract
		]
		val allDirectPackages = allMethods.allDirectPackages(ePackage)
		if(otherPackages != null) {
			for(op: otherPackages) {
				if(!allDirectPackages.contains(op)) allDirectPackages.add(op)
			}
//			allDirectPackages.addAll(otherPackages)
		}
		
		
		
		val allClasses = this.getListAllClasses(ePackage, otherPackages)
		val classPlusItsChildren = allClasses.map[currentParent | currentParent -> {
			val tmp = allClasses.filter[ac | currentParent.isSuperType(ac)].toList
			tmp.sortWith[o1, o2 |
				if(o1 === o2) 0
				else if(o1.isSuperType(o2)) 1
				else if(o2.isSuperType(o1)) -1
				else 0
			
			].filter[ac | currentParent !== ac && !ac.abstract]
		}]
		
//		val classPlusItsChildren2 = allClasses.map[it -> allClasses.filter[ac | it.isSuperType(ac) && it !== ac && !ac.abstract].sortWith[o1, o2 |
//			if(o1 === o2) 0
//			else if(o1.isSuperType(o2)) 1
//			else if(o2.isSuperType(o1)) -1
//			else 0
//			
//		]]
		
		
		

		'''
			package «ePackage.name».algebra;
			
			public interface «ePackage.toPackageName»«FOR clazz : graph.nodes.sortBy[x|x.elem.name] BEFORE '<' SEPARATOR ',' AFTER '>'»«clazz.elem.genericType(true)»«ENDFOR»
				«FOR ePp : allDirectPackages.sortBy[name] BEFORE ' extends ' SEPARATOR ', '»«ePp.name».algebra.«ePp.toPackageName»«FOR x : ePp.allClassesRec BEFORE '<' SEPARATOR ', ' AFTER '>'»«x.genericType(false)»«ENDFOR»«ENDFOR» {
				«FOR clazzNode : allMethods»
				«clazzNode.elem.genericType(false)» «clazzNode.elem.name.toFirstLower»(final «clazzNode.elem.javaFullPath» «clazzNode.elem.name.toFirstLower»);
				«FOR parent: clazzNode.elem.ancestors»
					«parent.genericType(false)» «parent.name.toFirstLower»_«clazzNode.elem.name.toFirstLower»(final «clazzNode.elem.javaFullPath» «clazzNode.elem.name.toFirstLower»);
				«ENDFOR»
				
				«ENDFOR»
				
				«FOR dollarRoot: classPlusItsChildren»
				default «dollarRoot.key.genericType(false)» $(final «dollarRoot.key.javaFullPath» self) {
					«FOR subClass: dollarRoot.value»
					«IF subClass.ESuperTypes.size == 1»
					if(self instanceof «subClass.javaFullPath») return «subClass.name.toFirstLower»((«subClass.javaFullPath») self);
					«ELSE»
					if(self instanceof «subClass.javaFullPath») return «dollarRoot.key.name.toFirstLower»_«subClass.name.toFirstLower»((«subClass.javaFullPath») self);
					«ENDIF»
					«ENDFOR»
					«IF dollarRoot.key.abstract»
					return null;
					«ELSE»
					return «dollarRoot.key.name.toFirstLower»(self);
					«ENDIF»	
				}
				«ENDFOR»
				
«««				«FOR clazz : sortedCollection»
«««				default «clazz.key.elem.genericType(false)» $(final «clazz.key.elem.javaFullPath» «clazz.key.elem.name.toFirstLower») {
«««					«FOR subClazz:clazz.value.filter[sc|!sc.elem.abstract]»
«««					«IF subClazz.elem.ESuperTypes.size == 1»
«««						if(«clazz.key.elem.name.toFirstLower» instanceof «subClazz.elem.javaFullPath») return «subClazz.elem.name.toFirstLower»((«subClazz.elem.javaFullPath») «clazz.key.elem.name.toFirstLower»);
«««					«ELSE»
«««						if(«clazz.key.elem.name.toFirstLower» instanceof «subClazz.elem.javaFullPath») return «clazz.key.elem.name.toFirstLower»_«subClazz.elem.name.toFirstLower»((«subClazz.elem.javaFullPath») «clazz.key.elem.name.toFirstLower»);
«««					«ENDIF»
«««					«ENDFOR»
«««					«IF clazz.key.elem.abstract»
«««						return null;
«««					«ELSE»
«««						return «clazz.key.elem.name.toFirstLower»(«clazz.key.elem.name.toFirstLower»);
«««					«ENDIF»
«««				}
«««				«ENDFOR»
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
		if(ePackage != null) visitedpackage.add(ePackage)
		val allEClasses = if(ePackage !=null) ePackage.eAllContents.filter[e|e instanceof EClass].map[e|e as EClass].toList.sortBy [ e |
			e.name
		] else newArrayList()
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
