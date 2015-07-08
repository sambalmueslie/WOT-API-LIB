package de.sambalmueslie.wot_api_definition.strongholds_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns information on clan's Stronghold.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "stronghold/info/")
public class StrongholdBuildingRequestDefinition extends WotRequestDefinition {
	/** Access token is used to access personal user data. The token is obtained via authentication and has expiration time. */
	@WotApiFieldDefinition
	private String access_token;
	/** Clan ID. */
	@WotApiFieldDefinition(required = true)
	private long clan_id;
}
