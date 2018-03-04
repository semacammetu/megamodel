/**
 */
package sedml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>list Of Models</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sedml.listOfModels#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see sedml.SedmlPackage#getlistOfModels()
 * @model
 * @generated
 */
public interface listOfModels extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link sedml.model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see sedml.SedmlPackage#getlistOfModels_Model()
	 * @model containment="true"
	 * @generated
	 */
	EList<model> getModel();

} // listOfModels
