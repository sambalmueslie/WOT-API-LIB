package de.sambalmueslie.wot_api_definition.clan_wars_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns information about clan's fame points.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "globalwar/clanpoints/")
public class GlobalWarAccountClanPointsRequestDefinition extends WotRequestDefinition {

	/** Clan ID. */
	@WotApiFieldDefinition(required = true, list = true)
	private long clan_id;
	/** Global Map ID. */
	@WotApiFieldDefinition(required = true)
	private String map_id;

}
