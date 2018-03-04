/**
 */
package sedml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>math</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sedml.math#getXlms <em>Xlms</em>}</li>
 * </ul>
 *
 * @see sedml.SedmlPackage#getmath()
 * @model
 * @generated
 */
public interface math extends EObject {
	/**
	 * Returns the value of the '<em><b>Xlms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xlms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xlms</em>' attribute.
	 * @see #setXlms(String)
	 * @see sedml.SedmlPackage#getmath_Xlms()
	 * @model
	 * @generated
	 */
	String getXlms();

	/**
	 * Sets the value of the '{@link sedml.math#getXlms <em>Xlms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xlms</em>' attribute.
	 * @see #getXlms()
	 * @generated
	 */
	void setXlms(String value);

} // math
