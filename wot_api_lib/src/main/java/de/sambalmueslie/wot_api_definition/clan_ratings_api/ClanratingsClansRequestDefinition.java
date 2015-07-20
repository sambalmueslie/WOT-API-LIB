package de.sambalmueslie.wot_api_definition.clan_ratings_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDate;
import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns clan ratings by specified IDs.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/clanratings/clans/")
public class ClanratingsClansRequestDefinition extends WotRequestDefinition {

	/** Clan ID. */
	@WotApiFieldDefinition(list = true, required = true)
	private long clan_id;

	/**
	 * Ratings calculation date. Up to 7 days before the current date; default value: yesterday. Date in UNIX timestamp or ISO 8601 format.
	 * E.g.: 1376542800 or 2013-08-15T00:00:00.
	 */
	@WotApiFieldDefinition
	@WotApiFieldDate
	private String date;

	/** Rating period. */
	@WotApiFieldDefinition(required = true)
	private String type;
}
