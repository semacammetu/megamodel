/**
 */
package sedml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sedml.curve#getId <em>Id</em>}</li>
 *   <li>{@link sedml.curve#getLogX <em>Log X</em>}</li>
 *   <li>{@link sedml.curve#getLogY <em>Log Y</em>}</li>
 *   <li>{@link sedml.curve#getXDataReference <em>XData Reference</em>}</li>
 *   <li>{@link sedml.curve#getYDataReference <em>YData Reference</em>}</li>
 * </ul>
 *
 * @see sedml.SedmlPackage#getcurve()
 * @model
 * @generated
 */
public interface curve extends EObject {
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
	 * @see sedml.SedmlPackage#getcurve_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sedml.curve#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Log X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log X</em>' attribute.
	 * @see #setLogX(String)
	 * @see sedml.SedmlPackage#getcurve_LogX()
	 * @model
	 * @generated
	 */
	String getLogX();

	/**
	 * Sets the value of the '{@link sedml.curve#getLogX <em>Log X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log X</em>' attribute.
	 * @see #getLogX()
	 * @generated
	 */
	void setLogX(String value);

	/**
	 * Returns the value of the '<em><b>Log Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Y</em>' attribute.
	 * @see #setLogY(String)
	 * @see sedml.SedmlPackage#getcurve_LogY()
	 * @model
	 * @generated
	 */
	String getLogY();

	/**
	 * Sets the value of the '{@link sedml.curve#getLogY <em>Log Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Y</em>' attribute.
	 * @see #getLogY()
	 * @generated
	 */
	void setLogY(String value);

	/**
	 * Returns the value of the '<em><b>XData Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XData Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XData Reference</em>' attribute.
	 * @see #setXDataReference(String)
	 * @see sedml.SedmlPackage#getcurve_XDataReference()
	 * @model
	 * @generated
	 */
	String getXDataReference();

	/**
	 * Sets the value of the '{@link sedml.curve#getXDataReference <em>XData Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XData Reference</em>' attribute.
	 * @see #getXDataReference()
	 * @generated
	 */
	void setXDataReference(String value);

	/**
	 * Returns the value of the '<em><b>YData Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YData Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YData Reference</em>' attribute.
	 * @see #setYDataReference(String)
	 * @see sedml.SedmlPackage#getcurve_YDataReference()
	 * @model
	 * @generated
	 */
	String getYDataReference();

	/**
	 * Sets the value of the '{@link sedml.curve#getYDataReference <em>YData Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YData Reference</em>' attribute.
	 * @see #getYDataReference()
	 * @generated
	 */
	void setYDataReference(String value);

} // curve
