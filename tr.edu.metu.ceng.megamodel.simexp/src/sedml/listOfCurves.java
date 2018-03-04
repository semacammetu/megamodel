/**
 */
package sedml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>list Of Curves</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sedml.listOfCurves#getCurve <em>Curve</em>}</li>
 * </ul>
 *
 * @see sedml.SedmlPackage#getlistOfCurves()
 * @model
 * @generated
 */
public interface listOfCurves extends EObject {
	/**
	 * Returns the value of the '<em><b>Curve</b></em>' containment reference list.
	 * The list contents are of type {@link sedml.curve}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve</em>' containment reference list.
	 * @see sedml.SedmlPackage#getlistOfCurves_Curve()
	 * @model containment="true"
	 * @generated
	 */
	EList<curve> getCurve();

} // listOfCurves
