/**
 */
package sedml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>plot2 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sedml.plot2D#getId <em>Id</em>}</li>
 *   <li>{@link sedml.plot2D#getName <em>Name</em>}</li>
 *   <li>{@link sedml.plot2D#getListOfCurves <em>List Of Curves</em>}</li>
 * </ul>
 *
 * @see sedml.SedmlPackage#getplot2D()
 * @model
 * @generated
 */
public interface plot2D extends EObject {
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
	 * @see sedml.SedmlPackage#getplot2D_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sedml.plot2D#getId <em>Id</em>}' attribute.
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
	 * @see sedml.SedmlPackage#getplot2D_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sedml.plot2D#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>List Of Curves</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Of Curves</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Curves</em>' reference.
	 * @see #setListOfCurves(listOfCurves)
	 * @see sedml.SedmlPackage#getplot2D_ListOfCurves()
	 * @model required="true"
	 * @generated
	 */
	listOfCurves getListOfCurves();

	/**
	 * Sets the value of the '{@link sedml.plot2D#getListOfCurves <em>List Of Curves</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Curves</em>' reference.
	 * @see #getListOfCurves()
	 * @generated
	 */
	void setListOfCurves(listOfCurves value);

} // plot2D
