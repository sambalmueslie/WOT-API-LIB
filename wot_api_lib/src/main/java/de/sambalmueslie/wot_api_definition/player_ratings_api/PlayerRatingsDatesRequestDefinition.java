package de.sambalmueslie.wot_api_definition.player_ratings_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns dates with available rating data.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/ratings/dates/")
public class PlayerRatingsDatesRequestDefinition extends WotRequestDefinition {

	/** Player account ID. */
	@WotApiFieldDefinition(list = true)
	private long account_id;
	/**
	 * Battle types. Valid values: "company" — Tank Company Battles "random" — Random Battles "team" — Team Battles "default" — any battle
	 * type (by default).
	 */
	@WotApiFieldDefinition
	private String battle_type;
	/** Rating period. */
	@WotApiFieldDefinition(required = true)
	private String type;
}
