/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.EventDescriptor#getEventName <em>Event Name</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.EventDescriptor#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getEventDescriptor()
 * @model
 * @generated
 */
public interface EventDescriptor extends EObject
{
  /**
   * Returns the value of the '<em><b>Event Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Name</em>' attribute.
   * @see #setEventName(String)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getEventDescriptor_EventName()
   * @model
   * @generated
   */
  String getEventName();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.EventDescriptor#getEventName <em>Event Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Name</em>' attribute.
   * @see #getEventName()
   * @generated
   */
  void setEventName(String value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' attribute.
   * @see #setEvent(String)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getEventDescriptor_Event()
   * @model
   * @generated
   */
  String getEvent();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.EventDescriptor#getEvent <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' attribute.
   * @see #getEvent()
   * @generated
   */
  void setEvent(String value);

} // EventDescriptor
