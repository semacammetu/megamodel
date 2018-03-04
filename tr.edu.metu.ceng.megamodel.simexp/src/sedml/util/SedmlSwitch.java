/**
 */
package sedml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sedml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sedml.SedmlPackage
 * @generated
 */
public class SedmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SedmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SedmlSwitch() {
		if (modelPackage == null) {
			modelPackage = SedmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SedmlPackage.SED_ML: {
				sedML sedML = (sedML)theEObject;
				T result = casesedML(sedML);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.LIST_OF_SIMULATIONS: {
				listOfSimulations listOfSimulations = (listOfSimulations)theEObject;
				T result = caselistOfSimulations(listOfSimulations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.LIST_OF_MODELS: {
				listOfModels listOfModels = (listOfModels)theEObject;
				T result = caselistOfModels(listOfModels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.LIST_OF_TASKS: {
				listOfTasks listOfTasks = (listOfTasks)theEObject;
				T result = caselistOfTasks(listOfTasks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.LIST_OF_DATA_GENERATORS: {
				listOfDataGenerators listOfDataGenerators = (listOfDataGenerators)theEObject;
				T result = caselistOfDataGenerators(listOfDataGenerators);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.LIST_OF_OUTPUTS: {
				listOfOutputs listOfOutputs = (listOfOutputs)theEObject;
				T result = caselistOfOutputs(listOfOutputs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.UNIFORM_TIME_COURSE: {
				uniformTimeCourse uniformTimeCourse = (uniformTimeCourse)theEObject;
				T result = caseuniformTimeCourse(uniformTimeCourse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.ALGORITHM: {
				algorithm algorithm = (algorithm)theEObject;
				T result = casealgorithm(algorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.MODEL: {
				model model = (model)theEObject;
				T result = casemodel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.TASK: {
				task task = (task)theEObject;
				T result = casetask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.PLOT2_D: {
				plot2D plot2D = (plot2D)theEObject;
				T result = caseplot2D(plot2D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.LIST_OF_CURVES: {
				listOfCurves listOfCurves = (listOfCurves)theEObject;
				T result = caselistOfCurves(listOfCurves);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.CURVE: {
				curve curve = (curve)theEObject;
				T result = casecurve(curve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.DATA_GENERATOR: {
				dataGenerator dataGenerator = (dataGenerator)theEObject;
				T result = casedataGenerator(dataGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.LIST_OF_VARIABLES: {
				listOfVariables listOfVariables = (listOfVariables)theEObject;
				T result = caselistOfVariables(listOfVariables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.VARIABLE: {
				variable variable = (variable)theEObject;
				T result = casevariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SedmlPackage.MATH: {
				math math = (math)theEObject;
				T result = casemath(math);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sed ML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sed ML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesedML(sedML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>list Of Simulations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>list Of Simulations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselistOfSimulations(listOfSimulations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>list Of Models</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>list Of Models</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselistOfModels(listOfModels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>list Of Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>list Of Tasks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselistOfTasks(listOfTasks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>list Of Data Generators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>list Of Data Generators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselistOfDataGenerators(listOfDataGenerators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>list Of Outputs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>list Of Outputs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselistOfOutputs(listOfOutputs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uniform Time Course</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uniform Time Course</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuniformTimeCourse(uniformTimeCourse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casealgorithm(algorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemodel(model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetask(task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>plot2 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>plot2 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseplot2D(plot2D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>list Of Curves</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>list Of Curves</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselistOfCurves(listOfCurves object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecurve(curve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>data Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>data Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedataGenerator(dataGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>list Of Variables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>list Of Variables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselistOfVariables(listOfVariables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevariable(variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>math</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>math</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemath(math object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SedmlSwitch
