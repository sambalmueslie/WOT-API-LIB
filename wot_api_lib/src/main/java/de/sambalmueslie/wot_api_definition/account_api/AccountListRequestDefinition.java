package de.sambalmueslie.wot_api_definition.account_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Request returns partial list of players. The list is filtered by initial characters of user name and sorted alphabetically.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "account/list/")
public class AccountListRequestDefinition extends WotRequestDefinition {
	/**
	 * Number of returned entries (fewer can be returned, but not more than 100). If the limit sent exceeds 100, an limit of None is applied
	 * (by default).
	 */
	@WotApiFieldDefinition
	private long limit;
	/**
	 * Player name search string. Parameter 'type' defines minimum length and type of search. Maximum length: 24 symbols.
	 */
	@WotApiFieldDefinition(required = true)
	private String search;

	/**
	 * Search type. Defines minimum length and type of search. Default value: startswith. Valid values: "startswith" — Search by initial
	 * characters of player name. Minimum length: 3 characters. Case insensitive. (by default) "exact" — Search by exact match of player
	 * name. Minimum length: 1 character. Case insensitive.
	 */
	@WotApiFieldDefinition
	private String type;
}
