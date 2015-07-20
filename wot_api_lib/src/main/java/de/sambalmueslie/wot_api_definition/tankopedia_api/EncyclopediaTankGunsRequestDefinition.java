package de.sambalmueslie.wot_api_definition.tankopedia_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns a tanks' gun list. The logic of this method and some field values may vary according to optional parameters passed.
 * Changeable fields: damage piercing_power rate price_credit price_gold Optional input parameters work as follows: correct turret_id passed
 * — tank guns are filtered by whether they are placed on the turret and the abovementioned values change according to the turret; correct
 * turret_id and module_id passed — the method returns details on each module with the abovementioned values changed according to the
 * turret, or returns null if the module is not compatible with the turret; correct tank_id passed — if tank type matches one of AT-SPG,
 * SPG, mediumTank, tank guns are filtered by whether they belong to the tank, the abovementioned values change according to the tank;
 * otherwise, returns an error and requests turret_id. If module_id is also passed, the method returns details on each module with the
 * abovementioned values changed according to the tank, or returns null if the module is not compatible with the tank; compatible turret_id
 * and tank_id passed — tank guns are filtered by whether they belong to the tank and are placed on the turret, the abovementioned values
 * changed according to the turret.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/encyclopedia/tankguns/")
public class EncyclopediaTankGunsRequestDefinition extends WotRequestDefinition {
	/** Module ID. */
	@WotApiFieldDefinition(list = true)
	private long module_id;
	/**
	 * Nation. Valid values: "ussr" — U.S.S.R. "germany" — Germany "usa" — U.S.A. "france" — France "uk" — U.K. "china" — China "japan" —
	 * Japan.
	 */
	@WotApiFieldDefinition
	private String nation;
	/** Compatible vehicle ID. */
	@WotApiFieldDefinition
	private long tank_id;
	/** Compatible turret ID. */
	@WotApiFieldDefinition
	private long turret_id;
}
