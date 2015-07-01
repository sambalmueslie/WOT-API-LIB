package de.sambalmueslie.wot_api_definition.account_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Request returns details on player's vehicles.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "account/tanks/")
public class AccountTanksRequestDefinition extends WotRequestDefinition {

	/** Access token is used to access personal user data. The token is obtained via authentication and has expiration time. */
	@WotApiFieldDefinition
	private String access_token;

	/** Player account ID. */
	@WotApiFieldDefinition(required = true, list = true)
	private long account_id;

	/** Player's vehicle ID. */
	@WotApiFieldDefinition(required = true, list = true)
	private long tank_id;

}
