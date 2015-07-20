package de.sambalmueslie.wot_api_definition.tankopedia_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns list of all achievements from Tankopedia.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/encyclopedia/achievements/")
public class EncyclopediaProvisionsRequestDefinition extends WotRequestDefinition {
	/** Equipment or consumables ID. */
	@WotApiFieldDefinition(list = true)
	private long provision_id;
}
