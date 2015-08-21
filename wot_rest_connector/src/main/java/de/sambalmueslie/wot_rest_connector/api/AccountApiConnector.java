package de.sambalmueslie.wot_rest_connector.api;

import de.sambalmueslie.wot_api_lib.account_api.request.AccountAchievementsRequest;
import de.sambalmueslie.wot_api_lib.account_api.request.AccountInfoRequest;
import de.sambalmueslie.wot_api_lib.account_api.request.AccountListRequest;
import de.sambalmueslie.wot_api_lib.account_api.request.AccountTanksRequest;
import de.sambalmueslie.wot_api_lib.account_api.response.AccountsAchievementsResponse;
import de.sambalmueslie.wot_api_lib.account_api.response.AccountsInfoResponse;
import de.sambalmueslie.wot_api_lib.account_api.response.AccountsListResponse;
import de.sambalmueslie.wot_api_lib.account_api.response.AccountsTanksResponse;

/**
 * The {@link WotApiConnector} for the account api.
 *
 * @autor Sambalmueslie
 */
public interface AccountApiConnector extends WotApiConnector {

	/**
	 * Query a {@link AccountAchievementsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	AccountsAchievementsResponse query(AccountAchievementsRequest request);

	/**
	 * Query a {@link AccountInfoRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the {@link AccountsInfoResponse}
	 */
	AccountsInfoResponse query(AccountInfoRequest request);

	/**
	 * Query a {@link AccountListRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the {@link AccountsListResponse}
	 */
	AccountsListResponse query(AccountListRequest request);

	/**
	 * Query a {@link AccountTanksRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the {@link AccountsTanksResponse}
	 */
	AccountsTanksResponse query(AccountTanksRequest request);

}
