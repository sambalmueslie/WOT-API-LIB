package de.sambalmueslie.wot_api_definition.permanent_teams_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns details on permanent teams.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "regularteams/info/")
public class RegularTeamsInfoRequestDefinition extends WotRequestDefinition {

	/** Team ID. */
	@WotApiFieldDefinition(required = true, list = true)
	private long team_id;
}
