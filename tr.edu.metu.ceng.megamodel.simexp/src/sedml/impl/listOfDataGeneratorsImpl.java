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
import sedml.dataGenerator;
import sedml.listOfDataGenerators;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>list Of Data Generators</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sedml.impl.listOfDataGeneratorsImpl#getDataGenerator <em>Data Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class listOfDataGeneratorsImpl extends MinimalEObjectImpl.Container implements listOfDataGenerators {
	/**
	 * The cached value of the '{@link #getDataGenerator() <em>Data Generator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataGenerator()
	 * @generated
	 * @ordered
	 */
	protected EList<dataGenerator> dataGenerator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected listOfDataGeneratorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SedmlPackage.Literals.LIST_OF_DATA_GENERATORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<dataGenerator> getDataGenerator() {
		if (dataGenerator == null) {
			dataGenerator = new EObjectContainmentEList<dataGenerator>(dataGenerator.class, this, SedmlPackage.LIST_OF_DATA_GENERATORS__DATA_GENERATOR);
		}
		return dataGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SedmlPackage.LIST_OF_DATA_GENERATORS__DATA_GENERATOR:
				return ((InternalEList<?>)getDataGenerator()).basicRemove(otherEnd, msgs);
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
			case SedmlPackage.LIST_OF_DATA_GENERATORS__DATA_GENERATOR:
				return getDataGenerator();
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
			case SedmlPackage.LIST_OF_DATA_GENERATORS__DATA_GENERATOR:
				getDataGenerator().clear();
				getDataGenerator().addAll((Collection<? extends dataGenerator>)newValue);
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
			case SedmlPackage.LIST_OF_DATA_GENERATORS__DATA_GENERATOR:
				getDataGenerator().clear();
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
			case SedmlPackage.LIST_OF_DATA_GENERATORS__DATA_GENERATOR:
				return dataGenerator != null && !dataGenerator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //listOfDataGeneratorsImpl
