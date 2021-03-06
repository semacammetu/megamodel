/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.FactorLevels;
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage;
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.IndependentVariables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Independent Variables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl.IndependentVariablesImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndependentVariablesImpl extends MinimalEObjectImpl.Container implements IndependentVariables
{
  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<FactorLevels> variables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndependentVariablesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HypoMethodPackage.Literals.INDEPENDENT_VARIABLES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FactorLevels> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<FactorLevels>(FactorLevels.class, this, HypoMethodPackage.INDEPENDENT_VARIABLES__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HypoMethodPackage.INDEPENDENT_VARIABLES__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HypoMethodPackage.INDEPENDENT_VARIABLES__VARIABLES:
        return getVariables();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HypoMethodPackage.INDEPENDENT_VARIABLES__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends FactorLevels>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HypoMethodPackage.INDEPENDENT_VARIABLES__VARIABLES:
        getVariables().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HypoMethodPackage.INDEPENDENT_VARIABLES__VARIABLES:
        return variables != null && !variables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IndependentVariablesImpl
