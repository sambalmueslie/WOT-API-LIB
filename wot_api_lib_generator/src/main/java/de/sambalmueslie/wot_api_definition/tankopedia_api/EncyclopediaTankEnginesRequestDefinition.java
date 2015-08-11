package de.sambalmueslie.wot_api_definition.tankopedia_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns list of engines.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/encyclopedia/tankengines/")
public class EncyclopediaTankEnginesRequestDefinition extends WotRequestDefinition {

	/** Module ID. */
	@WotApiFieldDefinition(list = true)
	private long module_id;
	/**
	 * Nation. Valid values: "ussr" — U.S.S.R. "germany" — Germany "usa" — U.S.A. "france" — France "uk" — U.K. "china" — China "japan" —
	 * Japan.
	 */
	@WotApiFieldDefinition
	private String nation;

}
