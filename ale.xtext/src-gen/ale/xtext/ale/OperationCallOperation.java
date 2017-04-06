/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.ale;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.OperationCallOperation#getName <em>Name</em>}</li>
 *   <li>{@link ale.xtext.ale.OperationCallOperation#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see ale.xtext.ale.AlePackage#getOperationCallOperation()
 * @model
 * @generated
 */
public interface OperationCallOperation extends Expression
{
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
   * @see ale.xtext.ale.AlePackage#getOperationCallOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ale.xtext.ale.OperationCallOperation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link ale.xtext.ale.ParamCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see ale.xtext.ale.AlePackage#getOperationCallOperation_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<ParamCall> getParameters();

} // OperationCallOperation