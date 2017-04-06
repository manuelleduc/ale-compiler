/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.ale;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.VarAssign#getType <em>Type</em>}</li>
 *   <li>{@link ale.xtext.ale.VarAssign#getName <em>Name</em>}</li>
 *   <li>{@link ale.xtext.ale.VarAssign#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ale.xtext.ale.AlePackage#getVarAssign()
 * @model
 * @generated
 */
public interface VarAssign extends Statement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see ale.xtext.ale.AlePackage#getVarAssign_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link ale.xtext.ale.VarAssign#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ale.xtext.ale.AlePackage#getVarAssign_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ale.xtext.ale.VarAssign#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see ale.xtext.ale.AlePackage#getVarAssign_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link ale.xtext.ale.VarAssign#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // VarAssign