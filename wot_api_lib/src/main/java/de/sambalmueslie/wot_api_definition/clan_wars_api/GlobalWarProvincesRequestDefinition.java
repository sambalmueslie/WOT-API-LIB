package de.sambalmueslie.wot_api_definition.clan_wars_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns list of provinces on the Global Map.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "globalwar/provinces/")
public class GlobalWarProvincesRequestDefinition extends WotRequestDefinition {

	/** Global Map ID. */
	@WotApiFieldDefinition(required = true)
	private String map_id;

	/** Province ID. */
	@WotApiFieldDefinition(list = true)
	private String province_id;

	/** Region ID. */
	@WotApiFieldDefinition(list = true)
	private String region_id;

	/**
	 * Revoting province ID. Valid values: "normal" — Regular province "start" — Landing province "mutiny" — Revolting province
	 * "delayed_mutiny" — Province with postponed revolt.
	 */
	@WotApiFieldDefinition
	private String status;

}
