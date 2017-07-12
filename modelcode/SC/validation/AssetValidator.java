/**
 *
 * $Id$
 */
package SC.validation;

import SC.Component;
import SC.Data;
import SC.SecurityGoal;

import SC.Threat;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link SC.Asset}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AssetValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateAssetID(int value);
	boolean validateSecurityGoals(EList<SecurityGoal> value);

	boolean validateSecuritygoals(EList<SecurityGoal> value);
	boolean validateComponent(Component value);

	boolean validateData(Data value);

	boolean validateThreats(EList<Threat> value);
}
