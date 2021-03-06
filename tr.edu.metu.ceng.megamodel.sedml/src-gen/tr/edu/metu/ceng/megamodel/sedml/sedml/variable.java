/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.sedml.sedml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable#getId <em>Id</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable#getName <em>Name</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable#getTarget <em>Target</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable#getTaskReference <em>Task Reference</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getvariable()
 * @model
 * @generated
 */
public interface variable extends SEDBase
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getvariable_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getvariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getvariable_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

  /**
   * Returns the value of the '<em><b>Task Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Reference</em>' containment reference.
   * @see #setTaskReference(task)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getvariable_TaskReference()
   * @model containment="true"
   * @generated
   */
  task getTaskReference();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable#getTaskReference <em>Task Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Reference</em>' containment reference.
   * @see #getTaskReference()
   * @generated
   */
  void setTaskReference(task value);

  /**
   * Returns the value of the '<em><b>Model Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Reference</em>' containment reference.
   * @see #setModelReference(model)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getvariable_ModelReference()
   * @model containment="true"
   * @generated
   */
  model getModelReference();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable#getModelReference <em>Model Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Reference</em>' containment reference.
   * @see #getModelReference()
   * @generated
   */
  void setModelReference(model value);

  /**
   * Returns the value of the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' attribute.
   * @see #setSymbol(String)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getvariable_Symbol()
   * @model
   * @generated
   */
  String getSymbol();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.variable#getSymbol <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' attribute.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(String value);

} // variable
