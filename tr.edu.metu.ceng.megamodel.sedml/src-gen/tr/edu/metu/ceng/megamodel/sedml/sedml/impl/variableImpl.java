/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.sedml.sedml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage;
import tr.edu.metu.ceng.megamodel.sedml.sedml.model;
import tr.edu.metu.ceng.megamodel.sedml.sedml.task;
import tr.edu.metu.ceng.megamodel.sedml.sedml.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.impl.variableImpl#getId <em>Id</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.impl.variableImpl#getName <em>Name</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.impl.variableImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.impl.variableImpl#getTaskReference <em>Task Reference</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.impl.variableImpl#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.impl.variableImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class variableImpl extends SEDBaseImpl implements variable
{
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
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected String target = TARGET_EDEFAULT;

  /**
   * The cached value of the '{@link #getTaskReference() <em>Task Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskReference()
   * @generated
   * @ordered
   */
  protected task taskReference;

  /**
   * The cached value of the '{@link #getModelReference() <em>Model Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelReference()
   * @generated
   * @ordered
   */
  protected model modelReference;

  /**
   * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected static final String SYMBOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected String symbol = SYMBOL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variableImpl()
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
    return SedmlPackage.Literals.VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.VARIABLE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.VARIABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(String newTarget)
  {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.VARIABLE__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public task getTaskReference()
  {
    return taskReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTaskReference(task newTaskReference, NotificationChain msgs)
  {
    task oldTaskReference = taskReference;
    taskReference = newTaskReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SedmlPackage.VARIABLE__TASK_REFERENCE, oldTaskReference, newTaskReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskReference(task newTaskReference)
  {
    if (newTaskReference != taskReference)
    {
      NotificationChain msgs = null;
      if (taskReference != null)
        msgs = ((InternalEObject)taskReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.VARIABLE__TASK_REFERENCE, null, msgs);
      if (newTaskReference != null)
        msgs = ((InternalEObject)newTaskReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.VARIABLE__TASK_REFERENCE, null, msgs);
      msgs = basicSetTaskReference(newTaskReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.VARIABLE__TASK_REFERENCE, newTaskReference, newTaskReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public model getModelReference()
  {
    return modelReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModelReference(model newModelReference, NotificationChain msgs)
  {
    model oldModelReference = modelReference;
    modelReference = newModelReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SedmlPackage.VARIABLE__MODEL_REFERENCE, oldModelReference, newModelReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelReference(model newModelReference)
  {
    if (newModelReference != modelReference)
    {
      NotificationChain msgs = null;
      if (modelReference != null)
        msgs = ((InternalEObject)modelReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.VARIABLE__MODEL_REFERENCE, null, msgs);
      if (newModelReference != null)
        msgs = ((InternalEObject)newModelReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.VARIABLE__MODEL_REFERENCE, null, msgs);
      msgs = basicSetModelReference(newModelReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.VARIABLE__MODEL_REFERENCE, newModelReference, newModelReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSymbol()
  {
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbol(String newSymbol)
  {
    String oldSymbol = symbol;
    symbol = newSymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.VARIABLE__SYMBOL, oldSymbol, symbol));
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
      case SedmlPackage.VARIABLE__TASK_REFERENCE:
        return basicSetTaskReference(null, msgs);
      case SedmlPackage.VARIABLE__MODEL_REFERENCE:
        return basicSetModelReference(null, msgs);
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
      case SedmlPackage.VARIABLE__ID:
        return getId();
      case SedmlPackage.VARIABLE__NAME:
        return getName();
      case SedmlPackage.VARIABLE__TARGET:
        return getTarget();
      case SedmlPackage.VARIABLE__TASK_REFERENCE:
        return getTaskReference();
      case SedmlPackage.VARIABLE__MODEL_REFERENCE:
        return getModelReference();
      case SedmlPackage.VARIABLE__SYMBOL:
        return getSymbol();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SedmlPackage.VARIABLE__ID:
        setId((String)newValue);
        return;
      case SedmlPackage.VARIABLE__NAME:
        setName((String)newValue);
        return;
      case SedmlPackage.VARIABLE__TARGET:
        setTarget((String)newValue);
        return;
      case SedmlPackage.VARIABLE__TASK_REFERENCE:
        setTaskReference((task)newValue);
        return;
      case SedmlPackage.VARIABLE__MODEL_REFERENCE:
        setModelReference((model)newValue);
        return;
      case SedmlPackage.VARIABLE__SYMBOL:
        setSymbol((String)newValue);
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
      case SedmlPackage.VARIABLE__ID:
        setId(ID_EDEFAULT);
        return;
      case SedmlPackage.VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SedmlPackage.VARIABLE__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case SedmlPackage.VARIABLE__TASK_REFERENCE:
        setTaskReference((task)null);
        return;
      case SedmlPackage.VARIABLE__MODEL_REFERENCE:
        setModelReference((model)null);
        return;
      case SedmlPackage.VARIABLE__SYMBOL:
        setSymbol(SYMBOL_EDEFAULT);
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
      case SedmlPackage.VARIABLE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case SedmlPackage.VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SedmlPackage.VARIABLE__TARGET:
        return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
      case SedmlPackage.VARIABLE__TASK_REFERENCE:
        return taskReference != null;
      case SedmlPackage.VARIABLE__MODEL_REFERENCE:
        return modelReference != null;
      case SedmlPackage.VARIABLE__SYMBOL:
        return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
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
    result.append(" (id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(", target: ");
    result.append(target);
    result.append(", symbol: ");
    result.append(symbol);
    result.append(')');
    return result.toString();
  }

} //variableImpl
