/**
 *
 * $Id$
 */
package tr.edu.metu.ceng.xperimenter.validation;

import tr.edu.metu.ceng.xperimenter.Design;
import tr.edu.metu.ceng.xperimenter.Objective;
import tr.edu.metu.ceng.xperimenter.Simulation;
import tr.edu.metu.ceng.xperimenter.StatAnalysis;
import tr.edu.metu.ceng.xperimenter.VisualizationType;

/**
 * A sample validator interface for {@link tr.edu.metu.ceng.xperimenter.Experiment}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExperimentValidator {
	boolean validate();

	boolean validateDescription(String value);
	boolean validateObjective(Objective value);
	boolean validateDesign(Design value);
	boolean validateSimulation(Simulation value);
	boolean validateAnalysis(StatAnalysis value);
	boolean validateVisualization(VisualizationType value);
	boolean validateTimeout(int value);
}
