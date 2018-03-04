/**
 */
package sedml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sedml.SedmlPackage;
import sedml.model;
import sedml.task;
import sedml.uniformTimeCourse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sedml.impl.taskImpl#getId <em>Id</em>}</li>
 *   <li>{@link sedml.impl.taskImpl#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link sedml.impl.taskImpl#getSimulationReference <em>Simulation Reference</em>}</li>
 *   <li>{@link sedml.impl.taskImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class taskImpl extends MinimalEObjectImpl.Container implements task {
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
	 * The cached value of the '{@link #getModelReference() <em>Model Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelReference()
	 * @generated
	 * @ordered
	 */
	protected model modelReference;

	/**
	 * The cached value of the '{@link #getSimulationReference() <em>Simulation Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationReference()
	 * @generated
	 * @ordered
	 */
	protected uniformTimeCourse simulationReference;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected taskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SedmlPackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.TASK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public model getModelReference() {
		if (modelReference != null && modelReference.eIsProxy()) {
			InternalEObject oldModelReference = (InternalEObject)modelReference;
			modelReference = (model)eResolveProxy(oldModelReference);
			if (modelReference != oldModelReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SedmlPackage.TASK__MODEL_REFERENCE, oldModelReference, modelReference));
			}
		}
		return modelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public model basicGetModelReference() {
		return modelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelReference(model newModelReference) {
		model oldModelReference = modelReference;
		modelReference = newModelReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.TASK__MODEL_REFERENCE, oldModelReference, modelReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uniformTimeCourse getSimulationReference() {
		if (simulationReference != null && simulationReference.eIsProxy()) {
			InternalEObject oldSimulationReference = (InternalEObject)simulationReference;
			simulationReference = (uniformTimeCourse)eResolveProxy(oldSimulationReference);
			if (simulationReference != oldSimulationReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SedmlPackage.TASK__SIMULATION_REFERENCE, oldSimulationReference, simulationReference));
			}
		}
		return simulationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uniformTimeCourse basicGetSimulationReference() {
		return simulationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationReference(uniformTimeCourse newSimulationReference) {
		uniformTimeCourse oldSimulationReference = simulationReference;
		simulationReference = newSimulationReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.TASK__SIMULATION_REFERENCE, oldSimulationReference, simulationReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SedmlPackage.TASK__ID:
				return getId();
			case SedmlPackage.TASK__MODEL_REFERENCE:
				if (resolve) return getModelReference();
				return basicGetModelReference();
			case SedmlPackage.TASK__SIMULATION_REFERENCE:
				if (resolve) return getSimulationReference();
				return basicGetSimulationReference();
			case SedmlPackage.TASK__NAME:
				return getName();
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
			case SedmlPackage.TASK__ID:
				setId((String)newValue);
				return;
			case SedmlPackage.TASK__MODEL_REFERENCE:
				setModelReference((model)newValue);
				return;
			case SedmlPackage.TASK__SIMULATION_REFERENCE:
				setSimulationReference((uniformTimeCourse)newValue);
				return;
			case SedmlPackage.TASK__NAME:
				setName((String)newValue);
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
			case SedmlPackage.TASK__ID:
				setId(ID_EDEFAULT);
				return;
			case SedmlPackage.TASK__MODEL_REFERENCE:
				setModelReference((model)null);
				return;
			case SedmlPackage.TASK__SIMULATION_REFERENCE:
				setSimulationReference((uniformTimeCourse)null);
				return;
			case SedmlPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
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
			case SedmlPackage.TASK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SedmlPackage.TASK__MODEL_REFERENCE:
				return modelReference != null;
			case SedmlPackage.TASK__SIMULATION_REFERENCE:
				return simulationReference != null;
			case SedmlPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //taskImpl
