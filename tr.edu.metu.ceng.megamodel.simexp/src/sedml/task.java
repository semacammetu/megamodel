/**
 */
package sedml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sedml.task#getId <em>Id</em>}</li>
 *   <li>{@link sedml.task#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link sedml.task#getSimulationReference <em>Simulation Reference</em>}</li>
 *   <li>{@link sedml.task#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sedml.SedmlPackage#gettask()
 * @model
 * @generated
 */
public interface task extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see sedml.SedmlPackage#gettask_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sedml.task#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Model Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Reference</em>' reference.
	 * @see #setModelReference(model)
	 * @see sedml.SedmlPackage#gettask_ModelReference()
	 * @model required="true"
	 * @generated
	 */
	model getModelReference();

	/**
	 * Sets the value of the '{@link sedml.task#getModelReference <em>Model Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Reference</em>' reference.
	 * @see #getModelReference()
	 * @generated
	 */
	void setModelReference(model value);

	/**
	 * Returns the value of the '<em><b>Simulation Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Reference</em>' reference.
	 * @see #setSimulationReference(uniformTimeCourse)
	 * @see sedml.SedmlPackage#gettask_SimulationReference()
	 * @model required="true"
	 * @generated
	 */
	uniformTimeCourse getSimulationReference();

	/**
	 * Sets the value of the '{@link sedml.task#getSimulationReference <em>Simulation Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Reference</em>' reference.
	 * @see #getSimulationReference()
	 * @generated
	 */
	void setSimulationReference(uniformTimeCourse value);

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
	 * @see sedml.SedmlPackage#gettask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sedml.task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // task
