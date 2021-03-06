/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.ale.impl;

import ale.xtext.ale.AlePackage;
import ale.xtext.ale.OutOfScopeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Of Scope Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.impl.OutOfScopeTypeImpl#getExternalClass <em>External Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutOfScopeTypeImpl extends TypeImpl implements OutOfScopeType
{
  /**
   * The default value of the '{@link #getExternalClass() <em>External Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalClass()
   * @generated
   * @ordered
   */
  protected static final String EXTERNAL_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExternalClass() <em>External Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalClass()
   * @generated
   * @ordered
   */
  protected String externalClass = EXTERNAL_CLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutOfScopeTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AlePackage.Literals.OUT_OF_SCOPE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExternalClass()
  {
    return externalClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternalClass(String newExternalClass)
  {
    String oldExternalClass = externalClass;
    externalClass = newExternalClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlePackage.OUT_OF_SCOPE_TYPE__EXTERNAL_CLASS, oldExternalClass, externalClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AlePackage.OUT_OF_SCOPE_TYPE__EXTERNAL_CLASS:
        return getExternalClass();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlePackage.OUT_OF_SCOPE_TYPE__EXTERNAL_CLASS:
        setExternalClass((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AlePackage.OUT_OF_SCOPE_TYPE__EXTERNAL_CLASS:
        setExternalClass(EXTERNAL_CLASS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AlePackage.OUT_OF_SCOPE_TYPE__EXTERNAL_CLASS:
        return EXTERNAL_CLASS_EDEFAULT == null ? externalClass != null : !EXTERNAL_CLASS_EDEFAULT.equals(externalClass);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (externalClass: ");
    result.append(externalClass);
    result.append(')');
    return result.toString();
  }

} //OutOfScopeTypeImpl
