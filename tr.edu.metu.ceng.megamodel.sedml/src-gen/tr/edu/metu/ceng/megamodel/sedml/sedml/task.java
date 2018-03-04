/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.sedml.sedml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.task#getId <em>Id</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.task#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.task#getSimulationReference <em>Simulation Reference</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.task#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#gettask()
 * @model
 * @generated
 */
public interface task extends EObject
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
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#gettask_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.task#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

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
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#gettask_ModelReference()
   * @model containment="true"
   * @generated
   */
  model getModelReference();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.task#getModelReference <em>Model Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Reference</em>' containment reference.
   * @see #getModelReference()
   * @generated
   */
  void setModelReference(model value);

  /**
   * Returns the value of the '<em><b>Simulation Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simulation Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simulation Reference</em>' containment reference.
   * @see #setSimulationReference(uniformTimeCourse)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#gettask_SimulationReference()
   * @model containment="true"
   * @generated
   */
  uniformTimeCourse getSimulationReference();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.task#getSimulationReference <em>Simulation Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simulation Reference</em>' containment reference.
   * @see #getSimulationReference()
   * @generated
   */
  void setSimulationReference(uniformTimeCourse value);

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
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#gettask_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.task#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // task
