/**
 */
package sedml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sedml.SedmlPackage;
import sedml.dataGenerator;
import sedml.listOfVariables;
import sedml.math;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>data Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sedml.impl.dataGeneratorImpl#getId <em>Id</em>}</li>
 *   <li>{@link sedml.impl.dataGeneratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link sedml.impl.dataGeneratorImpl#getListOfVariables <em>List Of Variables</em>}</li>
 *   <li>{@link sedml.impl.dataGeneratorImpl#getMath <em>Math</em>}</li>
 * </ul>
 *
 * @generated
 */
public class dataGeneratorImpl extends MinimalEObjectImpl.Container implements dataGenerator {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListOfVariables() <em>List Of Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfVariables()
	 * @generated
	 * @ordered
	 */
	protected listOfVariables listOfVariables;

	/**
	 * The cached value of the '{@link #getMath() <em>Math</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMath()
	 * @generated
	 * @ordered
	 */
	protected math math;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected dataGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SedmlPackage.Literals.DATA_GENERATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.DATA_GENERATOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.DATA_GENERATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfVariables getListOfVariables() {
		return listOfVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfVariables(listOfVariables newListOfVariables, NotificationChain msgs) {
		listOfVariables oldListOfVariables = listOfVariables;
		listOfVariables = newListOfVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SedmlPackage.DATA_GENERATOR__LIST_OF_VARIABLES, oldListOfVariables, newListOfVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfVariables(listOfVariables newListOfVariables) {
		if (newListOfVariables != listOfVariables) {
			NotificationChain msgs = null;
			if (listOfVariables != null)
				msgs = ((InternalEObject)listOfVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.DATA_GENERATOR__LIST_OF_VARIABLES, null, msgs);
			if (newListOfVariables != null)
				msgs = ((InternalEObject)newListOfVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.DATA_GENERATOR__LIST_OF_VARIABLES, null, msgs);
			msgs = basicSetListOfVariables(newListOfVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.DATA_GENERATOR__LIST_OF_VARIABLES, newListOfVariables, newListOfVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public math getMath() {
		return math;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMath(math newMath, NotificationChain msgs) {
		math oldMath = math;
		math = newMath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SedmlPackage.DATA_GENERATOR__MATH, oldMath, newMath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMath(math newMath) {
		if (newMath != math) {
			NotificationChain msgs = null;
			if (math != null)
				msgs = ((InternalEObject)math).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.DATA_GENERATOR__MATH, null, msgs);
			if (newMath != null)
				msgs = ((InternalEObject)newMath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.DATA_GENERATOR__MATH, null, msgs);
			msgs = basicSetMath(newMath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.DATA_GENERATOR__MATH, newMath, newMath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SedmlPackage.DATA_GENERATOR__LIST_OF_VARIABLES:
				return basicSetListOfVariables(null, msgs);
			case SedmlPackage.DATA_GENERATOR__MATH:
				return basicSetMath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SedmlPackage.DATA_GENERATOR__ID:
				return getId();
			case SedmlPackage.DATA_GENERATOR__NAME:
				return getName();
			case SedmlPackage.DATA_GENERATOR__LIST_OF_VARIABLES:
				return getListOfVariables();
			case SedmlPackage.DATA_GENERATOR__MATH:
				return getMath();
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
			case SedmlPackage.DATA_GENERATOR__ID:
				setId((String)newValue);
				return;
			case SedmlPackage.DATA_GENERATOR__NAME:
				setName((String)newValue);
				return;
			case SedmlPackage.DATA_GENERATOR__LIST_OF_VARIABLES:
				setListOfVariables((listOfVariables)newValue);
				return;
			case SedmlPackage.DATA_GENERATOR__MATH:
				setMath((math)newValue);
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
			case SedmlPackage.DATA_GENERATOR__ID:
				setId(ID_EDEFAULT);
				return;
			case SedmlPackage.DATA_GENERATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SedmlPackage.DATA_GENERATOR__LIST_OF_VARIABLES:
				setListOfVariables((listOfVariables)null);
				return;
			case SedmlPackage.DATA_GENERATOR__MATH:
				setMath((math)null);
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
			case SedmlPackage.DATA_GENERATOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SedmlPackage.DATA_GENERATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SedmlPackage.DATA_GENERATOR__LIST_OF_VARIABLES:
				return listOfVariables != null;
			case SedmlPackage.DATA_GENERATOR__MATH:
				return math != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //dataGeneratorImpl
