package de.sambalmueslie.wot_api_definition.clans_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns detailed clan information.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wgn/clans/info/")
public class ClansInfoRequestDefinition extends WotRequestDefinition {
	/** Access token is used to access personal user data. The token is obtained via authentication and has expiration time. */
	@WotApiFieldDefinition
	private String access_token;

	/** Clan ID. */
	@WotApiFieldDefinition(required = true, list = true)
	private long clan_id;
}
