package de.sambalmueslie.wot_api_definition.clan_ratings_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns dates with available rating data.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/clanratings/dates/")
public class ClanratingsDatesRequestDefinition extends WotRequestDefinition {

	/** Clan ID. */
	@WotApiFieldDefinition(list = true)
	private long clan_id;

	/** Rating period. */
	@WotApiFieldDefinition(required = true)
	private String type;
}
