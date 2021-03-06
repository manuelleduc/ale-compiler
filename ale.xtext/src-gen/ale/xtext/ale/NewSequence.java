/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.ale;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.NewSequence#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ale.xtext.ale.AlePackage#getNewSequence()
 * @model
 * @generated
 */
public interface NewSequence extends Expression
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
   * @see ale.xtext.ale.AlePackage#getNewSequence_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link ale.xtext.ale.NewSequence#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // NewSequence
