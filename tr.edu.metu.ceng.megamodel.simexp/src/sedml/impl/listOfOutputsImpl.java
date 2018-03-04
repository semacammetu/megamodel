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
import sedml.listOfOutputs;
import sedml.plot2D;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>list Of Outputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sedml.impl.listOfOutputsImpl#getPlot2D <em>Plot2 D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class listOfOutputsImpl extends MinimalEObjectImpl.Container implements listOfOutputs {
	/**
	 * The cached value of the '{@link #getPlot2D() <em>Plot2 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlot2D()
	 * @generated
	 * @ordered
	 */
	protected EList<plot2D> plot2D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected listOfOutputsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SedmlPackage.Literals.LIST_OF_OUTPUTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<plot2D> getPlot2D() {
		if (plot2D == null) {
			plot2D = new EObjectContainmentEList<plot2D>(plot2D.class, this, SedmlPackage.LIST_OF_OUTPUTS__PLOT2_D);
		}
		return plot2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SedmlPackage.LIST_OF_OUTPUTS__PLOT2_D:
				return ((InternalEList<?>)getPlot2D()).basicRemove(otherEnd, msgs);
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
			case SedmlPackage.LIST_OF_OUTPUTS__PLOT2_D:
				return getPlot2D();
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
			case SedmlPackage.LIST_OF_OUTPUTS__PLOT2_D:
				getPlot2D().clear();
				getPlot2D().addAll((Collection<? extends plot2D>)newValue);
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
			case SedmlPackage.LIST_OF_OUTPUTS__PLOT2_D:
				getPlot2D().clear();
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
			case SedmlPackage.LIST_OF_OUTPUTS__PLOT2_D:
				return plot2D != null && !plot2D.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //listOfOutputsImpl
