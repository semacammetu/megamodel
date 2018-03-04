/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypothesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Hypothesis#getMechHypothesis <em>Mech Hypothesis</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Hypothesis#getEvidences <em>Evidences</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Hypothesis#getCoherenceLinks <em>Coherence Links</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Hypothesis#getRelHypothesis <em>Rel Hypothesis</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getHypothesis()
 * @model
 * @generated
 */
public interface Hypothesis extends ExperimentOntology
{
  /**
   * Returns the value of the '<em><b>Mech Hypothesis</b></em>' containment reference list.
   * The list contents are of type {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.MechHypothesis}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mech Hypothesis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mech Hypothesis</em>' containment reference list.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getHypothesis_MechHypothesis()
   * @model containment="true"
   * @generated
   */
  EList<MechHypothesis> getMechHypothesis();

  /**
   * Returns the value of the '<em><b>Evidences</b></em>' containment reference list.
   * The list contents are of type {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Evidence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evidences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evidences</em>' containment reference list.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getHypothesis_Evidences()
   * @model containment="true"
   * @generated
   */
  EList<Evidence> getEvidences();

  /**
   * Returns the value of the '<em><b>Coherence Links</b></em>' containment reference list.
   * The list contents are of type {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.CoherenceLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coherence Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coherence Links</em>' containment reference list.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getHypothesis_CoherenceLinks()
   * @model containment="true"
   * @generated
   */
  EList<CoherenceLink> getCoherenceLinks();

  /**
   * Returns the value of the '<em><b>Rel Hypothesis</b></em>' containment reference list.
   * The list contents are of type {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.RelationalQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel Hypothesis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel Hypothesis</em>' containment reference list.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getHypothesis_RelHypothesis()
   * @model containment="true"
   * @generated
   */
  EList<RelationalQuery> getRelHypothesis();

} // Hypothesis