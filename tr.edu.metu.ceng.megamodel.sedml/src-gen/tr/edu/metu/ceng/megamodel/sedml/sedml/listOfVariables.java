/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.sedml.sedml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>list Of Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.listOfVariables#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getlistOfVariables()
 * @model
 * @generated
 */
public interface listOfVariables extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getlistOfVariables_Variable()
   * @model containment="true"
   * @generated
   */
  EList<variable> getVariable();

} // listOfVariables