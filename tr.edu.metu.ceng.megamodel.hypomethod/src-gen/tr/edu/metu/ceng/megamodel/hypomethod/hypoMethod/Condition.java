/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getL2 <em>L2</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getExp <em>Exp</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getOp1 <em>Op1</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getOp2 <em>Op2</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getL3 <em>L3</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getCondition <em>Condition</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getLo <em>Lo</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getE <em>E</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getV <em>V</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends TemporalPattern
{
  /**
   * Returns the value of the '<em><b>L2</b></em>' attribute list.
   * The list contents are of type {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Links}.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Links}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L2</em>' attribute list.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Links
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getCondition_L2()
   * @model unique="false"
   * @generated
   */
  EList<Links> getL2();

  /**
   * Returns the value of the '<em><b>Exp</b></em>' attribute list.
   * The list contents are of type {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Expression}.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' attribute list.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Expression
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getCondition_Exp()
   * @model unique="false"
   * @generated
   */
  EList<Expression> getExp();

  /**
   * Returns the value of the '<em><b>Op1</b></em>' attribute list.
   * The list contents are of type {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Temporal}.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Temporal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op1</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op1</em>' attribute list.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Temporal
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getCondition_Op1()
   * @model unique="false"
   * @generated
   */
  EList<Temporal> getOp1();

  /**
   * Returns the value of the '<em><b>Op2</b></em>' attribute list.
   * The list contents are of type {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Logical}.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Logical}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op2</em>' attribute list.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Logical
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getCondition_Op2()
   * @model unique="false"
   * @generated
   */
  EList<Logical> getOp2();

  /**
   * Returns the value of the '<em><b>L3</b></em>' attribute.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Links}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L3</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L3</em>' attribute.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Links
   * @see #setL3(Links)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getCondition_L3()
   * @model
   * @generated
   */
  Links getL3();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getL3 <em>L3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L3</em>' attribute.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Links
   * @see #getL3()
   * @generated
   */
  void setL3(Links value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Event)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getCondition_Condition()
   * @model containment="true"
   * @generated
   */
  Event getCondition();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Event value);

  /**
   * Returns the value of the '<em><b>Lo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lo</em>' attribute.
   * @see #setLo(String)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getCondition_Lo()
   * @model
   * @generated
   */
  String getLo();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getLo <em>Lo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lo</em>' attribute.
   * @see #getLo()
   * @generated
   */
  void setLo(String value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(Event)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getCondition_E()
   * @model containment="true"
   * @generated
   */
  Event getE();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(Event value);

  /**
   * Returns the value of the '<em><b>Exp1</b></em>' attribute.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp1</em>' attribute.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Expression
   * @see #setExp1(Expression)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getCondition_Exp1()
   * @model
   * @generated
   */
  Expression getExp1();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getExp1 <em>Exp1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp1</em>' attribute.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Expression
   * @see #getExp1()
   * @generated
   */
  void setExp1(Expression value);

  /**
   * Returns the value of the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' attribute.
   * @see #setV(String)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getCondition_V()
   * @model
   * @generated
   */
  String getV();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition#getV <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' attribute.
   * @see #getV()
   * @generated
   */
  void setV(String value);

} // Condition
