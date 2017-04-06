/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.scoping;

import ale.xtext.ale.AlePackage;
import ale.xtext.ale.Import;
import ale.xtext.ale.NewClass;
import ale.xtext.ale.OpenClass;
import ale.xtext.ale.Root;
import ale.xtext.scoping.AbstractAleScopeProvider;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class AleScopeProvider extends AbstractAleScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if ((context instanceof OpenClass)) {
      EReference _class_SuperClass = AlePackage.eINSTANCE.getClass_SuperClass();
      boolean _equals = Objects.equal(reference, _class_SuperClass);
      if (_equals) {
        final IScope tmp = super.getScope(context, reference);
        EObject _eContainer = ((OpenClass)context).eContainer();
        final Root currentRoot = ((Root) _eContainer);
        EList<Import> _imports = currentRoot.getImports();
        final Function1<Import, EList<ale.xtext.ale.Class>> _function = (Import i) -> {
          Root _ref = i.getRef();
          return _ref.getClasses();
        };
        List<EList<ale.xtext.ale.Class>> _map = ListExtensions.<Import, EList<ale.xtext.ale.Class>>map(_imports, _function);
        Iterable<ale.xtext.ale.Class> _flatten = Iterables.<ale.xtext.ale.Class>concat(_map);
        final Function1<ale.xtext.ale.Class, Boolean> _function_1 = (ale.xtext.ale.Class c) -> {
          return Boolean.valueOf((c instanceof OpenClass));
        };
        final Iterable<ale.xtext.ale.Class> imports = IterableExtensions.<ale.xtext.ale.Class>filter(_flatten, _function_1);
        return Scopes.<ale.xtext.ale.Class>scopeFor(imports, new Function<ale.xtext.ale.Class, QualifiedName>() {
          @Override
          public QualifiedName apply(final ale.xtext.ale.Class t) {
            QualifiedName _xblockexpression = null;
            {
              EList<Import> _imports = currentRoot.getImports();
              final Function1<Import, Boolean> _function = (Import i) -> {
                Root _ref = i.getRef();
                EList<ale.xtext.ale.Class> _classes = _ref.getClasses();
                return Boolean.valueOf(_classes.contains(t));
              };
              Iterable<Import> _filter = IterableExtensions.<Import>filter(_imports, _function);
              Import _head = IterableExtensions.<Import>head(_filter);
              final String n = _head.getName();
              String _name = t.getName();
              _xblockexpression = QualifiedName.create(n, _name);
            }
            return _xblockexpression;
          }
        }, tmp);
      }
    }
    if ((context instanceof NewClass)) {
      EReference _class_SuperClass_1 = AlePackage.eINSTANCE.getClass_SuperClass();
      boolean _equals_1 = Objects.equal(reference, _class_SuperClass_1);
      if (_equals_1) {
        final IScope tmp_1 = super.getScope(context, reference);
        EObject _eContainer_1 = ((NewClass)context).eContainer();
        final Root currentRoot_1 = ((Root) _eContainer_1);
        EList<Import> _imports_1 = currentRoot_1.getImports();
        final Function1<Import, EList<ale.xtext.ale.Class>> _function_2 = (Import i) -> {
          Root _ref = i.getRef();
          return _ref.getClasses();
        };
        List<EList<ale.xtext.ale.Class>> _map_1 = ListExtensions.<Import, EList<ale.xtext.ale.Class>>map(_imports_1, _function_2);
        Iterable<ale.xtext.ale.Class> _flatten_1 = Iterables.<ale.xtext.ale.Class>concat(_map_1);
        final Function1<ale.xtext.ale.Class, Boolean> _function_3 = (ale.xtext.ale.Class c) -> {
          return Boolean.valueOf((c instanceof OpenClass));
        };
        final Iterable<ale.xtext.ale.Class> imports_1 = IterableExtensions.<ale.xtext.ale.Class>filter(_flatten_1, _function_3);
        return Scopes.<ale.xtext.ale.Class>scopeFor(imports_1, new Function<ale.xtext.ale.Class, QualifiedName>() {
          @Override
          public QualifiedName apply(final ale.xtext.ale.Class t) {
            QualifiedName _xblockexpression = null;
            {
              EList<Import> _imports = currentRoot_1.getImports();
              final Function1<Import, Boolean> _function = (Import i) -> {
                Root _ref = i.getRef();
                EList<ale.xtext.ale.Class> _classes = _ref.getClasses();
                return Boolean.valueOf(_classes.contains(t));
              };
              Iterable<Import> _filter = IterableExtensions.<Import>filter(_imports, _function);
              Import _head = IterableExtensions.<Import>head(_filter);
              final String n = _head.getName();
              String _name = t.getName();
              _xblockexpression = QualifiedName.create(n, _name);
            }
            return _xblockexpression;
          }
        }, tmp_1);
      }
    }
    return super.getScope(context, reference);
  }
}
