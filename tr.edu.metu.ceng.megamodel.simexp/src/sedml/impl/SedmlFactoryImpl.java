/**
 */
package sedml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sedml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SedmlFactoryImpl extends EFactoryImpl implements SedmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SedmlFactory init() {
		try {
			SedmlFactory theSedmlFactory = (SedmlFactory)EPackage.Registry.INSTANCE.getEFactory(SedmlPackage.eNS_URI);
			if (theSedmlFactory != null) {
				return theSedmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SedmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SedmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SedmlPackage.SED_ML: return createsedML();
			case SedmlPackage.LIST_OF_SIMULATIONS: return createlistOfSimulations();
			case SedmlPackage.LIST_OF_MODELS: return createlistOfModels();
			case SedmlPackage.LIST_OF_TASKS: return createlistOfTasks();
			case SedmlPackage.LIST_OF_DATA_GENERATORS: return createlistOfDataGenerators();
			case SedmlPackage.LIST_OF_OUTPUTS: return createlistOfOutputs();
			case SedmlPackage.UNIFORM_TIME_COURSE: return createuniformTimeCourse();
			case SedmlPackage.ALGORITHM: return createalgorithm();
			case SedmlPackage.MODEL: return createmodel();
			case SedmlPackage.TASK: return createtask();
			case SedmlPackage.PLOT2_D: return createplot2D();
			case SedmlPackage.LIST_OF_CURVES: return createlistOfCurves();
			case SedmlPackage.CURVE: return createcurve();
			case SedmlPackage.DATA_GENERATOR: return createdataGenerator();
			case SedmlPackage.LIST_OF_VARIABLES: return createlistOfVariables();
			case SedmlPackage.VARIABLE: return createvariable();
			case SedmlPackage.MATH: return createmath();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sedML createsedML() {
		sedMLImpl sedML = new sedMLImpl();
		return sedML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfSimulations createlistOfSimulations() {
		listOfSimulationsImpl listOfSimulations = new listOfSimulationsImpl();
		return listOfSimulations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfModels createlistOfModels() {
		listOfModelsImpl listOfModels = new listOfModelsImpl();
		return listOfModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfTasks createlistOfTasks() {
		listOfTasksImpl listOfTasks = new listOfTasksImpl();
		return listOfTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfDataGenerators createlistOfDataGenerators() {
		listOfDataGeneratorsImpl listOfDataGenerators = new listOfDataGeneratorsImpl();
		return listOfDataGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfOutputs createlistOfOutputs() {
		listOfOutputsImpl listOfOutputs = new listOfOutputsImpl();
		return listOfOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uniformTimeCourse createuniformTimeCourse() {
		uniformTimeCourseImpl uniformTimeCourse = new uniformTimeCourseImpl();
		return uniformTimeCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public algorithm createalgorithm() {
		algorithmImpl algorithm = new algorithmImpl();
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public model createmodel() {
		modelImpl model = new modelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public task createtask() {
		taskImpl task = new taskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public plot2D createplot2D() {
		plot2DImpl plot2D = new plot2DImpl();
		return plot2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfCurves createlistOfCurves() {
		listOfCurvesImpl listOfCurves = new listOfCurvesImpl();
		return listOfCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public curve createcurve() {
		curveImpl curve = new curveImpl();
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dataGenerator createdataGenerator() {
		dataGeneratorImpl dataGenerator = new dataGeneratorImpl();
		return dataGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfVariables createlistOfVariables() {
		listOfVariablesImpl listOfVariables = new listOfVariablesImpl();
		return listOfVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public variable createvariable() {
		variableImpl variable = new variableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public math createmath() {
		mathImpl math = new mathImpl();
		return math;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SedmlPackage getSedmlPackage() {
		return (SedmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SedmlPackage getPackage() {
		return SedmlPackage.eINSTANCE;
	}

} //SedmlFactoryImpl
