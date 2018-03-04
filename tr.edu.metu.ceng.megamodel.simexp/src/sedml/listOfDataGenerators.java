/**
 */
package sedml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>list Of Data Generators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sedml.listOfDataGenerators#getDataGenerator <em>Data Generator</em>}</li>
 * </ul>
 *
 * @see sedml.SedmlPackage#getlistOfDataGenerators()
 * @model
 * @generated
 */
public interface listOfDataGenerators extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Generator</b></em>' containment reference list.
	 * The list contents are of type {@link sedml.dataGenerator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Generator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Generator</em>' containment reference list.
	 * @see sedml.SedmlPackage#getlistOfDataGenerators_DataGenerator()
	 * @model containment="true"
	 * @generated
	 */
	EList<dataGenerator> getDataGenerator();

} // listOfDataGenerators
