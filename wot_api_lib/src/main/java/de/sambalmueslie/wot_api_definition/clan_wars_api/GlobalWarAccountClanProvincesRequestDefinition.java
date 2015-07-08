package de.sambalmueslie.wot_api_definition.clan_wars_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns lists of clans provinces.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "globalwar/clanprovinces/")
public class GlobalWarAccountClanProvincesRequestDefinition extends WotRequestDefinition {

	/** Global Map ID. */
	@WotApiFieldDefinition(required = true, list = true)
	private String clan_id;

}
