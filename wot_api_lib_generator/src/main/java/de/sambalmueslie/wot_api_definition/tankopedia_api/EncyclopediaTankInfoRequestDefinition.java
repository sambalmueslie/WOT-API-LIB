package de.sambalmueslie.wot_api_definition.tankopedia_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns vehicle details from Tankopedia.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/encyclopedia/tankinfo/")
public class EncyclopediaTankInfoRequestDefinition extends WotRequestDefinition {

	/** Vehicle ID. */
	@WotApiFieldDefinition(list = true, required = true)
	private long tank_id;
}
