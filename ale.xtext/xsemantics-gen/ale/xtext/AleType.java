package ale.xtext;

import ale.xtext.ale.AlePackage;
import ale.xtext.ale.BooleanLiteral;
import ale.xtext.ale.DefMethod;
import ale.xtext.ale.Expression;
import ale.xtext.ale.Field;
import ale.xtext.ale.Import;
import ale.xtext.ale.Method;
import ale.xtext.ale.NewClass;
import ale.xtext.ale.OpenClass;
import ale.xtext.ale.OverrideMethod;
import ale.xtext.ale.Root;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Provider;
import it.xsemantics.runtime.ErrorInformation;
import it.xsemantics.runtime.Result;
import it.xsemantics.runtime.RuleApplicationTrace;
import it.xsemantics.runtime.RuleEnvironment;
import it.xsemantics.runtime.RuleFailedException;
import it.xsemantics.runtime.XsemanticsRuntimeSystem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;

@SuppressWarnings("all")
public class AleType extends XsemanticsRuntimeSystem {
  public final static String SUPERCLASSES = "ale.xtext.SuperClasses";
  
  public final static String IMPORTED = "ale.xtext.Imported";
  
  public final static String BOOLEANLITERAL = "ale.xtext.BooleanLiteral";
  
  private PolymorphicDispatcher<Boolean> superClassesDispatcher;
  
  private PolymorphicDispatcher<Boolean> importedDispatcher;
  
  private PolymorphicDispatcher<Result<String>> typeDispatcher;
  
  public AleType() {
    init();
  }
  
  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
    superClassesDispatcher = buildPolymorphicDispatcher(
    	"superClassesImpl", 3);
    importedDispatcher = buildPolymorphicDispatcher(
    	"importedImpl", 3);
  }
  
  public Boolean superClasses(final ale.xtext.ale.Class openClass, final List<ale.xtext.ale.Class> existing) throws RuleFailedException {
    return superClasses(null, openClass, existing);
  }
  
  public Boolean superClasses(final RuleApplicationTrace _trace_, final ale.xtext.ale.Class openClass, final List<ale.xtext.ale.Class> existing) throws RuleFailedException {
    try {
    	return superClassesInternal(_trace_, openClass, existing);
    } catch (Exception _e_superClasses) {
    	throw extractRuleFailedException(_e_superClasses);
    }
  }
  
  public Boolean imported(final Root root, final List<Root> roots) throws RuleFailedException {
    return imported(null, root, roots);
  }
  
  public Boolean imported(final RuleApplicationTrace _trace_, final Root root, final List<Root> roots) throws RuleFailedException {
    try {
    	return importedInternal(_trace_, root, roots);
    } catch (Exception _e_imported) {
    	throw extractRuleFailedException(_e_imported);
    }
  }
  
  public Result<String> type(final Expression expression) {
    return type(new RuleEnvironment(), null, expression);
  }
  
  public Result<String> type(final RuleEnvironment _environment_, final Expression expression) {
    return type(_environment_, null, expression);
  }
  
  public Result<String> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Expression expression) {
    try {
    	return typeInternal(_environment_, _trace_, expression);
    } catch (Exception _e_type) {
    	return resultForFailure(_e_type);
    }
  }
  
  public Result<Boolean> noCyclicOpenClassHierarchy(final OpenClass clazz) {
    return noCyclicOpenClassHierarchy(null, clazz);
  }
  
  public Result<Boolean> noCyclicOpenClassHierarchy(final RuleApplicationTrace _trace_, final OpenClass clazz) {
    try {
    	return noCyclicOpenClassHierarchyInternal(_trace_, clazz);
    } catch (Exception _e_NoCyclicOpenClassHierarchy) {
    	return resultForFailure(_e_NoCyclicOpenClassHierarchy);
    }
  }
  
  protected Result<Boolean> noCyclicOpenClassHierarchyInternal(final RuleApplicationTrace _trace_, final OpenClass clazz) throws RuleFailedException {
    final ArrayList<ale.xtext.ale.Class> ext = CollectionLiterals.<ale.xtext.ale.Class>newArrayList();
    Boolean _superClasses = this.superClassesInternal(_trace_, clazz, ext);
    /* superClasses(clazz, ext) */
    if (!_superClasses) {
      sneakyThrowRuleFailedException("superClasses(clazz, ext)");
    }
    boolean _contains = ext.contains(clazz);
    if (_contains) {
      /* fail error "Cyclic dependency" source clazz feature AlePackage::eINSTANCE.class_SuperClass */
      String error = "Cyclic dependency";
      EObject source = clazz;
      EReference _class_SuperClass = AlePackage.eINSTANCE.getClass_SuperClass();
      EStructuralFeature feature = _class_SuperClass;
      throwForExplicitFail(error, new ErrorInformation(source, feature));
    }
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> defMethodDoesNotAlreadyExists(final DefMethod method) {
    return defMethodDoesNotAlreadyExists(null, method);
  }
  
  public Result<Boolean> defMethodDoesNotAlreadyExists(final RuleApplicationTrace _trace_, final DefMethod method) {
    try {
    	return defMethodDoesNotAlreadyExistsInternal(_trace_, method);
    } catch (Exception _e_defMethodDoesNotAlreadyExists) {
    	return resultForFailure(_e_defMethodDoesNotAlreadyExists);
    }
  }
  
  protected Result<Boolean> defMethodDoesNotAlreadyExistsInternal(final RuleApplicationTrace _trace_, final DefMethod method) throws RuleFailedException {
    final ArrayList<ale.xtext.ale.Class> classes = CollectionLiterals.<ale.xtext.ale.Class>newArrayList();
    EObject _eContainer = method.eContainer();
    Boolean _superClasses = this.superClassesInternal(_trace_, ((ale.xtext.ale.Class) _eContainer), classes);
    /* superClasses(method.eContainer as Class, classes) */
    if (!_superClasses) {
      sneakyThrowRuleFailedException("superClasses(method.eContainer as Class, classes)");
    }
    final Function1<ale.xtext.ale.Class, Boolean> _function = (ale.xtext.ale.Class c) -> {
      EList<Method> _methods = c.getMethods();
      final Function1<Method, Boolean> _function_1 = (Method it) -> {
        String _name = it.getName();
        String _name_1 = method.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      };
      Iterable<Method> _filter = IterableExtensions.<Method>filter(_methods, _function_1);
      boolean _isEmpty = IterableExtensions.isEmpty(_filter);
      return Boolean.valueOf((!_isEmpty));
    };
    Iterable<ale.xtext.ale.Class> _filter = IterableExtensions.<ale.xtext.ale.Class>filter(classes, _function);
    boolean _isEmpty = IterableExtensions.isEmpty(_filter);
    boolean _not = (!_isEmpty);
    if (_not) {
      /* fail error "Method already defined" source method feature AlePackage::eINSTANCE.method_Name */
      String error = "Method already defined";
      EObject source = method;
      EAttribute _method_Name = AlePackage.eINSTANCE.getMethod_Name();
      EStructuralFeature feature = _method_Name;
      throwForExplicitFail(error, new ErrorInformation(source, feature));
    }
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> overrideMethodDoesMustExists(final OverrideMethod method) {
    return overrideMethodDoesMustExists(null, method);
  }
  
  public Result<Boolean> overrideMethodDoesMustExists(final RuleApplicationTrace _trace_, final OverrideMethod method) {
    try {
    	return overrideMethodDoesMustExistsInternal(_trace_, method);
    } catch (Exception _e_overrideMethodDoesMustExists) {
    	return resultForFailure(_e_overrideMethodDoesMustExists);
    }
  }
  
  protected Result<Boolean> overrideMethodDoesMustExistsInternal(final RuleApplicationTrace _trace_, final OverrideMethod method) throws RuleFailedException {
    final ArrayList<ale.xtext.ale.Class> classes = CollectionLiterals.<ale.xtext.ale.Class>newArrayList();
    EObject _eContainer = method.eContainer();
    Boolean _superClasses = this.superClassesInternal(_trace_, ((ale.xtext.ale.Class) _eContainer), classes);
    /* superClasses(method.eContainer as Class, classes) */
    if (!_superClasses) {
      sneakyThrowRuleFailedException("superClasses(method.eContainer as Class, classes)");
    }
    final Function1<ale.xtext.ale.Class, Boolean> _function = (ale.xtext.ale.Class c) -> {
      EList<Method> _methods = c.getMethods();
      final Function1<Method, Boolean> _function_1 = (Method it) -> {
        String _name = it.getName();
        String _name_1 = method.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      };
      Iterable<Method> _filter = IterableExtensions.<Method>filter(_methods, _function_1);
      boolean _isEmpty = IterableExtensions.isEmpty(_filter);
      return Boolean.valueOf((!_isEmpty));
    };
    Iterable<ale.xtext.ale.Class> _filter = IterableExtensions.<ale.xtext.ale.Class>filter(classes, _function);
    boolean _isEmpty = IterableExtensions.isEmpty(_filter);
    if (_isEmpty) {
      /* fail error "Overrided method does not exist in parents" source method feature AlePackage::eINSTANCE.method_Name */
      String error = "Overrided method does not exist in parents";
      EObject source = method;
      EAttribute _method_Name = AlePackage.eINSTANCE.getMethod_Name();
      EStructuralFeature feature = _method_Name;
      throwForExplicitFail(error, new ErrorInformation(source, feature));
    }
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> noCyclicBehaviorImport(final Root root) {
    return noCyclicBehaviorImport(null, root);
  }
  
  public Result<Boolean> noCyclicBehaviorImport(final RuleApplicationTrace _trace_, final Root root) {
    try {
    	return noCyclicBehaviorImportInternal(_trace_, root);
    } catch (Exception _e_NoCyclicBehaviorImport) {
    	return resultForFailure(_e_NoCyclicBehaviorImport);
    }
  }
  
  protected Result<Boolean> noCyclicBehaviorImportInternal(final RuleApplicationTrace _trace_, final Root root) throws RuleFailedException {
    final ArrayList<Root> imports = CollectionLiterals.<Root>newArrayList();
    Boolean _imported = this.importedInternal(_trace_, root, imports);
    /* imported(root, imports) */
    if (!_imported) {
      sneakyThrowRuleFailedException("imported(root, imports)");
    }
    boolean _contains = imports.contains(root);
    if (_contains) {
      /* fail error "Cyclic dependency" source root feature AlePackage::eINSTANCE.root_Name */
      String error = "Cyclic dependency";
      EObject source = root;
      EAttribute _root_Name = AlePackage.eINSTANCE.getRoot_Name();
      EStructuralFeature feature = _root_Name;
      throwForExplicitFail(error, new ErrorInformation(source, feature));
    }
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> noCyclicNewClassHierarchy(final NewClass clazz) {
    return noCyclicNewClassHierarchy(null, clazz);
  }
  
  public Result<Boolean> noCyclicNewClassHierarchy(final RuleApplicationTrace _trace_, final NewClass clazz) {
    try {
    	return noCyclicNewClassHierarchyInternal(_trace_, clazz);
    } catch (Exception _e_NoCyclicNewClassHierarchy) {
    	return resultForFailure(_e_NoCyclicNewClassHierarchy);
    }
  }
  
  protected Result<Boolean> noCyclicNewClassHierarchyInternal(final RuleApplicationTrace _trace_, final NewClass clazz) throws RuleFailedException {
    final ArrayList<ale.xtext.ale.Class> ext = CollectionLiterals.<ale.xtext.ale.Class>newArrayList();
    Boolean _superClasses = this.superClassesInternal(_trace_, clazz, ext);
    /* superClasses(clazz, ext) */
    if (!_superClasses) {
      sneakyThrowRuleFailedException("superClasses(clazz, ext)");
    }
    boolean _contains = ext.contains(clazz);
    if (_contains) {
      /* fail error "Cyclic dependency" source clazz feature AlePackage::eINSTANCE.class_SuperClass */
      String error = "Cyclic dependency";
      EObject source = clazz;
      EReference _class_SuperClass = AlePackage.eINSTANCE.getClass_SuperClass();
      EStructuralFeature feature = _class_SuperClass;
      throwForExplicitFail(error, new ErrorInformation(source, feature));
    }
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> checkClassNames(final Root root) {
    return checkClassNames(null, root);
  }
  
  public Result<Boolean> checkClassNames(final RuleApplicationTrace _trace_, final Root root) {
    try {
    	return checkClassNamesInternal(_trace_, root);
    } catch (Exception _e_CheckClassNames) {
    	return resultForFailure(_e_CheckClassNames);
    }
  }
  
  protected Result<Boolean> checkClassNamesInternal(final RuleApplicationTrace _trace_, final Root root) throws RuleFailedException {
    EList<ale.xtext.ale.Class> _classes = root.getClasses();
    final Function1<ale.xtext.ale.Class, String> _function = (ale.xtext.ale.Class it) -> {
      return it.getName();
    };
    Map<String, List<ale.xtext.ale.Class>> _groupBy = IterableExtensions.<String, ale.xtext.ale.Class>groupBy(_classes, _function);
    final Function2<String, List<ale.xtext.ale.Class>, Boolean> _function_1 = (String p1, List<ale.xtext.ale.Class> p2) -> {
      int _length = ((Object[])Conversions.unwrapArray(p2, Object.class)).length;
      return Boolean.valueOf((_length > 1));
    };
    Map<String, List<ale.xtext.ale.Class>> _filter = MapExtensions.<String, List<ale.xtext.ale.Class>>filter(_groupBy, _function_1);
    Collection<List<ale.xtext.ale.Class>> _values = _filter.values();
    Iterable<ale.xtext.ale.Class> _flatten = Iterables.<ale.xtext.ale.Class>concat(_values);
    for (final ale.xtext.ale.Class x : _flatten) {
      /* fail error "Duplicated name" source x feature AlePackage::eINSTANCE.class_Name */
      String error = "Duplicated name";
      EObject source = x;
      EAttribute _class_Name = AlePackage.eINSTANCE.getClass_Name();
      EStructuralFeature feature = _class_Name;
      throwForExplicitFail(error, new ErrorInformation(source, feature));
    }
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> checkFieldName(final ale.xtext.ale.Class clazz) {
    return checkFieldName(null, clazz);
  }
  
  public Result<Boolean> checkFieldName(final RuleApplicationTrace _trace_, final ale.xtext.ale.Class clazz) {
    try {
    	return checkFieldNameInternal(_trace_, clazz);
    } catch (Exception _e_CheckFieldName) {
    	return resultForFailure(_e_CheckFieldName);
    }
  }
  
  protected Result<Boolean> checkFieldNameInternal(final RuleApplicationTrace _trace_, final ale.xtext.ale.Class clazz) throws RuleFailedException {
    EList<Field> _fields = clazz.getFields();
    final Function1<Field, String> _function = (Field it) -> {
      return it.getName();
    };
    Map<String, List<Field>> _groupBy = IterableExtensions.<String, Field>groupBy(_fields, _function);
    final Function2<String, List<Field>, Boolean> _function_1 = (String p1, List<Field> p2) -> {
      int _length = ((Object[])Conversions.unwrapArray(p2, Object.class)).length;
      return Boolean.valueOf((_length > 1));
    };
    Map<String, List<Field>> _filter = MapExtensions.<String, List<Field>>filter(_groupBy, _function_1);
    Collection<List<Field>> _values = _filter.values();
    Iterable<Field> _flatten = Iterables.<Field>concat(_values);
    for (final Field x : _flatten) {
      /* fail error "Duplicated name" source x feature AlePackage::eINSTANCE.field_Name */
      String error = "Duplicated name";
      EObject source = x;
      EAttribute _field_Name = AlePackage.eINSTANCE.getField_Name();
      EStructuralFeature feature = _field_Name;
      throwForExplicitFail(error, new ErrorInformation(source, feature));
    }
    return new Result<Boolean>(true);
  }
  
  protected Boolean superClassesInternal(final RuleApplicationTrace _trace_, final ale.xtext.ale.Class openClass, final List<ale.xtext.ale.Class> existing) {
    try {
    	checkParamsNotNull(openClass, existing);
    	return superClassesDispatcher.invoke(_trace_, openClass, existing);
    } catch (Exception _e_superClasses) {
    	sneakyThrowRuleFailedException(_e_superClasses);
    	return false;
    }
  }
  
  protected void superClassesThrowException(final String _error, final String _issue, final Exception _ex, final ale.xtext.ale.Class openClass, final List<ale.xtext.ale.Class> existing, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    throwRuleFailedException(_error, _issue, _ex, _errorInformations);
  }
  
  protected Boolean importedInternal(final RuleApplicationTrace _trace_, final Root root, final List<Root> roots) {
    try {
    	checkParamsNotNull(root, roots);
    	return importedDispatcher.invoke(_trace_, root, roots);
    } catch (Exception _e_imported) {
    	sneakyThrowRuleFailedException(_e_imported);
    	return false;
    }
  }
  
  protected void importedThrowException(final String _error, final String _issue, final Exception _ex, final Root root, final List<Root> roots, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    throwRuleFailedException(_error, _issue, _ex, _errorInformations);
  }
  
  protected Result<String> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Expression expression) {
    try {
    	checkParamsNotNull(expression);
    	return typeDispatcher.invoke(_environment_, _trace_, expression);
    } catch (Exception _e_type) {
    	sneakyThrowRuleFailedException(_e_type);
    	return null;
    }
  }
  
  protected void typeThrowException(final String _error, final String _issue, final Exception _ex, final Expression expression, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String error = ("cannot type " + expression);
    EObject source = expression;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(source, null));
  }
  
  protected Boolean superClassesImpl(final RuleApplicationTrace _trace_, final ale.xtext.ale.Class openClass, final List<ale.xtext.ale.Class> existing) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Boolean _result_ = applyAuxFunSuperClasses(_subtrace_, openClass, existing);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return auxFunName("superClasses") + "(" + stringRep(openClass) + ", " + stringRep(existing)+ ")" + " = " + stringRep(_result_);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyAuxFunSuperClasses) {
    	superClassesThrowException(auxFunName("superClasses") + "(" + stringRep(openClass) + ", " + stringRep(existing)+ ")",
    		SUPERCLASSES,
    		e_applyAuxFunSuperClasses, openClass, existing, new ErrorInformation[] {new ErrorInformation(openClass)});
    	return false;
    }
  }
  
  protected Boolean applyAuxFunSuperClasses(final RuleApplicationTrace _trace_, final ale.xtext.ale.Class openClass, final List<ale.xtext.ale.Class> existing) throws RuleFailedException {
    EList<ale.xtext.ale.Class> _superClass = openClass.getSuperClass();
    boolean _notEquals = (!Objects.equal(_superClass, null));
    if (_notEquals) {
      EList<ale.xtext.ale.Class> _superClass_1 = openClass.getSuperClass();
      for (final ale.xtext.ale.Class c : _superClass_1) {
        boolean _contains = existing.contains(c);
        boolean _not = (!_contains);
        if (_not) {
          boolean _add = existing.add(c);
          /* existing.add(c) */
          if (!_add) {
            sneakyThrowRuleFailedException("existing.add(c)");
          }
          /* superClasses(c, existing) */
          if (!this.superClassesInternal(_trace_, c, existing)) {
            sneakyThrowRuleFailedException("superClasses(c, existing)");
          }
        }
      }
    }
    return true;
  }
  
  protected Boolean importedImpl(final RuleApplicationTrace _trace_, final Root root, final List<Root> roots) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Boolean _result_ = applyAuxFunImported(_subtrace_, root, roots);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return auxFunName("imported") + "(" + stringRep(root) + ", " + stringRep(roots)+ ")" + " = " + stringRep(_result_);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyAuxFunImported) {
    	importedThrowException(auxFunName("imported") + "(" + stringRep(root) + ", " + stringRep(roots)+ ")",
    		IMPORTED,
    		e_applyAuxFunImported, root, roots, new ErrorInformation[] {new ErrorInformation(root)});
    	return false;
    }
  }
  
  protected Boolean applyAuxFunImported(final RuleApplicationTrace _trace_, final Root root, final List<Root> roots) throws RuleFailedException {
    EList<Import> _imports = root.getImports();
    boolean _notEquals = (!Objects.equal(_imports, null));
    if (_notEquals) {
      EList<Import> _imports_1 = root.getImports();
      for (final Import i : _imports_1) {
        Root _ref = i.getRef();
        boolean _contains = roots.contains(_ref);
        boolean _not = (!_contains);
        if (_not) {
          Root _ref_1 = i.getRef();
          boolean _add = roots.add(_ref_1);
          /* roots.add(i.ref) */
          if (!_add) {
            sneakyThrowRuleFailedException("roots.add(i.ref)");
          }
          Root _ref_2 = i.getRef();
          /* imported(i.ref, roots) */
          if (!this.importedInternal(_trace_, _ref_2, roots)) {
            sneakyThrowRuleFailedException("imported(i.ref, roots)");
          }
        }
      }
    }
    return true;
  }
  
  protected Result<String> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final BooleanLiteral bool) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<String> _result_ = applyRuleBooleanLiteral(G, _subtrace_, bool);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("BooleanLiteral") + stringRepForEnv(G) + " |- " + stringRep(bool) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleBooleanLiteral) {
    	typeThrowException(ruleName("BooleanLiteral") + stringRepForEnv(G) + " |- " + stringRep(bool) + " : " + "String",
    		BOOLEANLITERAL,
    		e_applyRuleBooleanLiteral, bool, new ErrorInformation[] {new ErrorInformation(bool)});
    	return null;
    }
  }
  
  protected Result<String> applyRuleBooleanLiteral(final RuleEnvironment G, final RuleApplicationTrace _trace_, final BooleanLiteral bool) throws RuleFailedException {
    
    return new Result<String>(_applyRuleBooleanLiteral_1(G, bool));
  }
  
  private String _applyRuleBooleanLiteral_1(final RuleEnvironment G, final BooleanLiteral bool) throws RuleFailedException {
    return "Boolean";
  }
}
