/**
 *
 * $Id$
 */
package SC.validation;

import SC.Damages;
import SC.SecurityGoal;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link SC.Threat}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ThreatValidator {
	boolean validate();

	boolean validateDescription(String value);
	boolean validateThreatID(int value);
	boolean validateAttackPotential(Damages value);
	boolean validateSecuritygoal(EList<SecurityGoal> value);
}