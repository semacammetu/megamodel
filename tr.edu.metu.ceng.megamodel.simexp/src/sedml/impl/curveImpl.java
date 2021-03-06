/**
 */
package sedml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sedml.SedmlPackage;
import sedml.curve;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sedml.impl.curveImpl#getId <em>Id</em>}</li>
 *   <li>{@link sedml.impl.curveImpl#getLogX <em>Log X</em>}</li>
 *   <li>{@link sedml.impl.curveImpl#getLogY <em>Log Y</em>}</li>
 *   <li>{@link sedml.impl.curveImpl#getXDataReference <em>XData Reference</em>}</li>
 *   <li>{@link sedml.impl.curveImpl#getYDataReference <em>YData Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class curveImpl extends MinimalEObjectImpl.Container implements curve {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogX() <em>Log X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogX()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogX() <em>Log X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogX()
	 * @generated
	 * @ordered
	 */
	protected String logX = LOG_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogY() <em>Log Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogY()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogY() <em>Log Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogY()
	 * @generated
	 * @ordered
	 */
	protected String logY = LOG_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getXDataReference() <em>XData Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDataReference()
	 * @generated
	 * @ordered
	 */
	protected static final String XDATA_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXDataReference() <em>XData Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDataReference()
	 * @generated
	 * @ordered
	 */
	protected String xDataReference = XDATA_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYDataReference() <em>YData Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDataReference()
	 * @generated
	 * @ordered
	 */
	protected static final String YDATA_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYDataReference() <em>YData Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDataReference()
	 * @generated
	 * @ordered
	 */
	protected String yDataReference = YDATA_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected curveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SedmlPackage.Literals.CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.CURVE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogX() {
		return logX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogX(String newLogX) {
		String oldLogX = logX;
		logX = newLogX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.CURVE__LOG_X, oldLogX, logX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogY() {
		return logY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogY(String newLogY) {
		String oldLogY = logY;
		logY = newLogY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.CURVE__LOG_Y, oldLogY, logY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXDataReference() {
		return xDataReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDataReference(String newXDataReference) {
		String oldXDataReference = xDataReference;
		xDataReference = newXDataReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.CURVE__XDATA_REFERENCE, oldXDataReference, xDataReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYDataReference() {
		return yDataReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDataReference(String newYDataReference) {
		String oldYDataReference = yDataReference;
		yDataReference = newYDataReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.CURVE__YDATA_REFERENCE, oldYDataReference, yDataReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SedmlPackage.CURVE__ID:
				return getId();
			case SedmlPackage.CURVE__LOG_X:
				return getLogX();
			case SedmlPackage.CURVE__LOG_Y:
				return getLogY();
			case SedmlPackage.CURVE__XDATA_REFERENCE:
				return getXDataReference();
			case SedmlPackage.CURVE__YDATA_REFERENCE:
				return getYDataReference();
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
			case SedmlPackage.CURVE__ID:
				setId((String)newValue);
				return;
			case SedmlPackage.CURVE__LOG_X:
				setLogX((String)newValue);
				return;
			case SedmlPackage.CURVE__LOG_Y:
				setLogY((String)newValue);
				return;
			case SedmlPackage.CURVE__XDATA_REFERENCE:
				setXDataReference((String)newValue);
				return;
			case SedmlPackage.CURVE__YDATA_REFERENCE:
				setYDataReference((String)newValue);
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
			case SedmlPackage.CURVE__ID:
				setId(ID_EDEFAULT);
				return;
			case SedmlPackage.CURVE__LOG_X:
				setLogX(LOG_X_EDEFAULT);
				return;
			case SedmlPackage.CURVE__LOG_Y:
				setLogY(LOG_Y_EDEFAULT);
				return;
			case SedmlPackage.CURVE__XDATA_REFERENCE:
				setXDataReference(XDATA_REFERENCE_EDEFAULT);
				return;
			case SedmlPackage.CURVE__YDATA_REFERENCE:
				setYDataReference(YDATA_REFERENCE_EDEFAULT);
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
			case SedmlPackage.CURVE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SedmlPackage.CURVE__LOG_X:
				return LOG_X_EDEFAULT == null ? logX != null : !LOG_X_EDEFAULT.equals(logX);
			case SedmlPackage.CURVE__LOG_Y:
				return LOG_Y_EDEFAULT == null ? logY != null : !LOG_Y_EDEFAULT.equals(logY);
			case SedmlPackage.CURVE__XDATA_REFERENCE:
				return XDATA_REFERENCE_EDEFAULT == null ? xDataReference != null : !XDATA_REFERENCE_EDEFAULT.equals(xDataReference);
			case SedmlPackage.CURVE__YDATA_REFERENCE:
				return YDATA_REFERENCE_EDEFAULT == null ? yDataReference != null : !YDATA_REFERENCE_EDEFAULT.equals(yDataReference);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", logX: ");
		result.append(logX);
		result.append(", logY: ");
		result.append(logY);
		result.append(", xDataReference: ");
		result.append(xDataReference);
		result.append(", yDataReference: ");
		result.append(yDataReference);
		result.append(')');
		return result.toString();
	}

} //curveImpl
