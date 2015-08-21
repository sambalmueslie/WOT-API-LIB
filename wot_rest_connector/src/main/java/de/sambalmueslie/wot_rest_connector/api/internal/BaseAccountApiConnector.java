package de.sambalmueslie.wot_rest_connector.api.internal;

import de.sambalmueslie.wot_api_lib.account_api.request.AccountAchievementsRequest;
import de.sambalmueslie.wot_api_lib.account_api.request.AccountInfoRequest;
import de.sambalmueslie.wot_api_lib.account_api.request.AccountListRequest;
import de.sambalmueslie.wot_api_lib.account_api.request.AccountTanksRequest;
import de.sambalmueslie.wot_api_lib.account_api.response.AccountsAchievementsResponse;
import de.sambalmueslie.wot_api_lib.account_api.response.AccountsInfoResponse;
import de.sambalmueslie.wot_api_lib.account_api.response.AccountsListResponse;
import de.sambalmueslie.wot_api_lib.account_api.response.AccountsTanksResponse;
import de.sambalmueslie.wot_rest_connector.api.AccountApiConnector;
import de.sambalmueslie.wot_rest_connector.connection.ClientConnection;

public class BaseAccountApiConnector extends BaseWotApiConnector implements AccountApiConnector {

	BaseAccountApiConnector(final String applicationId, final ClientConnection connection) {
		super(applicationId, connection);
	}

	@Override
	public AccountsAchievementsResponse query(final AccountAchievementsRequest request) {
		return query(request, AccountsAchievementsResponse.class);
	}

	@Override
	public AccountsInfoResponse query(final AccountInfoRequest request) {
		return query(request, AccountsInfoResponse.class);
	}

	@Override
	public AccountsListResponse query(final AccountListRequest request) {
		return query(request, AccountsListResponse.class);
	}

	@Override
	public AccountsTanksResponse query(final AccountTanksRequest request) {
		return query(request, AccountsTanksResponse.class);
	}

}
