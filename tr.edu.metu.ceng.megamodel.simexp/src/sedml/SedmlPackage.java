/**
 */
package sedml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sedml.SedmlFactory
 * @model kind="package"
 * @generated
 */
public interface SedmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sedml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ceng.metu.edu.tr/~e1774785/megamodel/sedml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SedmlPackage eINSTANCE = sedml.impl.SedmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link sedml.impl.sedMLImpl <em>sed ML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.sedMLImpl
	 * @see sedml.impl.SedmlPackageImpl#getsedML()
	 * @generated
	 */
	int SED_ML = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SED_ML__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SED_ML__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>List Of Simulations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SED_ML__LIST_OF_SIMULATIONS = 2;

	/**
	 * The feature id for the '<em><b>List Of Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SED_ML__LIST_OF_MODELS = 3;

	/**
	 * The feature id for the '<em><b>List Of Tasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SED_ML__LIST_OF_TASKS = 4;

	/**
	 * The feature id for the '<em><b>List Of Data Generators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SED_ML__LIST_OF_DATA_GENERATORS = 5;

	/**
	 * The feature id for the '<em><b>List Of Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SED_ML__LIST_OF_OUTPUTS = 6;

	/**
	 * The number of structural features of the '<em>sed ML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SED_ML_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>sed ML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SED_ML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.listOfSimulationsImpl <em>list Of Simulations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.listOfSimulationsImpl
	 * @see sedml.impl.SedmlPackageImpl#getlistOfSimulations()
	 * @generated
	 */
	int LIST_OF_SIMULATIONS = 1;

	/**
	 * The feature id for the '<em><b>Uniform Time Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_SIMULATIONS__UNIFORM_TIME_COURSE = 0;

	/**
	 * The number of structural features of the '<em>list Of Simulations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_SIMULATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>list Of Simulations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_SIMULATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.listOfModelsImpl <em>list Of Models</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.listOfModelsImpl
	 * @see sedml.impl.SedmlPackageImpl#getlistOfModels()
	 * @generated
	 */
	int LIST_OF_MODELS = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_MODELS__MODEL = 0;

	/**
	 * The number of structural features of the '<em>list Of Models</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_MODELS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>list Of Models</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_MODELS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.listOfTasksImpl <em>list Of Tasks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.listOfTasksImpl
	 * @see sedml.impl.SedmlPackageImpl#getlistOfTasks()
	 * @generated
	 */
	int LIST_OF_TASKS = 3;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TASKS__TASK = 0;

	/**
	 * The number of structural features of the '<em>list Of Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TASKS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>list Of Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TASKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.listOfDataGeneratorsImpl <em>list Of Data Generators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.listOfDataGeneratorsImpl
	 * @see sedml.impl.SedmlPackageImpl#getlistOfDataGenerators()
	 * @generated
	 */
	int LIST_OF_DATA_GENERATORS = 4;

	/**
	 * The feature id for the '<em><b>Data Generator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DATA_GENERATORS__DATA_GENERATOR = 0;

	/**
	 * The number of structural features of the '<em>list Of Data Generators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DATA_GENERATORS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>list Of Data Generators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DATA_GENERATORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.listOfOutputsImpl <em>list Of Outputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.listOfOutputsImpl
	 * @see sedml.impl.SedmlPackageImpl#getlistOfOutputs()
	 * @generated
	 */
	int LIST_OF_OUTPUTS = 5;

	/**
	 * The feature id for the '<em><b>Plot2 D</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_OUTPUTS__PLOT2_D = 0;

	/**
	 * The number of structural features of the '<em>list Of Outputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_OUTPUTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>list Of Outputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_OUTPUTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.uniformTimeCourseImpl <em>uniform Time Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.uniformTimeCourseImpl
	 * @see sedml.impl.SedmlPackageImpl#getuniformTimeCourse()
	 * @generated
	 */
	int UNIFORM_TIME_COURSE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_TIME_COURSE__ID = 0;

	/**
	 * The feature id for the '<em><b>Initial Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_TIME_COURSE__INITIAL_TIME = 1;

	/**
	 * The feature id for the '<em><b>Output Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_TIME_COURSE__OUTPUT_START_TIME = 2;

	/**
	 * The feature id for the '<em><b>Output End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_TIME_COURSE__OUTPUT_END_TIME = 3;

	/**
	 * The feature id for the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_TIME_COURSE__NUMBER_OF_POINTS = 4;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_TIME_COURSE__ALGORITHM = 5;

	/**
	 * The number of structural features of the '<em>uniform Time Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_TIME_COURSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>uniform Time Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_TIME_COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.algorithmImpl <em>algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.algorithmImpl
	 * @see sedml.impl.SedmlPackageImpl#getalgorithm()
	 * @generated
	 */
	int ALGORITHM = 7;

	/**
	 * The feature id for the '<em><b>Kisao ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__KISAO_ID = 0;

	/**
	 * The number of structural features of the '<em>algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.modelImpl <em>model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.modelImpl
	 * @see sedml.impl.SedmlPackageImpl#getmodel()
	 * @generated
	 */
	int MODEL = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 3;

	/**
	 * The number of structural features of the '<em>model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.taskImpl <em>task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.taskImpl
	 * @see sedml.impl.SedmlPackageImpl#gettask()
	 * @generated
	 */
	int TASK = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 0;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MODEL_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Simulation Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SIMULATION_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 3;

	/**
	 * The number of structural features of the '<em>task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.plot2DImpl <em>plot2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.plot2DImpl
	 * @see sedml.impl.SedmlPackageImpl#getplot2D()
	 * @generated
	 */
	int PLOT2_D = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT2_D__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT2_D__NAME = 1;

	/**
	 * The feature id for the '<em><b>List Of Curves</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT2_D__LIST_OF_CURVES = 2;

	/**
	 * The number of structural features of the '<em>plot2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT2_D_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>plot2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT2_D_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.listOfCurvesImpl <em>list Of Curves</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.listOfCurvesImpl
	 * @see sedml.impl.SedmlPackageImpl#getlistOfCurves()
	 * @generated
	 */
	int LIST_OF_CURVES = 11;

	/**
	 * The feature id for the '<em><b>Curve</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CURVES__CURVE = 0;

	/**
	 * The number of structural features of the '<em>list Of Curves</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CURVES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>list Of Curves</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CURVES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.curveImpl <em>curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.curveImpl
	 * @see sedml.impl.SedmlPackageImpl#getcurve()
	 * @generated
	 */
	int CURVE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__ID = 0;

	/**
	 * The feature id for the '<em><b>Log X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__LOG_X = 1;

	/**
	 * The feature id for the '<em><b>Log Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__LOG_Y = 2;

	/**
	 * The feature id for the '<em><b>XData Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__XDATA_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>YData Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__YDATA_REFERENCE = 4;

	/**
	 * The number of structural features of the '<em>curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.dataGeneratorImpl <em>data Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.dataGeneratorImpl
	 * @see sedml.impl.SedmlPackageImpl#getdataGenerator()
	 * @generated
	 */
	int DATA_GENERATOR = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GENERATOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GENERATOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>List Of Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GENERATOR__LIST_OF_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Math</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GENERATOR__MATH = 3;

	/**
	 * The number of structural features of the '<em>data Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GENERATOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>data Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.listOfVariablesImpl <em>list Of Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.listOfVariablesImpl
	 * @see sedml.impl.SedmlPackageImpl#getlistOfVariables()
	 * @generated
	 */
	int LIST_OF_VARIABLES = 14;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VARIABLES__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>list Of Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VARIABLES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>list Of Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VARIABLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.variableImpl <em>variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.variableImpl
	 * @see sedml.impl.SedmlPackageImpl#getvariable()
	 * @generated
	 */
	int VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Task Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TASK_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SYMBOL = 3;

	/**
	 * The number of structural features of the '<em>variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sedml.impl.mathImpl <em>math</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sedml.impl.mathImpl
	 * @see sedml.impl.SedmlPackageImpl#getmath()
	 * @generated
	 */
	int MATH = 16;

	/**
	 * The feature id for the '<em><b>Xlms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH__XLMS = 0;

	/**
	 * The number of structural features of the '<em>math</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>math</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link sedml.sedML <em>sed ML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sed ML</em>'.
	 * @see sedml.sedML
	 * @generated
	 */
	EClass getsedML();

	/**
	 * Returns the meta object for the attribute '{@link sedml.sedML#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see sedml.sedML#getVersion()
	 * @see #getsedML()
	 * @generated
	 */
	EAttribute getsedML_Version();

	/**
	 * Returns the meta object for the attribute '{@link sedml.sedML#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see sedml.sedML#getLevel()
	 * @see #getsedML()
	 * @generated
	 */
	EAttribute getsedML_Level();

	/**
	 * Returns the meta object for the containment reference '{@link sedml.sedML#getListOfSimulations <em>List Of Simulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Of Simulations</em>'.
	 * @see sedml.sedML#getListOfSimulations()
	 * @see #getsedML()
	 * @generated
	 */
	EReference getsedML_ListOfSimulations();

	/**
	 * Returns the meta object for the containment reference '{@link sedml.sedML#getListOfModels <em>List Of Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Of Models</em>'.
	 * @see sedml.sedML#getListOfModels()
	 * @see #getsedML()
	 * @generated
	 */
	EReference getsedML_ListOfModels();

	/**
	 * Returns the meta object for the containment reference '{@link sedml.sedML#getListOfTasks <em>List Of Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Of Tasks</em>'.
	 * @see sedml.sedML#getListOfTasks()
	 * @see #getsedML()
	 * @generated
	 */
	EReference getsedML_ListOfTasks();

	/**
	 * Returns the meta object for the containment reference '{@link sedml.sedML#getListOfDataGenerators <em>List Of Data Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Of Data Generators</em>'.
	 * @see sedml.sedML#getListOfDataGenerators()
	 * @see #getsedML()
	 * @generated
	 */
	EReference getsedML_ListOfDataGenerators();

	/**
	 * Returns the meta object for the containment reference '{@link sedml.sedML#getListOfOutputs <em>List Of Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Of Outputs</em>'.
	 * @see sedml.sedML#getListOfOutputs()
	 * @see #getsedML()
	 * @generated
	 */
	EReference getsedML_ListOfOutputs();

	/**
	 * Returns the meta object for class '{@link sedml.listOfSimulations <em>list Of Simulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>list Of Simulations</em>'.
	 * @see sedml.listOfSimulations
	 * @generated
	 */
	EClass getlistOfSimulations();

	/**
	 * Returns the meta object for the containment reference list '{@link sedml.listOfSimulations#getUniformTimeCourse <em>Uniform Time Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uniform Time Course</em>'.
	 * @see sedml.listOfSimulations#getUniformTimeCourse()
	 * @see #getlistOfSimulations()
	 * @generated
	 */
	EReference getlistOfSimulations_UniformTimeCourse();

	/**
	 * Returns the meta object for class '{@link sedml.listOfModels <em>list Of Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>list Of Models</em>'.
	 * @see sedml.listOfModels
	 * @generated
	 */
	EClass getlistOfModels();

	/**
	 * Returns the meta object for the containment reference list '{@link sedml.listOfModels#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see sedml.listOfModels#getModel()
	 * @see #getlistOfModels()
	 * @generated
	 */
	EReference getlistOfModels_Model();

	/**
	 * Returns the meta object for class '{@link sedml.listOfTasks <em>list Of Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>list Of Tasks</em>'.
	 * @see sedml.listOfTasks
	 * @generated
	 */
	EClass getlistOfTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link sedml.listOfTasks#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see sedml.listOfTasks#getTask()
	 * @see #getlistOfTasks()
	 * @generated
	 */
	EReference getlistOfTasks_Task();

	/**
	 * Returns the meta object for class '{@link sedml.listOfDataGenerators <em>list Of Data Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>list Of Data Generators</em>'.
	 * @see sedml.listOfDataGenerators
	 * @generated
	 */
	EClass getlistOfDataGenerators();

	/**
	 * Returns the meta object for the containment reference list '{@link sedml.listOfDataGenerators#getDataGenerator <em>Data Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Generator</em>'.
	 * @see sedml.listOfDataGenerators#getDataGenerator()
	 * @see #getlistOfDataGenerators()
	 * @generated
	 */
	EReference getlistOfDataGenerators_DataGenerator();

	/**
	 * Returns the meta object for class '{@link sedml.listOfOutputs <em>list Of Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>list Of Outputs</em>'.
	 * @see sedml.listOfOutputs
	 * @generated
	 */
	EClass getlistOfOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link sedml.listOfOutputs#getPlot2D <em>Plot2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plot2 D</em>'.
	 * @see sedml.listOfOutputs#getPlot2D()
	 * @see #getlistOfOutputs()
	 * @generated
	 */
	EReference getlistOfOutputs_Plot2D();

	/**
	 * Returns the meta object for class '{@link sedml.uniformTimeCourse <em>uniform Time Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uniform Time Course</em>'.
	 * @see sedml.uniformTimeCourse
	 * @generated
	 */
	EClass getuniformTimeCourse();

	/**
	 * Returns the meta object for the attribute '{@link sedml.uniformTimeCourse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sedml.uniformTimeCourse#getId()
	 * @see #getuniformTimeCourse()
	 * @generated
	 */
	EAttribute getuniformTimeCourse_Id();

	/**
	 * Returns the meta object for the attribute '{@link sedml.uniformTimeCourse#getInitialTime <em>Initial Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Time</em>'.
	 * @see sedml.uniformTimeCourse#getInitialTime()
	 * @see #getuniformTimeCourse()
	 * @generated
	 */
	EAttribute getuniformTimeCourse_InitialTime();

	/**
	 * Returns the meta object for the attribute '{@link sedml.uniformTimeCourse#getOutputStartTime <em>Output Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Start Time</em>'.
	 * @see sedml.uniformTimeCourse#getOutputStartTime()
	 * @see #getuniformTimeCourse()
	 * @generated
	 */
	EAttribute getuniformTimeCourse_OutputStartTime();

	/**
	 * Returns the meta object for the attribute '{@link sedml.uniformTimeCourse#getOutputEndTime <em>Output End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output End Time</em>'.
	 * @see sedml.uniformTimeCourse#getOutputEndTime()
	 * @see #getuniformTimeCourse()
	 * @generated
	 */
	EAttribute getuniformTimeCourse_OutputEndTime();

	/**
	 * Returns the meta object for the attribute '{@link sedml.uniformTimeCourse#getNumberOfPoints <em>Number Of Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Points</em>'.
	 * @see sedml.uniformTimeCourse#getNumberOfPoints()
	 * @see #getuniformTimeCourse()
	 * @generated
	 */
	EAttribute getuniformTimeCourse_NumberOfPoints();

	/**
	 * Returns the meta object for the containment reference '{@link sedml.uniformTimeCourse#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithm</em>'.
	 * @see sedml.uniformTimeCourse#getAlgorithm()
	 * @see #getuniformTimeCourse()
	 * @generated
	 */
	EReference getuniformTimeCourse_Algorithm();

	/**
	 * Returns the meta object for class '{@link sedml.algorithm <em>algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>algorithm</em>'.
	 * @see sedml.algorithm
	 * @generated
	 */
	EClass getalgorithm();

	/**
	 * Returns the meta object for the attribute '{@link sedml.algorithm#getKisaoID <em>Kisao ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kisao ID</em>'.
	 * @see sedml.algorithm#getKisaoID()
	 * @see #getalgorithm()
	 * @generated
	 */
	EAttribute getalgorithm_KisaoID();

	/**
	 * Returns the meta object for class '{@link sedml.model <em>model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>model</em>'.
	 * @see sedml.model
	 * @generated
	 */
	EClass getmodel();

	/**
	 * Returns the meta object for the attribute '{@link sedml.model#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sedml.model#getId()
	 * @see #getmodel()
	 * @generated
	 */
	EAttribute getmodel_Id();

	/**
	 * Returns the meta object for the attribute '{@link sedml.model#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see sedml.model#getLanguage()
	 * @see #getmodel()
	 * @generated
	 */
	EAttribute getmodel_Language();

	/**
	 * Returns the meta object for the attribute '{@link sedml.model#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see sedml.model#getSource()
	 * @see #getmodel()
	 * @generated
	 */
	EAttribute getmodel_Source();

	/**
	 * Returns the meta object for the attribute '{@link sedml.model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sedml.model#getName()
	 * @see #getmodel()
	 * @generated
	 */
	EAttribute getmodel_Name();

	/**
	 * Returns the meta object for class '{@link sedml.task <em>task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>task</em>'.
	 * @see sedml.task
	 * @generated
	 */
	EClass gettask();

	/**
	 * Returns the meta object for the attribute '{@link sedml.task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sedml.task#getId()
	 * @see #gettask()
	 * @generated
	 */
	EAttribute gettask_Id();

	/**
	 * Returns the meta object for the reference '{@link sedml.task#getModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Reference</em>'.
	 * @see sedml.task#getModelReference()
	 * @see #gettask()
	 * @generated
	 */
	EReference gettask_ModelReference();

	/**
	 * Returns the meta object for the reference '{@link sedml.task#getSimulationReference <em>Simulation Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simulation Reference</em>'.
	 * @see sedml.task#getSimulationReference()
	 * @see #gettask()
	 * @generated
	 */
	EReference gettask_SimulationReference();

	/**
	 * Returns the meta object for the attribute '{@link sedml.task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sedml.task#getName()
	 * @see #gettask()
	 * @generated
	 */
	EAttribute gettask_Name();

	/**
	 * Returns the meta object for class '{@link sedml.plot2D <em>plot2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>plot2 D</em>'.
	 * @see sedml.plot2D
	 * @generated
	 */
	EClass getplot2D();

	/**
	 * Returns the meta object for the attribute '{@link sedml.plot2D#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sedml.plot2D#getId()
	 * @see #getplot2D()
	 * @generated
	 */
	EAttribute getplot2D_Id();

	/**
	 * Returns the meta object for the attribute '{@link sedml.plot2D#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sedml.plot2D#getName()
	 * @see #getplot2D()
	 * @generated
	 */
	EAttribute getplot2D_Name();

	/**
	 * Returns the meta object for the reference '{@link sedml.plot2D#getListOfCurves <em>List Of Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>List Of Curves</em>'.
	 * @see sedml.plot2D#getListOfCurves()
	 * @see #getplot2D()
	 * @generated
	 */
	EReference getplot2D_ListOfCurves();

	/**
	 * Returns the meta object for class '{@link sedml.listOfCurves <em>list Of Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>list Of Curves</em>'.
	 * @see sedml.listOfCurves
	 * @generated
	 */
	EClass getlistOfCurves();

	/**
	 * Returns the meta object for the containment reference list '{@link sedml.listOfCurves#getCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Curve</em>'.
	 * @see sedml.listOfCurves#getCurve()
	 * @see #getlistOfCurves()
	 * @generated
	 */
	EReference getlistOfCurves_Curve();

	/**
	 * Returns the meta object for class '{@link sedml.curve <em>curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>curve</em>'.
	 * @see sedml.curve
	 * @generated
	 */
	EClass getcurve();

	/**
	 * Returns the meta object for the attribute '{@link sedml.curve#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sedml.curve#getId()
	 * @see #getcurve()
	 * @generated
	 */
	EAttribute getcurve_Id();

	/**
	 * Returns the meta object for the attribute '{@link sedml.curve#getLogX <em>Log X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log X</em>'.
	 * @see sedml.curve#getLogX()
	 * @see #getcurve()
	 * @generated
	 */
	EAttribute getcurve_LogX();

	/**
	 * Returns the meta object for the attribute '{@link sedml.curve#getLogY <em>Log Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Y</em>'.
	 * @see sedml.curve#getLogY()
	 * @see #getcurve()
	 * @generated
	 */
	EAttribute getcurve_LogY();

	/**
	 * Returns the meta object for the attribute '{@link sedml.curve#getXDataReference <em>XData Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XData Reference</em>'.
	 * @see sedml.curve#getXDataReference()
	 * @see #getcurve()
	 * @generated
	 */
	EAttribute getcurve_XDataReference();

	/**
	 * Returns the meta object for the attribute '{@link sedml.curve#getYDataReference <em>YData Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YData Reference</em>'.
	 * @see sedml.curve#getYDataReference()
	 * @see #getcurve()
	 * @generated
	 */
	EAttribute getcurve_YDataReference();

	/**
	 * Returns the meta object for class '{@link sedml.dataGenerator <em>data Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>data Generator</em>'.
	 * @see sedml.dataGenerator
	 * @generated
	 */
	EClass getdataGenerator();

	/**
	 * Returns the meta object for the attribute '{@link sedml.dataGenerator#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sedml.dataGenerator#getId()
	 * @see #getdataGenerator()
	 * @generated
	 */
	EAttribute getdataGenerator_Id();

	/**
	 * Returns the meta object for the attribute '{@link sedml.dataGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sedml.dataGenerator#getName()
	 * @see #getdataGenerator()
	 * @generated
	 */
	EAttribute getdataGenerator_Name();

	/**
	 * Returns the meta object for the containment reference '{@link sedml.dataGenerator#getListOfVariables <em>List Of Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Of Variables</em>'.
	 * @see sedml.dataGenerator#getListOfVariables()
	 * @see #getdataGenerator()
	 * @generated
	 */
	EReference getdataGenerator_ListOfVariables();

	/**
	 * Returns the meta object for the containment reference '{@link sedml.dataGenerator#getMath <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Math</em>'.
	 * @see sedml.dataGenerator#getMath()
	 * @see #getdataGenerator()
	 * @generated
	 */
	EReference getdataGenerator_Math();

	/**
	 * Returns the meta object for class '{@link sedml.listOfVariables <em>list Of Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>list Of Variables</em>'.
	 * @see sedml.listOfVariables
	 * @generated
	 */
	EClass getlistOfVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link sedml.listOfVariables#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see sedml.listOfVariables#getVariable()
	 * @see #getlistOfVariables()
	 * @generated
	 */
	EReference getlistOfVariables_Variable();

	/**
	 * Returns the meta object for class '{@link sedml.variable <em>variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>variable</em>'.
	 * @see sedml.variable
	 * @generated
	 */
	EClass getvariable();

	/**
	 * Returns the meta object for the attribute '{@link sedml.variable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sedml.variable#getId()
	 * @see #getvariable()
	 * @generated
	 */
	EAttribute getvariable_Id();

	/**
	 * Returns the meta object for the attribute '{@link sedml.variable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see sedml.variable#getTarget()
	 * @see #getvariable()
	 * @generated
	 */
	EAttribute getvariable_Target();

	/**
	 * Returns the meta object for the reference '{@link sedml.variable#getTaskReference <em>Task Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Reference</em>'.
	 * @see sedml.variable#getTaskReference()
	 * @see #getvariable()
	 * @generated
	 */
	EReference getvariable_TaskReference();

	/**
	 * Returns the meta object for the attribute '{@link sedml.variable#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see sedml.variable#getSymbol()
	 * @see #getvariable()
	 * @generated
	 */
	EAttribute getvariable_Symbol();

	/**
	 * Returns the meta object for class '{@link sedml.math <em>math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>math</em>'.
	 * @see sedml.math
	 * @generated
	 */
	EClass getmath();

	/**
	 * Returns the meta object for the attribute '{@link sedml.math#getXlms <em>Xlms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xlms</em>'.
	 * @see sedml.math#getXlms()
	 * @see #getmath()
	 * @generated
	 */
	EAttribute getmath_Xlms();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SedmlFactory getSedmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sedml.impl.sedMLImpl <em>sed ML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.sedMLImpl
		 * @see sedml.impl.SedmlPackageImpl#getsedML()
		 * @generated
		 */
		EClass SED_ML = eINSTANCE.getsedML();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SED_ML__VERSION = eINSTANCE.getsedML_Version();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SED_ML__LEVEL = eINSTANCE.getsedML_Level();

		/**
		 * The meta object literal for the '<em><b>List Of Simulations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SED_ML__LIST_OF_SIMULATIONS = eINSTANCE.getsedML_ListOfSimulations();

		/**
		 * The meta object literal for the '<em><b>List Of Models</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SED_ML__LIST_OF_MODELS = eINSTANCE.getsedML_ListOfModels();

		/**
		 * The meta object literal for the '<em><b>List Of Tasks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SED_ML__LIST_OF_TASKS = eINSTANCE.getsedML_ListOfTasks();

		/**
		 * The meta object literal for the '<em><b>List Of Data Generators</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SED_ML__LIST_OF_DATA_GENERATORS = eINSTANCE.getsedML_ListOfDataGenerators();

		/**
		 * The meta object literal for the '<em><b>List Of Outputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SED_ML__LIST_OF_OUTPUTS = eINSTANCE.getsedML_ListOfOutputs();

		/**
		 * The meta object literal for the '{@link sedml.impl.listOfSimulationsImpl <em>list Of Simulations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.listOfSimulationsImpl
		 * @see sedml.impl.SedmlPackageImpl#getlistOfSimulations()
		 * @generated
		 */
		EClass LIST_OF_SIMULATIONS = eINSTANCE.getlistOfSimulations();

		/**
		 * The meta object literal for the '<em><b>Uniform Time Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_SIMULATIONS__UNIFORM_TIME_COURSE = eINSTANCE.getlistOfSimulations_UniformTimeCourse();

		/**
		 * The meta object literal for the '{@link sedml.impl.listOfModelsImpl <em>list Of Models</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.listOfModelsImpl
		 * @see sedml.impl.SedmlPackageImpl#getlistOfModels()
		 * @generated
		 */
		EClass LIST_OF_MODELS = eINSTANCE.getlistOfModels();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_MODELS__MODEL = eINSTANCE.getlistOfModels_Model();

		/**
		 * The meta object literal for the '{@link sedml.impl.listOfTasksImpl <em>list Of Tasks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.listOfTasksImpl
		 * @see sedml.impl.SedmlPackageImpl#getlistOfTasks()
		 * @generated
		 */
		EClass LIST_OF_TASKS = eINSTANCE.getlistOfTasks();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_TASKS__TASK = eINSTANCE.getlistOfTasks_Task();

		/**
		 * The meta object literal for the '{@link sedml.impl.listOfDataGeneratorsImpl <em>list Of Data Generators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.listOfDataGeneratorsImpl
		 * @see sedml.impl.SedmlPackageImpl#getlistOfDataGenerators()
		 * @generated
		 */
		EClass LIST_OF_DATA_GENERATORS = eINSTANCE.getlistOfDataGenerators();

		/**
		 * The meta object literal for the '<em><b>Data Generator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_DATA_GENERATORS__DATA_GENERATOR = eINSTANCE.getlistOfDataGenerators_DataGenerator();

		/**
		 * The meta object literal for the '{@link sedml.impl.listOfOutputsImpl <em>list Of Outputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.listOfOutputsImpl
		 * @see sedml.impl.SedmlPackageImpl#getlistOfOutputs()
		 * @generated
		 */
		EClass LIST_OF_OUTPUTS = eINSTANCE.getlistOfOutputs();

		/**
		 * The meta object literal for the '<em><b>Plot2 D</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_OUTPUTS__PLOT2_D = eINSTANCE.getlistOfOutputs_Plot2D();

		/**
		 * The meta object literal for the '{@link sedml.impl.uniformTimeCourseImpl <em>uniform Time Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.uniformTimeCourseImpl
		 * @see sedml.impl.SedmlPackageImpl#getuniformTimeCourse()
		 * @generated
		 */
		EClass UNIFORM_TIME_COURSE = eINSTANCE.getuniformTimeCourse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_TIME_COURSE__ID = eINSTANCE.getuniformTimeCourse_Id();

		/**
		 * The meta object literal for the '<em><b>Initial Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_TIME_COURSE__INITIAL_TIME = eINSTANCE.getuniformTimeCourse_InitialTime();

		/**
		 * The meta object literal for the '<em><b>Output Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_TIME_COURSE__OUTPUT_START_TIME = eINSTANCE.getuniformTimeCourse_OutputStartTime();

		/**
		 * The meta object literal for the '<em><b>Output End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_TIME_COURSE__OUTPUT_END_TIME = eINSTANCE.getuniformTimeCourse_OutputEndTime();

		/**
		 * The meta object literal for the '<em><b>Number Of Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_TIME_COURSE__NUMBER_OF_POINTS = eINSTANCE.getuniformTimeCourse_NumberOfPoints();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFORM_TIME_COURSE__ALGORITHM = eINSTANCE.getuniformTimeCourse_Algorithm();

		/**
		 * The meta object literal for the '{@link sedml.impl.algorithmImpl <em>algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.algorithmImpl
		 * @see sedml.impl.SedmlPackageImpl#getalgorithm()
		 * @generated
		 */
		EClass ALGORITHM = eINSTANCE.getalgorithm();

		/**
		 * The meta object literal for the '<em><b>Kisao ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__KISAO_ID = eINSTANCE.getalgorithm_KisaoID();

		/**
		 * The meta object literal for the '{@link sedml.impl.modelImpl <em>model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.modelImpl
		 * @see sedml.impl.SedmlPackageImpl#getmodel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getmodel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__ID = eINSTANCE.getmodel_Id();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__LANGUAGE = eINSTANCE.getmodel_Language();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__SOURCE = eINSTANCE.getmodel_Source();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getmodel_Name();

		/**
		 * The meta object literal for the '{@link sedml.impl.taskImpl <em>task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.taskImpl
		 * @see sedml.impl.SedmlPackageImpl#gettask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.gettask();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.gettask_Id();

		/**
		 * The meta object literal for the '<em><b>Model Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__MODEL_REFERENCE = eINSTANCE.gettask_ModelReference();

		/**
		 * The meta object literal for the '<em><b>Simulation Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SIMULATION_REFERENCE = eINSTANCE.gettask_SimulationReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.gettask_Name();

		/**
		 * The meta object literal for the '{@link sedml.impl.plot2DImpl <em>plot2 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.plot2DImpl
		 * @see sedml.impl.SedmlPackageImpl#getplot2D()
		 * @generated
		 */
		EClass PLOT2_D = eINSTANCE.getplot2D();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT2_D__ID = eINSTANCE.getplot2D_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT2_D__NAME = eINSTANCE.getplot2D_Name();

		/**
		 * The meta object literal for the '<em><b>List Of Curves</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT2_D__LIST_OF_CURVES = eINSTANCE.getplot2D_ListOfCurves();

		/**
		 * The meta object literal for the '{@link sedml.impl.listOfCurvesImpl <em>list Of Curves</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.listOfCurvesImpl
		 * @see sedml.impl.SedmlPackageImpl#getlistOfCurves()
		 * @generated
		 */
		EClass LIST_OF_CURVES = eINSTANCE.getlistOfCurves();

		/**
		 * The meta object literal for the '<em><b>Curve</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_CURVES__CURVE = eINSTANCE.getlistOfCurves_Curve();

		/**
		 * The meta object literal for the '{@link sedml.impl.curveImpl <em>curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.curveImpl
		 * @see sedml.impl.SedmlPackageImpl#getcurve()
		 * @generated
		 */
		EClass CURVE = eINSTANCE.getcurve();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__ID = eINSTANCE.getcurve_Id();

		/**
		 * The meta object literal for the '<em><b>Log X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__LOG_X = eINSTANCE.getcurve_LogX();

		/**
		 * The meta object literal for the '<em><b>Log Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__LOG_Y = eINSTANCE.getcurve_LogY();

		/**
		 * The meta object literal for the '<em><b>XData Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__XDATA_REFERENCE = eINSTANCE.getcurve_XDataReference();

		/**
		 * The meta object literal for the '<em><b>YData Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__YDATA_REFERENCE = eINSTANCE.getcurve_YDataReference();

		/**
		 * The meta object literal for the '{@link sedml.impl.dataGeneratorImpl <em>data Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.dataGeneratorImpl
		 * @see sedml.impl.SedmlPackageImpl#getdataGenerator()
		 * @generated
		 */
		EClass DATA_GENERATOR = eINSTANCE.getdataGenerator();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_GENERATOR__ID = eINSTANCE.getdataGenerator_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_GENERATOR__NAME = eINSTANCE.getdataGenerator_Name();

		/**
		 * The meta object literal for the '<em><b>List Of Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_GENERATOR__LIST_OF_VARIABLES = eINSTANCE.getdataGenerator_ListOfVariables();

		/**
		 * The meta object literal for the '<em><b>Math</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_GENERATOR__MATH = eINSTANCE.getdataGenerator_Math();

		/**
		 * The meta object literal for the '{@link sedml.impl.listOfVariablesImpl <em>list Of Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.listOfVariablesImpl
		 * @see sedml.impl.SedmlPackageImpl#getlistOfVariables()
		 * @generated
		 */
		EClass LIST_OF_VARIABLES = eINSTANCE.getlistOfVariables();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_VARIABLES__VARIABLE = eINSTANCE.getlistOfVariables_Variable();

		/**
		 * The meta object literal for the '{@link sedml.impl.variableImpl <em>variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.variableImpl
		 * @see sedml.impl.SedmlPackageImpl#getvariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getvariable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ID = eINSTANCE.getvariable_Id();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TARGET = eINSTANCE.getvariable_Target();

		/**
		 * The meta object literal for the '<em><b>Task Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TASK_REFERENCE = eINSTANCE.getvariable_TaskReference();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__SYMBOL = eINSTANCE.getvariable_Symbol();

		/**
		 * The meta object literal for the '{@link sedml.impl.mathImpl <em>math</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sedml.impl.mathImpl
		 * @see sedml.impl.SedmlPackageImpl#getmath()
		 * @generated
		 */
		EClass MATH = eINSTANCE.getmath();

		/**
		 * The meta object literal for the '<em><b>Xlms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATH__XLMS = eINSTANCE.getmath_Xlms();

	}

} //SedmlPackage
