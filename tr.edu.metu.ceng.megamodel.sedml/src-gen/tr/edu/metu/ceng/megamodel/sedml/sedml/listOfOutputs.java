/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.sedml.sedml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>list Of Outputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.listOfOutputs#getPlot2D <em>Plot2 D</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getlistOfOutputs()
 * @model
 * @generated
 */
public interface listOfOutputs extends EObject
{
  /**
   * Returns the value of the '<em><b>Plot2 D</b></em>' containment reference list.
   * The list contents are of type {@link tr.edu.metu.ceng.megamodel.sedml.sedml.plot2D}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plot2 D</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plot2 D</em>' containment reference list.
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getlistOfOutputs_Plot2D()
   * @model containment="true"
   * @generated
   */
  EList<plot2D> getPlot2D();

} // listOfOutputs
