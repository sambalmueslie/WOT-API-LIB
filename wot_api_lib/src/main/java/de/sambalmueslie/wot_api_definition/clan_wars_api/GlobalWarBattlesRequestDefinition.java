package de.sambalmueslie.wot_api_definition.clan_wars_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns list of clan's battles.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "globalwar/battles/")
public class GlobalWarBattlesRequestDefinition extends WotRequestDefinition {

	/** Global Map ID. */
	@WotApiFieldDefinition(required = true)
	private String map_id;

	/** Province ID. */
	@WotApiFieldDefinition(required = true, list = true)
	private String province_id;

}
