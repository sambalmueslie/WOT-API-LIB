package de.sambalmueslie.wot_api_definition.clan_wars_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns list of top clans in fame points rating.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "globalwar/clanpointsrating/")
public class GlobalWarAccountClanPointsRatingRequestDefinition extends WotRequestDefinition {

	/**
	 * Number of returned entries (fewer can be returned, but not more than 100). If the limit sent exceeds 100, an limit of 100 is applied
	 * (by default).
	 */
	@WotApiFieldDefinition
	private long limit;
	/** Global Map ID. */
	@WotApiFieldDefinition(required = true)
	private String map_id;
	/** Result page number. */
	@WotApiFieldDefinition
	private long page_no;

}
