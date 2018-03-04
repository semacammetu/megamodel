/**
 */
package sedml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>list Of Simulations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sedml.listOfSimulations#getUniformTimeCourse <em>Uniform Time Course</em>}</li>
 * </ul>
 *
 * @see sedml.SedmlPackage#getlistOfSimulations()
 * @model
 * @generated
 */
public interface listOfSimulations extends EObject {
	/**
	 * Returns the value of the '<em><b>Uniform Time Course</b></em>' containment reference list.
	 * The list contents are of type {@link sedml.uniformTimeCourse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uniform Time Course</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uniform Time Course</em>' containment reference list.
	 * @see sedml.SedmlPackage#getlistOfSimulations_UniformTimeCourse()
	 * @model containment="true"
	 * @generated
	 */
	EList<uniformTimeCourse> getUniformTimeCourse();

} // listOfSimulations
