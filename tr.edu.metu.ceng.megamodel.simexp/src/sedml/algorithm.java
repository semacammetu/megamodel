/**
 */
package sedml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sedml.algorithm#getKisaoID <em>Kisao ID</em>}</li>
 * </ul>
 *
 * @see sedml.SedmlPackage#getalgorithm()
 * @model
 * @generated
 */
public interface algorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Kisao ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kisao ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kisao ID</em>' attribute.
	 * @see #setKisaoID(String)
	 * @see sedml.SedmlPackage#getalgorithm_KisaoID()
	 * @model id="true"
	 * @generated
	 */
	String getKisaoID();

	/**
	 * Sets the value of the '{@link sedml.algorithm#getKisaoID <em>Kisao ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kisao ID</em>' attribute.
	 * @see #getKisaoID()
	 * @generated
	 */
	void setKisaoID(String value);

} // algorithm
