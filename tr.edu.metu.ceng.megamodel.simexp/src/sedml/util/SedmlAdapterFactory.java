/**
 */
package sedml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sedml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sedml.SedmlPackage
 * @generated
 */
public class SedmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SedmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SedmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SedmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SedmlSwitch<Adapter> modelSwitch =
		new SedmlSwitch<Adapter>() {
			@Override
			public Adapter casesedML(sedML object) {
				return createsedMLAdapter();
			}
			@Override
			public Adapter caselistOfSimulations(listOfSimulations object) {
				return createlistOfSimulationsAdapter();
			}
			@Override
			public Adapter caselistOfModels(listOfModels object) {
				return createlistOfModelsAdapter();
			}
			@Override
			public Adapter caselistOfTasks(listOfTasks object) {
				return createlistOfTasksAdapter();
			}
			@Override
			public Adapter caselistOfDataGenerators(listOfDataGenerators object) {
				return createlistOfDataGeneratorsAdapter();
			}
			@Override
			public Adapter caselistOfOutputs(listOfOutputs object) {
				return createlistOfOutputsAdapter();
			}
			@Override
			public Adapter caseuniformTimeCourse(uniformTimeCourse object) {
				return createuniformTimeCourseAdapter();
			}
			@Override
			public Adapter casealgorithm(algorithm object) {
				return createalgorithmAdapter();
			}
			@Override
			public Adapter casemodel(model object) {
				return createmodelAdapter();
			}
			@Override
			public Adapter casetask(task object) {
				return createtaskAdapter();
			}
			@Override
			public Adapter caseplot2D(plot2D object) {
				return createplot2DAdapter();
			}
			@Override
			public Adapter caselistOfCurves(listOfCurves object) {
				return createlistOfCurvesAdapter();
			}
			@Override
			public Adapter casecurve(curve object) {
				return createcurveAdapter();
			}
			@Override
			public Adapter casedataGenerator(dataGenerator object) {
				return createdataGeneratorAdapter();
			}
			@Override
			public Adapter caselistOfVariables(listOfVariables object) {
				return createlistOfVariablesAdapter();
			}
			@Override
			public Adapter casevariable(variable object) {
				return createvariableAdapter();
			}
			@Override
			public Adapter casemath(math object) {
				return createmathAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sedml.sedML <em>sed ML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.sedML
	 * @generated
	 */
	public Adapter createsedMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.listOfSimulations <em>list Of Simulations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.listOfSimulations
	 * @generated
	 */
	public Adapter createlistOfSimulationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.listOfModels <em>list Of Models</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.listOfModels
	 * @generated
	 */
	public Adapter createlistOfModelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.listOfTasks <em>list Of Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.listOfTasks
	 * @generated
	 */
	public Adapter createlistOfTasksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.listOfDataGenerators <em>list Of Data Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.listOfDataGenerators
	 * @generated
	 */
	public Adapter createlistOfDataGeneratorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.listOfOutputs <em>list Of Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.listOfOutputs
	 * @generated
	 */
	public Adapter createlistOfOutputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.uniformTimeCourse <em>uniform Time Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.uniformTimeCourse
	 * @generated
	 */
	public Adapter createuniformTimeCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.algorithm <em>algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.algorithm
	 * @generated
	 */
	public Adapter createalgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.model <em>model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.model
	 * @generated
	 */
	public Adapter createmodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.task <em>task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.task
	 * @generated
	 */
	public Adapter createtaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.plot2D <em>plot2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.plot2D
	 * @generated
	 */
	public Adapter createplot2DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.listOfCurves <em>list Of Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.listOfCurves
	 * @generated
	 */
	public Adapter createlistOfCurvesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.curve <em>curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.curve
	 * @generated
	 */
	public Adapter createcurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.dataGenerator <em>data Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.dataGenerator
	 * @generated
	 */
	public Adapter createdataGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.listOfVariables <em>list Of Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.listOfVariables
	 * @generated
	 */
	public Adapter createlistOfVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.variable <em>variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.variable
	 * @generated
	 */
	public Adapter createvariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sedml.math <em>math</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sedml.math
	 * @generated
	 */
	public Adapter createmathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SedmlAdapterFactory
