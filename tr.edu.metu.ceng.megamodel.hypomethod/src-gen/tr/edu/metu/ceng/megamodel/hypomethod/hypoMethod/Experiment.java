/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Experiment#getExpName <em>Exp Name</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Experiment#getExpDesign <em>Exp Design</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Experiment#getPerfMeasure <em>Perf Measure</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getExperiment()
 * @model
 * @generated
 */
public interface Experiment extends ExperimentOntology
{
  /**
   * Returns the value of the '<em><b>Exp Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Name</em>' attribute.
   * @see #setExpName(String)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getExperiment_ExpName()
   * @model
   * @generated
   */
  String getExpName();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Experiment#getExpName <em>Exp Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Name</em>' attribute.
   * @see #getExpName()
   * @generated
   */
  void setExpName(String value);

  /**
   * Returns the value of the '<em><b>Exp Design</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Design</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Design</em>' containment reference.
   * @see #setExpDesign(Design)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getExperiment_ExpDesign()
   * @model containment="true"
   * @generated
   */
  Design getExpDesign();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Experiment#getExpDesign <em>Exp Design</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Design</em>' containment reference.
   * @see #getExpDesign()
   * @generated
   */
  void setExpDesign(Design value);

  /**
   * Returns the value of the '<em><b>Perf Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Perf Measure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Perf Measure</em>' containment reference.
   * @see #setPerfMeasure(PerformanceMeasure)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getExperiment_PerfMeasure()
   * @model containment="true"
   * @generated
   */
  PerformanceMeasure getPerfMeasure();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Experiment#getPerfMeasure <em>Perf Measure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Perf Measure</em>' containment reference.
   * @see #getPerfMeasure()
   * @generated
   */
  void setPerfMeasure(PerformanceMeasure value);

} // Experiment
