/**
 * generated by Xtext 2.10.0
 */
package dsl.xtext.validation;

import com.google.common.base.Objects;
import dsl.xtext.dsl.DslPackage;
import dsl.xtext.dsl.Syntax;
import dsl.xtext.validation.AbstractDslValidator;
import java.util.Map;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DslValidator extends AbstractDslValidator {
  private String BEHAVIOURS_URI_NOT_FOUND = "behaviours.uri.not.found";
  
  @Check
  public void checkGreetingStartsWithCapital(final Syntax syntax) {
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
    }
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("ecore", _xMIResourceFactoryImpl);
    final ResourceSetImpl rs = new ResourceSetImpl();
    EPackage.Registry _packageRegistry = rs.getPackageRegistry();
    String _value = syntax.getValue();
    EPackage _ePackage = _packageRegistry.getEPackage(_value);
    boolean _equals = Objects.equal(_ePackage, null);
    if (_equals) {
      this.error(
        "Package URI can\'t be resolve", syntax, 
        DslPackage.Literals.SYNTAX__VALUE, 
        this.BEHAVIOURS_URI_NOT_FOUND);
    }
  }
}
