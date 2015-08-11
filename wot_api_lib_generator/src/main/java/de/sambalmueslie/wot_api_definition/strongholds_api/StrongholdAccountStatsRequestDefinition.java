package de.sambalmueslie.wot_api_definition.strongholds_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns player stats for the current clan's Stronghold..
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/stronghold/accountstats/")
public class StrongholdAccountStatsRequestDefinition extends WotRequestDefinition {

	/** Access token is used to access personal user data. The token is obtained via authentication and has expiration time. */
	@WotApiFieldDefinition
	private String access_token;
	/** Player account ID. */
	@WotApiFieldDefinition(required = true, list = true)
	private long account_id;
}
