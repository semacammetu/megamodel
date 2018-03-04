/**
 */
package sedml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sedml.SedmlPackage;
import sedml.algorithm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sedml.impl.algorithmImpl#getKisaoID <em>Kisao ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class algorithmImpl extends MinimalEObjectImpl.Container implements algorithm {
	/**
	 * The default value of the '{@link #getKisaoID() <em>Kisao ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKisaoID()
	 * @generated
	 * @ordered
	 */
	protected static final String KISAO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKisaoID() <em>Kisao ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKisaoID()
	 * @generated
	 * @ordered
	 */
	protected String kisaoID = KISAO_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected algorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SedmlPackage.Literals.ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKisaoID() {
		return kisaoID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKisaoID(String newKisaoID) {
		String oldKisaoID = kisaoID;
		kisaoID = newKisaoID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.ALGORITHM__KISAO_ID, oldKisaoID, kisaoID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SedmlPackage.ALGORITHM__KISAO_ID:
				return getKisaoID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SedmlPackage.ALGORITHM__KISAO_ID:
				setKisaoID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SedmlPackage.ALGORITHM__KISAO_ID:
				setKisaoID(KISAO_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SedmlPackage.ALGORITHM__KISAO_ID:
				return KISAO_ID_EDEFAULT == null ? kisaoID != null : !KISAO_ID_EDEFAULT.equals(kisaoID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kisaoID: ");
		result.append(kisaoID);
		result.append(')');
		return result.toString();
	}

} //algorithmImpl
