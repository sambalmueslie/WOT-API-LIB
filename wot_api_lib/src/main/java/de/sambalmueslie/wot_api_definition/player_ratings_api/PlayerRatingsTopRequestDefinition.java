package de.sambalmueslie.wot_api_definition.player_ratings_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDate;
import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns the list of top players by specified parameter.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "ratings/top/")
public class PlayerRatingsTopRequestDefinition extends WotRequestDefinition {

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

	/** Result page number. */
	@WotApiFieldDefinition
	private long page_no;

	/** Rating category. */
	@WotApiFieldDefinition(required = true)
	private String rank_field;
	/** Rating period. */
	@WotApiFieldDefinition(required = true)
	private String type;
}
