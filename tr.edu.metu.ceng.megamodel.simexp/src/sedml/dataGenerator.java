/**
 */
package sedml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>data Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sedml.dataGenerator#getId <em>Id</em>}</li>
 *   <li>{@link sedml.dataGenerator#getName <em>Name</em>}</li>
 *   <li>{@link sedml.dataGenerator#getListOfVariables <em>List Of Variables</em>}</li>
 *   <li>{@link sedml.dataGenerator#getMath <em>Math</em>}</li>
 * </ul>
 *
 * @see sedml.SedmlPackage#getdataGenerator()
 * @model
 * @generated
 */
public interface dataGenerator extends EObject {
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
	 * @see sedml.SedmlPackage#getdataGenerator_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sedml.dataGenerator#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see sedml.SedmlPackage#getdataGenerator_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sedml.dataGenerator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>List Of Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Of Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Variables</em>' containment reference.
	 * @see #setListOfVariables(listOfVariables)
	 * @see sedml.SedmlPackage#getdataGenerator_ListOfVariables()
	 * @model containment="true"
	 * @generated
	 */
	listOfVariables getListOfVariables();

	/**
	 * Sets the value of the '{@link sedml.dataGenerator#getListOfVariables <em>List Of Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Variables</em>' containment reference.
	 * @see #getListOfVariables()
	 * @generated
	 */
	void setListOfVariables(listOfVariables value);

	/**
	 * Returns the value of the '<em><b>Math</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Math</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Math</em>' containment reference.
	 * @see #setMath(math)
	 * @see sedml.SedmlPackage#getdataGenerator_Math()
	 * @model containment="true" required="true"
	 * @generated
	 */
	math getMath();

	/**
	 * Sets the value of the '{@link sedml.dataGenerator#getMath <em>Math</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Math</em>' containment reference.
	 * @see #getMath()
	 * @generated
	 */
	void setMath(math value);

} // dataGenerator
