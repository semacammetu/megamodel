/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage
 * @generated
 */
public class HypoMethodAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HypoMethodPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HypoMethodAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = HypoMethodPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected HypoMethodSwitch<Adapter> modelSwitch =
    new HypoMethodSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseExperimentOntology(ExperimentOntology object)
      {
        return createExperimentOntologyAdapter();
      }
      @Override
      public Adapter caseModelSection(ModelSection object)
      {
        return createModelSectionAdapter();
      }
      @Override
      public Adapter caseMechanism(Mechanism object)
      {
        return createMechanismAdapter();
      }
      @Override
      public Adapter caseReaction(Reaction object)
      {
        return createReactionAdapter();
      }
      @Override
      public Adapter caseGuardCondition(GuardCondition object)
      {
        return createGuardConditionAdapter();
      }
      @Override
      public Adapter caseEventDescriptor(EventDescriptor object)
      {
        return createEventDescriptorAdapter();
      }
      @Override
      public Adapter caseFactor(Factor object)
      {
        return createFactorAdapter();
      }
      @Override
      public Adapter caseproperties(properties object)
      {
        return createpropertiesAdapter();
      }
      @Override
      public Adapter caseValues(Values object)
      {
        return createValuesAdapter();
      }
      @Override
      public Adapter caseGoals(Goals object)
      {
        return createGoalsAdapter();
      }
      @Override
      public Adapter caseHypothesis(Hypothesis object)
      {
        return createHypothesisAdapter();
      }
      @Override
      public Adapter caseCoherenceLink(CoherenceLink object)
      {
        return createCoherenceLinkAdapter();
      }
      @Override
      public Adapter caseMechHypothesis(MechHypothesis object)
      {
        return createMechHypothesisAdapter();
      }
      @Override
      public Adapter caseEvidence(Evidence object)
      {
        return createEvidenceAdapter();
      }
      @Override
      public Adapter caseTemporalPattern(TemporalPattern object)
      {
        return createTemporalPatternAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseSimultaneous(Simultaneous object)
      {
        return createSimultaneousAdapter();
      }
      @Override
      public Adapter caseDispersed(Dispersed object)
      {
        return createDispersedAdapter();
      }
      @Override
      public Adapter caseRelationalQuery(RelationalQuery object)
      {
        return createRelationalQueryAdapter();
      }
      @Override
      public Adapter caseQuery1(Query1 object)
      {
        return createQuery1Adapter();
      }
      @Override
      public Adapter caseQuery2(Query2 object)
      {
        return createQuery2Adapter();
      }
      @Override
      public Adapter caseQuery3(Query3 object)
      {
        return createQuery3Adapter();
      }
      @Override
      public Adapter caseExperiment(Experiment object)
      {
        return createExperimentAdapter();
      }
      @Override
      public Adapter caseDesign(Design object)
      {
        return createDesignAdapter();
      }
      @Override
      public Adapter caseVariables(Variables object)
      {
        return createVariablesAdapter();
      }
      @Override
      public Adapter caseIndependentVariables(IndependentVariables object)
      {
        return createIndependentVariablesAdapter();
      }
      @Override
      public Adapter caseControlVariables(ControlVariables object)
      {
        return createControlVariablesAdapter();
      }
      @Override
      public Adapter caseDependentVariables(DependentVariables object)
      {
        return createDependentVariablesAdapter();
      }
      @Override
      public Adapter caseFactorLevels(FactorLevels object)
      {
        return createFactorLevelsAdapter();
      }
      @Override
      public Adapter caseResponse(Response object)
      {
        return createResponseAdapter();
      }
      @Override
      public Adapter caseIteration(Iteration object)
      {
        return createIterationAdapter();
      }
      @Override
      public Adapter casePerformanceMeasure(PerformanceMeasure object)
      {
        return createPerformanceMeasureAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.ExperimentOntology <em>Experiment Ontology</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.ExperimentOntology
   * @generated
   */
  public Adapter createExperimentOntologyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.ModelSection <em>Model Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.ModelSection
   * @generated
   */
  public Adapter createModelSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Mechanism <em>Mechanism</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Mechanism
   * @generated
   */
  public Adapter createMechanismAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Reaction <em>Reaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Reaction
   * @generated
   */
  public Adapter createReactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.GuardCondition <em>Guard Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.GuardCondition
   * @generated
   */
  public Adapter createGuardConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.EventDescriptor <em>Event Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.EventDescriptor
   * @generated
   */
  public Adapter createEventDescriptorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Factor
   * @generated
   */
  public Adapter createFactorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.properties <em>properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.properties
   * @generated
   */
  public Adapter createpropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Values <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Values
   * @generated
   */
  public Adapter createValuesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Goals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Goals
   * @generated
   */
  public Adapter createGoalsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Hypothesis <em>Hypothesis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Hypothesis
   * @generated
   */
  public Adapter createHypothesisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.CoherenceLink <em>Coherence Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.CoherenceLink
   * @generated
   */
  public Adapter createCoherenceLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.MechHypothesis <em>Mech Hypothesis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.MechHypothesis
   * @generated
   */
  public Adapter createMechHypothesisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Evidence <em>Evidence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Evidence
   * @generated
   */
  public Adapter createEvidenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.TemporalPattern <em>Temporal Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.TemporalPattern
   * @generated
   */
  public Adapter createTemporalPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Simultaneous <em>Simultaneous</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Simultaneous
   * @generated
   */
  public Adapter createSimultaneousAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Dispersed <em>Dispersed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Dispersed
   * @generated
   */
  public Adapter createDispersedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.RelationalQuery <em>Relational Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.RelationalQuery
   * @generated
   */
  public Adapter createRelationalQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Query1 <em>Query1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Query1
   * @generated
   */
  public Adapter createQuery1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Query2 <em>Query2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Query2
   * @generated
   */
  public Adapter createQuery2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Query3 <em>Query3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Query3
   * @generated
   */
  public Adapter createQuery3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Experiment <em>Experiment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Experiment
   * @generated
   */
  public Adapter createExperimentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Design <em>Design</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Design
   * @generated
   */
  public Adapter createDesignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Variables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Variables
   * @generated
   */
  public Adapter createVariablesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.IndependentVariables <em>Independent Variables</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.IndependentVariables
   * @generated
   */
  public Adapter createIndependentVariablesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.ControlVariables <em>Control Variables</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.ControlVariables
   * @generated
   */
  public Adapter createControlVariablesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.DependentVariables <em>Dependent Variables</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.DependentVariables
   * @generated
   */
  public Adapter createDependentVariablesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.FactorLevels <em>Factor Levels</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.FactorLevels
   * @generated
   */
  public Adapter createFactorLevelsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Response <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Response
   * @generated
   */
  public Adapter createResponseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Iteration <em>Iteration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Iteration
   * @generated
   */
  public Adapter createIterationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.PerformanceMeasure <em>Performance Measure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.PerformanceMeasure
   * @generated
   */
  public Adapter createPerformanceMeasureAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //HypoMethodAdapterFactory
