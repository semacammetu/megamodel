/**
 *
 * $Id$
 */
package tr.edu.metu.ceng.xperimenter.validation;

import org.eclipse.emf.common.util.EList;

import tr.edu.metu.ceng.xperimenter.SamplingMethod;
import tr.edu.metu.ceng.xperimenter.Variable;

/**
 * A sample validator interface for {@link tr.edu.metu.ceng.xperimenter.Design}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DesignValidator {
	boolean validate();

	boolean validateMethod(SamplingMethod value);
	boolean validateVariables(EList<Variable> value);
}
