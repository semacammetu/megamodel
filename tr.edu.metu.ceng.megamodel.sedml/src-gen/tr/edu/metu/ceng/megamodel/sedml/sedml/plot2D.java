/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.sedml.sedml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>plot2 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.plot2D#getId <em>Id</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.plot2D#getName <em>Name</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.sedml.sedml.plot2D#getListOfCurves <em>List Of Curves</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getplot2D()
 * @model
 * @generated
 */
public interface plot2D extends output
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
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getplot2D_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.plot2D#getId <em>Id</em>}' attribute.
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
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getplot2D_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.plot2D#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>List Of Curves</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Of Curves</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Of Curves</em>' containment reference.
   * @see #setListOfCurves(listOfCurves)
   * @see tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage#getplot2D_ListOfCurves()
   * @model containment="true"
   * @generated
   */
  listOfCurves getListOfCurves();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.sedml.sedml.plot2D#getListOfCurves <em>List Of Curves</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Of Curves</em>' containment reference.
   * @see #getListOfCurves()
   * @generated
   */
  void setListOfCurves(listOfCurves value);

} // plot2D
