package de.sambalmueslie.wot_api_definition.player_ratings_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns dictionary of rating periods and ratings details.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/ratings/types/")
public class PlayerRatingsTypesRequestDefinition extends WotRequestDefinition {

	/**
	 * Battle types. Valid values: "company" — Tank Company Battles "random" — Random Battles "team" — Team Battles "default" — any battle
	 * type (by default).
	 */
	@WotApiFieldDefinition
	private String battle_type;
}
