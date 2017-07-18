/**
 *
 * $Id$
 */
package SC.validation;

import SC.Asset;
import SC.Component;
import SC.Connection;
import SC.Control;
import SC.Data;
import SC.SecurityGoal;
import SC.Threat;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link SC.SecurityConcept}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SecurityConceptValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateSecurityGoals(EList<SecurityGoal> value);
	boolean validateThreats(EList<Threat> value);
	boolean validateControls(EList<Control> value);
	boolean validateAssets(EList<Asset> value);
	boolean validateComponents(EList<Component> value);
	boolean validateData(EList<Data> value);
	boolean validateConnections(EList<Connection> value);

	boolean validateConnection(EList<Connection> value);
}