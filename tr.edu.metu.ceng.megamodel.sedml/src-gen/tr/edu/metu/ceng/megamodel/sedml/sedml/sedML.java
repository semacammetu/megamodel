/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.sedml.sedml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sed ML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getVersion <em>Version</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getLevel <em>Level</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getListOfSimulations <em>List Of Simulations</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getListOfModels <em>List Of Models</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getListOfTasks <em>List Of Tasks</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getListOfDataGenerators <em>List Of Data Generators</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getListOfOutputs <em>List Of Outputs</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getsedML()
 * @model
 * @generated
 */
public interface sedML extends EObject
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(int)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getsedML_Version()
   * @model
   * @generated
   */
  int getVersion();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(int value);

  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(int)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getsedML_Level()
   * @model
   * @generated
   */
  int getLevel();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(int value);

  /**
   * Returns the value of the '<em><b>List Of Simulations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Of Simulations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Of Simulations</em>' containment reference.
   * @see #setListOfSimulations(listOfSimulations)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getsedML_ListOfSimulations()
   * @model containment="true"
   * @generated
   */
  listOfSimulations getListOfSimulations();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getListOfSimulations <em>List Of Simulations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Of Simulations</em>' containment reference.
   * @see #getListOfSimulations()
   * @generated
   */
  void setListOfSimulations(listOfSimulations value);

  /**
   * Returns the value of the '<em><b>List Of Models</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Of Models</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Of Models</em>' containment reference.
   * @see #setListOfModels(listOfModels)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getsedML_ListOfModels()
   * @model containment="true"
   * @generated
   */
  listOfModels getListOfModels();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getListOfModels <em>List Of Models</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Of Models</em>' containment reference.
   * @see #getListOfModels()
   * @generated
   */
  void setListOfModels(listOfModels value);

  /**
   * Returns the value of the '<em><b>List Of Tasks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Of Tasks</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Of Tasks</em>' containment reference.
   * @see #setListOfTasks(listOfTasks)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getsedML_ListOfTasks()
   * @model containment="true"
   * @generated
   */
  listOfTasks getListOfTasks();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getListOfTasks <em>List Of Tasks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Of Tasks</em>' containment reference.
   * @see #getListOfTasks()
   * @generated
   */
  void setListOfTasks(listOfTasks value);

  /**
   * Returns the value of the '<em><b>List Of Data Generators</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Of Data Generators</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Of Data Generators</em>' containment reference.
   * @see #setListOfDataGenerators(listOfDataGenerators)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getsedML_ListOfDataGenerators()
   * @model containment="true"
   * @generated
   */
  listOfDataGenerators getListOfDataGenerators();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getListOfDataGenerators <em>List Of Data Generators</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Of Data Generators</em>' containment reference.
   * @see #getListOfDataGenerators()
   * @generated
   */
  void setListOfDataGenerators(listOfDataGenerators value);

  /**
   * Returns the value of the '<em><b>List Of Outputs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Of Outputs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Of Outputs</em>' containment reference.
   * @see #setListOfOutputs(listOfOutputs)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getsedML_ListOfOutputs()
   * @model containment="true"
   * @generated
   */
  listOfOutputs getListOfOutputs();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.sedML#getListOfOutputs <em>List Of Outputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Of Outputs</em>' containment reference.
   * @see #getListOfOutputs()
   * @generated
   */
  void setListOfOutputs(listOfOutputs value);

} // sedML
