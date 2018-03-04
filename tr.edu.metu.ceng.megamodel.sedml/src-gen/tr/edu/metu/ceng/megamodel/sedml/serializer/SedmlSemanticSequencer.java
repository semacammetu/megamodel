/*
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.sedml.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import tr.edu.metu.ceng.megamodel.sedml.sedml.SedmlPackage;
import tr.edu.metu.ceng.megamodel.sedml.sedml.algorithm;
import tr.edu.metu.ceng.megamodel.sedml.sedml.curve;
import tr.edu.metu.ceng.megamodel.sedml.sedml.dataGenerator;
import tr.edu.metu.ceng.megamodel.sedml.sedml.listOfCurves;
import tr.edu.metu.ceng.megamodel.sedml.sedml.listOfDataGenerators;
import tr.edu.metu.ceng.megamodel.sedml.sedml.listOfModels;
import tr.edu.metu.ceng.megamodel.sedml.sedml.listOfOutputs;
import tr.edu.metu.ceng.megamodel.sedml.sedml.listOfSimulations;
import tr.edu.metu.ceng.megamodel.sedml.sedml.listOfTasks;
import tr.edu.metu.ceng.megamodel.sedml.sedml.listOfVariables;
import tr.edu.metu.ceng.megamodel.sedml.sedml.math;
import tr.edu.metu.ceng.megamodel.sedml.sedml.model;
import tr.edu.metu.ceng.megamodel.sedml.sedml.plot2D;
import tr.edu.metu.ceng.megamodel.sedml.sedml.sedML;
import tr.edu.metu.ceng.megamodel.sedml.sedml.task;
import tr.edu.metu.ceng.megamodel.sedml.sedml.uniformTimeCourse;
import tr.edu.metu.ceng.megamodel.sedml.sedml.variable;
import tr.edu.metu.ceng.megamodel.sedml.services.SedmlGrammarAccess;

@SuppressWarnings("all")
public class SedmlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SedmlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SedmlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SedmlPackage.ALGORITHM:
				sequence_algorithm(context, (algorithm) semanticObject); 
				return; 
			case SedmlPackage.CURVE:
				sequence_curve(context, (curve) semanticObject); 
				return; 
			case SedmlPackage.DATA_GENERATOR:
				sequence_dataGenerator(context, (dataGenerator) semanticObject); 
				return; 
			case SedmlPackage.LIST_OF_CURVES:
				sequence_listOfCurves(context, (listOfCurves) semanticObject); 
				return; 
			case SedmlPackage.LIST_OF_DATA_GENERATORS:
				sequence_listOfDataGenerators(context, (listOfDataGenerators) semanticObject); 
				return; 
			case SedmlPackage.LIST_OF_MODELS:
				sequence_listOfModels(context, (listOfModels) semanticObject); 
				return; 
			case SedmlPackage.LIST_OF_OUTPUTS:
				sequence_listOfOutputs(context, (listOfOutputs) semanticObject); 
				return; 
			case SedmlPackage.LIST_OF_SIMULATIONS:
				sequence_listOfSimulations(context, (listOfSimulations) semanticObject); 
				return; 
			case SedmlPackage.LIST_OF_TASKS:
				sequence_listOfTasks(context, (listOfTasks) semanticObject); 
				return; 
			case SedmlPackage.LIST_OF_VARIABLES:
				sequence_listOfVariables(context, (listOfVariables) semanticObject); 
				return; 
			case SedmlPackage.MATH:
				sequence_math(context, (math) semanticObject); 
				return; 
			case SedmlPackage.MODEL:
				sequence_model(context, (model) semanticObject); 
				return; 
			case SedmlPackage.PLOT2_D:
				sequence_plot2D(context, (plot2D) semanticObject); 
				return; 
			case SedmlPackage.SED_ML:
				sequence_sedML(context, (sedML) semanticObject); 
				return; 
			case SedmlPackage.TASK:
				sequence_task(context, (task) semanticObject); 
				return; 
			case SedmlPackage.UNIFORM_TIME_COURSE:
				sequence_uniformTimeCourse(context, (uniformTimeCourse) semanticObject); 
				return; 
			case SedmlPackage.VARIABLE:
				sequence_variable(context, (variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     algorithm returns algorithm
	 *
	 * Constraint:
	 *     kisaoID=STRING
	 */
	protected void sequence_algorithm(ISerializationContext context, algorithm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.ALGORITHM__KISAO_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.ALGORITHM__KISAO_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAlgorithmAccess().getKisaoIDSTRINGTerminalRuleCall_4_0(), semanticObject.getKisaoID());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     curve returns curve
	 *
	 * Constraint:
	 *     (id=STRING logX=STRING logY=STRING xDataReference=STRING yDataReference=STRING)
	 */
	protected void sequence_curve(ISerializationContext context, curve semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.CURVE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.CURVE__ID));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.CURVE__LOG_X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.CURVE__LOG_X));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.CURVE__LOG_Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.CURVE__LOG_Y));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.CURVE__XDATA_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.CURVE__XDATA_REFERENCE));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.CURVE__YDATA_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.CURVE__YDATA_REFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCurveAccess().getIdSTRINGTerminalRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getCurveAccess().getLogXSTRINGTerminalRuleCall_7_0(), semanticObject.getLogX());
		feeder.accept(grammarAccess.getCurveAccess().getLogYSTRINGTerminalRuleCall_10_0(), semanticObject.getLogY());
		feeder.accept(grammarAccess.getCurveAccess().getXDataReferenceSTRINGTerminalRuleCall_13_0(), semanticObject.getXDataReference());
		feeder.accept(grammarAccess.getCurveAccess().getYDataReferenceSTRINGTerminalRuleCall_16_0(), semanticObject.getYDataReference());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     dataGenerator returns dataGenerator
	 *
	 * Constraint:
	 *     (id=STRING listOfVariables=listOfVariables math=math name=STRING)
	 */
	protected void sequence_dataGenerator(ISerializationContext context, dataGenerator semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.DATA_GENERATOR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.DATA_GENERATOR__ID));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.DATA_GENERATOR__LIST_OF_VARIABLES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.DATA_GENERATOR__LIST_OF_VARIABLES));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.DATA_GENERATOR__MATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.DATA_GENERATOR__MATH));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.DATA_GENERATOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.DATA_GENERATOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataGeneratorAccess().getIdSTRINGTerminalRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getDataGeneratorAccess().getListOfVariablesListOfVariablesParserRuleCall_5_0(), semanticObject.getListOfVariables());
		feeder.accept(grammarAccess.getDataGeneratorAccess().getMathMathParserRuleCall_6_0(), semanticObject.getMath());
		feeder.accept(grammarAccess.getDataGeneratorAccess().getNameSTRINGTerminalRuleCall_9_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     listOfCurves returns listOfCurves
	 *
	 * Constraint:
	 *     curve+=curve+
	 */
	protected void sequence_listOfCurves(ISerializationContext context, listOfCurves semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     listOfDataGenerators returns listOfDataGenerators
	 *
	 * Constraint:
	 *     datagenerator+=dataGenerator+
	 */
	protected void sequence_listOfDataGenerators(ISerializationContext context, listOfDataGenerators semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     listOfModels returns listOfModels
	 *
	 * Constraint:
	 *     model+=model+
	 */
	protected void sequence_listOfModels(ISerializationContext context, listOfModels semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     listOfOutputs returns listOfOutputs
	 *
	 * Constraint:
	 *     plot2D+=plot2D+
	 */
	protected void sequence_listOfOutputs(ISerializationContext context, listOfOutputs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     listOfSimulations returns listOfSimulations
	 *
	 * Constraint:
	 *     uniformTimeCourse+=uniformTimeCourse+
	 */
	protected void sequence_listOfSimulations(ISerializationContext context, listOfSimulations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     listOfTasks returns listOfTasks
	 *
	 * Constraint:
	 *     task+=task+
	 */
	protected void sequence_listOfTasks(ISerializationContext context, listOfTasks semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     listOfVariables returns listOfVariables
	 *
	 * Constraint:
	 *     variable+=variable+
	 */
	protected void sequence_listOfVariables(ISerializationContext context, listOfVariables semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     math returns math
	 *
	 * Constraint:
	 *     xlms=STRING
	 */
	protected void sequence_math(ISerializationContext context, math semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.MATH__XLMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.MATH__XLMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMathAccess().getXlmsSTRINGTerminalRuleCall_4_0(), semanticObject.getXlms());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     model returns model
	 *
	 * Constraint:
	 *     (id=STRING language=STRING source=STRING name=STRING)
	 */
	protected void sequence_model(ISerializationContext context, model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.MODEL__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.MODEL__ID));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.MODEL__LANGUAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.MODEL__LANGUAGE));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.MODEL__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.MODEL__SOURCE));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.MODEL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getIdSTRINGTerminalRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getModelAccess().getLanguageSTRINGTerminalRuleCall_7_0(), semanticObject.getLanguage());
		feeder.accept(grammarAccess.getModelAccess().getSourceSTRINGTerminalRuleCall_10_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_13_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     plot2D returns plot2D
	 *
	 * Constraint:
	 *     (id=STRING name=STRING listOfCurves=listOfCurves)
	 */
	protected void sequence_plot2D(ISerializationContext context, plot2D semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.PLOT2_D__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.PLOT2_D__ID));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.PLOT2_D__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.PLOT2_D__NAME));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.PLOT2_D__LIST_OF_CURVES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.PLOT2_D__LIST_OF_CURVES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlot2DAccess().getIdSTRINGTerminalRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getPlot2DAccess().getNameSTRINGTerminalRuleCall_7_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPlot2DAccess().getListOfCurvesListOfCurvesParserRuleCall_8_0(), semanticObject.getListOfCurves());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     sedML returns sedML
	 *
	 * Constraint:
	 *     (
	 *         version=INT 
	 *         level=INT 
	 *         listOfSimulations=listOfSimulations 
	 *         listOfModels=listOfModels 
	 *         listOfTasks=listOfTasks 
	 *         listOfDataGenerators=listOfDataGenerators 
	 *         listOfOutputs=listOfOutputs
	 *     )
	 */
	protected void sequence_sedML(ISerializationContext context, sedML semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.SED_ML__VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.SED_ML__VERSION));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.SED_ML__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.SED_ML__LEVEL));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.SED_ML__LIST_OF_SIMULATIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.SED_ML__LIST_OF_SIMULATIONS));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.SED_ML__LIST_OF_MODELS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.SED_ML__LIST_OF_MODELS));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.SED_ML__LIST_OF_TASKS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.SED_ML__LIST_OF_TASKS));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.SED_ML__LIST_OF_DATA_GENERATORS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.SED_ML__LIST_OF_DATA_GENERATORS));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.SED_ML__LIST_OF_OUTPUTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.SED_ML__LIST_OF_OUTPUTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSedMLAccess().getVersionINTTerminalRuleCall_0_0(), semanticObject.getVersion());
		feeder.accept(grammarAccess.getSedMLAccess().getLevelINTTerminalRuleCall_1_0(), semanticObject.getLevel());
		feeder.accept(grammarAccess.getSedMLAccess().getListOfSimulationsListOfSimulationsParserRuleCall_2_0(), semanticObject.getListOfSimulations());
		feeder.accept(grammarAccess.getSedMLAccess().getListOfModelsListOfModelsParserRuleCall_3_0(), semanticObject.getListOfModels());
		feeder.accept(grammarAccess.getSedMLAccess().getListOfTasksListOfTasksParserRuleCall_4_0(), semanticObject.getListOfTasks());
		feeder.accept(grammarAccess.getSedMLAccess().getListOfDataGeneratorsListOfDataGeneratorsParserRuleCall_5_0(), semanticObject.getListOfDataGenerators());
		feeder.accept(grammarAccess.getSedMLAccess().getListOfOutputsListOfOutputsParserRuleCall_6_0(), semanticObject.getListOfOutputs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     task returns task
	 *
	 * Constraint:
	 *     (id=STRING modelReference=model simulationReference=uniformTimeCourse name=STRING)
	 */
	protected void sequence_task(ISerializationContext context, task semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.TASK__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.TASK__ID));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.TASK__MODEL_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.TASK__MODEL_REFERENCE));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.TASK__SIMULATION_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.TASK__SIMULATION_REFERENCE));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.TASK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.TASK__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTaskAccess().getIdSTRINGTerminalRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getTaskAccess().getModelReferenceModelParserRuleCall_7_0(), semanticObject.getModelReference());
		feeder.accept(grammarAccess.getTaskAccess().getSimulationReferenceUniformTimeCourseParserRuleCall_10_0(), semanticObject.getSimulationReference());
		feeder.accept(grammarAccess.getTaskAccess().getNameSTRINGTerminalRuleCall_13_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     uniformTimeCourse returns uniformTimeCourse
	 *
	 * Constraint:
	 *     (
	 *         id=STRING 
	 *         initialTime=INT 
	 *         outputStartTime=INT 
	 *         outputEndTime=INT 
	 *         numberOfPoints=INT 
	 *         algorithm=algorithm
	 *     )
	 */
	protected void sequence_uniformTimeCourse(ISerializationContext context, uniformTimeCourse semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.UNIFORM_TIME_COURSE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.UNIFORM_TIME_COURSE__ID));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.UNIFORM_TIME_COURSE__INITIAL_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.UNIFORM_TIME_COURSE__INITIAL_TIME));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.UNIFORM_TIME_COURSE__OUTPUT_START_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.UNIFORM_TIME_COURSE__OUTPUT_START_TIME));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.UNIFORM_TIME_COURSE__OUTPUT_END_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.UNIFORM_TIME_COURSE__OUTPUT_END_TIME));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.UNIFORM_TIME_COURSE__NUMBER_OF_POINTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.UNIFORM_TIME_COURSE__NUMBER_OF_POINTS));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.UNIFORM_TIME_COURSE__ALGORITHM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.UNIFORM_TIME_COURSE__ALGORITHM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUniformTimeCourseAccess().getIdSTRINGTerminalRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getUniformTimeCourseAccess().getInitialTimeINTTerminalRuleCall_7_0(), semanticObject.getInitialTime());
		feeder.accept(grammarAccess.getUniformTimeCourseAccess().getOutputStartTimeINTTerminalRuleCall_10_0(), semanticObject.getOutputStartTime());
		feeder.accept(grammarAccess.getUniformTimeCourseAccess().getOutputEndTimeINTTerminalRuleCall_13_0(), semanticObject.getOutputEndTime());
		feeder.accept(grammarAccess.getUniformTimeCourseAccess().getNumberOfPointsINTTerminalRuleCall_16_0(), semanticObject.getNumberOfPoints());
		feeder.accept(grammarAccess.getUniformTimeCourseAccess().getAlgorithmAlgorithmParserRuleCall_17_0(), semanticObject.getAlgorithm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     variable returns variable
	 *
	 * Constraint:
	 *     (id=STRING target=STRING taskReference=task symbol=STRING)
	 */
	protected void sequence_variable(ISerializationContext context, variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.VARIABLE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.VARIABLE__ID));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.VARIABLE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.VARIABLE__TARGET));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.VARIABLE__TASK_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.VARIABLE__TASK_REFERENCE));
			if (transientValues.isValueTransient(semanticObject, SedmlPackage.Literals.VARIABLE__SYMBOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SedmlPackage.Literals.VARIABLE__SYMBOL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getIdSTRINGTerminalRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getVariableAccess().getTargetSTRINGTerminalRuleCall_7_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getVariableAccess().getTaskReferenceTaskParserRuleCall_10_0(), semanticObject.getTaskReference());
		feeder.accept(grammarAccess.getVariableAccess().getSymbolSTRINGTerminalRuleCall_13_0(), semanticObject.getSymbol());
		feeder.finish();
	}
	
	
}
