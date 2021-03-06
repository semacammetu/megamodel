/**
 */
package sedml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>list Of Tasks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sedml.listOfTasks#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see sedml.SedmlPackage#getlistOfTasks()
 * @model
 * @generated
 */
public interface listOfTasks extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link sedml.task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see sedml.SedmlPackage#getlistOfTasks_Task()
	 * @model containment="true"
	 * @generated
	 */
	EList<task> getTask();

} // listOfTasks
