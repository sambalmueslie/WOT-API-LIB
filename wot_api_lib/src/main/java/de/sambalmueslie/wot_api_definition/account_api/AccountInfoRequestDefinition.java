package de.sambalmueslie.wot_api_definition.account_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Request returns player details.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "account/info/")
public class AccountInfoRequestDefinition extends WotRequestDefinition {
	/**
	 * Access token is used to access personal user data. The token is obtained via authentication and has expiration time.
	 */
	@WotApiFieldDefinition
	private String access_token;
	/**
	 * Player account ID.
	 */
	@WotApiFieldDefinition(required = true, list = true)
	private long account_id;

	/**
	 * Extra fields to be included into the response. Valid values: private.personal_missions, private.grouped_contacts, private.rented.
	 */
	@WotApiFieldDefinition(list = true)
	private String extra;
}
