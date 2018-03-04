/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Independent Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.IndependentVariables#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getIndependentVariables()
 * @model
 * @generated
 */
public interface IndependentVariables extends EObject
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.FactorLevels}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getIndependentVariables_Variables()
   * @model containment="true"
   * @generated
   */
  EList<FactorLevels> getVariables();

} // IndependentVariables