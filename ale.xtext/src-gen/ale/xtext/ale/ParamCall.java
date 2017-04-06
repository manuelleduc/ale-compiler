/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.ale;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.ParamCall#getLambda <em>Lambda</em>}</li>
 *   <li>{@link ale.xtext.ale.ParamCall#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see ale.xtext.ale.AlePackage#getParamCall()
 * @model
 * @generated
 */
public interface ParamCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Lambda</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lambda</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lambda</em>' attribute.
   * @see #setLambda(String)
   * @see ale.xtext.ale.AlePackage#getParamCall_Lambda()
   * @model
   * @generated
   */
  String getLambda();

  /**
   * Sets the value of the '{@link ale.xtext.ale.ParamCall#getLambda <em>Lambda</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lambda</em>' attribute.
   * @see #getLambda()
   * @generated
   */
  void setLambda(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see ale.xtext.ale.AlePackage#getParamCall_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link ale.xtext.ale.ParamCall#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // ParamCall
