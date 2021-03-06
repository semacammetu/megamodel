/**
 */
package sedml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sedml.SedmlPackage;
import sedml.listOfSimulations;
import sedml.uniformTimeCourse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>list Of Simulations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sedml.impl.listOfSimulationsImpl#getUniformTimeCourse <em>Uniform Time Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class listOfSimulationsImpl extends MinimalEObjectImpl.Container implements listOfSimulations {
	/**
	 * The cached value of the '{@link #getUniformTimeCourse() <em>Uniform Time Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniformTimeCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<uniformTimeCourse> uniformTimeCourse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected listOfSimulationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SedmlPackage.Literals.LIST_OF_SIMULATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uniformTimeCourse> getUniformTimeCourse() {
		if (uniformTimeCourse == null) {
			uniformTimeCourse = new EObjectContainmentEList<uniformTimeCourse>(uniformTimeCourse.class, this, SedmlPackage.LIST_OF_SIMULATIONS__UNIFORM_TIME_COURSE);
		}
		return uniformTimeCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SedmlPackage.LIST_OF_SIMULATIONS__UNIFORM_TIME_COURSE:
				return ((InternalEList<?>)getUniformTimeCourse()).basicRemove(otherEnd, msgs);
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
			case SedmlPackage.LIST_OF_SIMULATIONS__UNIFORM_TIME_COURSE:
				return getUniformTimeCourse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SedmlPackage.LIST_OF_SIMULATIONS__UNIFORM_TIME_COURSE:
				getUniformTimeCourse().clear();
				getUniformTimeCourse().addAll((Collection<? extends uniformTimeCourse>)newValue);
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
			case SedmlPackage.LIST_OF_SIMULATIONS__UNIFORM_TIME_COURSE:
				getUniformTimeCourse().clear();
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
			case SedmlPackage.LIST_OF_SIMULATIONS__UNIFORM_TIME_COURSE:
				return uniformTimeCourse != null && !uniformTimeCourse.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //listOfSimulationsImpl
