package de.sambalmueslie.wot_api_definition.player_ratings_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDate;
import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns list of adjacent positions in specified rating.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "ratings/neighbors/")
public class PlayerRatingsNeighborsRequestDefinition extends WotRequestDefinition {

	/** Player account ID. */
	@WotApiFieldDefinition(required = true)
	private long account_id;

	/**
	 * Ratings calculation date. Up to 7 days before the current date; default value: yesterday. Date in UNIX timestamp or ISO 8601 format.
	 * E.g.: 1376542800 or 2013-08-15T00:00:00.
	 */
	@WotApiFieldDefinition
	@WotApiFieldDate
	private String date;

	/** Maximum number of adjacent positions in rating. */
	@WotApiFieldDefinition
	private long limit;

	/** Rating category. */
	@WotApiFieldDefinition(required = true)
	private String rank_field;
	/** Rating period. */
	@WotApiFieldDefinition(required = true)
	private String type;
}
