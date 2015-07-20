package de.sambalmueslie.wot_api_definition.clan_wars_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns list of tournaments on the selected Global Map.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/globalwar/tournaments/")
public class GlobalWarTournamentsRequestDefinition extends WotRequestDefinition {

	/** Global Map ID. */
	@WotApiFieldDefinition(required = true)
	private String map_id;

	/** Province ID. */
	@WotApiFieldDefinition(required = true, list = true)
	private String province_id;

}
