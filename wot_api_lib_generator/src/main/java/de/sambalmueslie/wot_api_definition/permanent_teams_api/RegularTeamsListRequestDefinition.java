package de.sambalmueslie.wot_api_definition.permanent_teams_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns full list of permanent teams and allows to search and sort them.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/regularteams/list/")
public class RegularTeamsListRequestDefinition extends WotRequestDefinition {
	/** Maximum number of adjacent positions in clan rating. Maximum: 504 default value: 5. */
	@WotApiFieldDefinition
	private long limit;
	/**
	 * Allows to sort teams by a specified parameter. Valid values: "team_id" — by team id "-team_id" — by team id in reverse order "name" —
	 * by team name "-name" — by team name in reverse order "tag" — by team tag "-tag" — by team tag in reverse order "members_count" — by
	 * team size "-members_count" — by team size in reverse order.
	 */
	@WotApiFieldDefinition
	private String order_by;
	/** Result page number. */
	@WotApiFieldDefinition
	private long page_no;
	/** Search bar by team tag or team name. */
	@WotApiFieldDefinition
	private String search;
}
