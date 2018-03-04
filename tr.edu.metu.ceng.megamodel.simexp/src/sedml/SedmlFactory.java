/**
 */
package sedml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sedml.SedmlPackage
 * @generated
 */
public interface SedmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SedmlFactory eINSTANCE = sedml.impl.SedmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>sed ML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sed ML</em>'.
	 * @generated
	 */
	sedML createsedML();

	/**
	 * Returns a new object of class '<em>list Of Simulations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>list Of Simulations</em>'.
	 * @generated
	 */
	listOfSimulations createlistOfSimulations();

	/**
	 * Returns a new object of class '<em>list Of Models</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>list Of Models</em>'.
	 * @generated
	 */
	listOfModels createlistOfModels();

	/**
	 * Returns a new object of class '<em>list Of Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>list Of Tasks</em>'.
	 * @generated
	 */
	listOfTasks createlistOfTasks();

	/**
	 * Returns a new object of class '<em>list Of Data Generators</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>list Of Data Generators</em>'.
	 * @generated
	 */
	listOfDataGenerators createlistOfDataGenerators();

	/**
	 * Returns a new object of class '<em>list Of Outputs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>list Of Outputs</em>'.
	 * @generated
	 */
	listOfOutputs createlistOfOutputs();

	/**
	 * Returns a new object of class '<em>uniform Time Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uniform Time Course</em>'.
	 * @generated
	 */
	uniformTimeCourse createuniformTimeCourse();

	/**
	 * Returns a new object of class '<em>algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>algorithm</em>'.
	 * @generated
	 */
	algorithm createalgorithm();

	/**
	 * Returns a new object of class '<em>model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>model</em>'.
	 * @generated
	 */
	model createmodel();

	/**
	 * Returns a new object of class '<em>task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>task</em>'.
	 * @generated
	 */
	task createtask();

	/**
	 * Returns a new object of class '<em>plot2 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>plot2 D</em>'.
	 * @generated
	 */
	plot2D createplot2D();

	/**
	 * Returns a new object of class '<em>list Of Curves</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>list Of Curves</em>'.
	 * @generated
	 */
	listOfCurves createlistOfCurves();

	/**
	 * Returns a new object of class '<em>curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>curve</em>'.
	 * @generated
	 */
	curve createcurve();

	/**
	 * Returns a new object of class '<em>data Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>data Generator</em>'.
	 * @generated
	 */
	dataGenerator createdataGenerator();

	/**
	 * Returns a new object of class '<em>list Of Variables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>list Of Variables</em>'.
	 * @generated
	 */
	listOfVariables createlistOfVariables();

	/**
	 * Returns a new object of class '<em>variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>variable</em>'.
	 * @generated
	 */
	variable createvariable();

	/**
	 * Returns a new object of class '<em>math</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>math</em>'.
	 * @generated
	 */
	math createmath();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SedmlPackage getSedmlPackage();

} //SedmlFactory
