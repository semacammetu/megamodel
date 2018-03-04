/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.EventDescriptor;
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Factor;
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage;
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Mechanism;
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.ModelSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl.ModelSectionImpl#getModName <em>Mod Name</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl.ModelSectionImpl#getMechanisms <em>Mechanisms</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl.ModelSectionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl.ModelSectionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelSectionImpl extends ExperimentOntologyImpl implements ModelSection
{
  /**
   * The default value of the '{@link #getModName() <em>Mod Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModName()
   * @generated
   * @ordered
   */
  protected static final String MOD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModName() <em>Mod Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModName()
   * @generated
   * @ordered
   */
  protected String modName = MOD_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMechanisms() <em>Mechanisms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMechanisms()
   * @generated
   * @ordered
   */
  protected EList<Mechanism> mechanisms;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<EventDescriptor> events;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Factor> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelSectionImpl()
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
    return HypoMethodPackage.Literals.MODEL_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModName()
  {
    return modName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModName(String newModName)
  {
    String oldModName = modName;
    modName = newModName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HypoMethodPackage.MODEL_SECTION__MOD_NAME, oldModName, modName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mechanism> getMechanisms()
  {
    if (mechanisms == null)
    {
      mechanisms = new EObjectContainmentEList<Mechanism>(Mechanism.class, this, HypoMethodPackage.MODEL_SECTION__MECHANISMS);
    }
    return mechanisms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EventDescriptor> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<EventDescriptor>(EventDescriptor.class, this, HypoMethodPackage.MODEL_SECTION__EVENTS);
    }
    return events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Factor> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Factor>(Factor.class, this, HypoMethodPackage.MODEL_SECTION__PARAMETERS);
    }
    return parameters;
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
      case HypoMethodPackage.MODEL_SECTION__MECHANISMS:
        return ((InternalEList<?>)getMechanisms()).basicRemove(otherEnd, msgs);
      case HypoMethodPackage.MODEL_SECTION__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
      case HypoMethodPackage.MODEL_SECTION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case HypoMethodPackage.MODEL_SECTION__MOD_NAME:
        return getModName();
      case HypoMethodPackage.MODEL_SECTION__MECHANISMS:
        return getMechanisms();
      case HypoMethodPackage.MODEL_SECTION__EVENTS:
        return getEvents();
      case HypoMethodPackage.MODEL_SECTION__PARAMETERS:
        return getParameters();
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
      case HypoMethodPackage.MODEL_SECTION__MOD_NAME:
        setModName((String)newValue);
        return;
      case HypoMethodPackage.MODEL_SECTION__MECHANISMS:
        getMechanisms().clear();
        getMechanisms().addAll((Collection<? extends Mechanism>)newValue);
        return;
      case HypoMethodPackage.MODEL_SECTION__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends EventDescriptor>)newValue);
        return;
      case HypoMethodPackage.MODEL_SECTION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Factor>)newValue);
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
      case HypoMethodPackage.MODEL_SECTION__MOD_NAME:
        setModName(MOD_NAME_EDEFAULT);
        return;
      case HypoMethodPackage.MODEL_SECTION__MECHANISMS:
        getMechanisms().clear();
        return;
      case HypoMethodPackage.MODEL_SECTION__EVENTS:
        getEvents().clear();
        return;
      case HypoMethodPackage.MODEL_SECTION__PARAMETERS:
        getParameters().clear();
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
      case HypoMethodPackage.MODEL_SECTION__MOD_NAME:
        return MOD_NAME_EDEFAULT == null ? modName != null : !MOD_NAME_EDEFAULT.equals(modName);
      case HypoMethodPackage.MODEL_SECTION__MECHANISMS:
        return mechanisms != null && !mechanisms.isEmpty();
      case HypoMethodPackage.MODEL_SECTION__EVENTS:
        return events != null && !events.isEmpty();
      case HypoMethodPackage.MODEL_SECTION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (modName: ");
    result.append(modName);
    result.append(')');
    return result.toString();
  }

} //ModelSectionImpl