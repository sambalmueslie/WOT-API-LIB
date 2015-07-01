package de.sambalmueslie.wot_api_lib.account_api.request;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;

public class AccountsTanksRequest extends BaseWotRequest {

	public AccountsTanksRequest(final long accountId) {
		this.account_id = accountId;
	}

	@Override
	public String getMethod() {
		return "account/tanks/";
	}

	@Override
	protected void getParameter(final Map<String, Object> params) {
		if (access_token != null) {
			params.put("access_token", access_token);
		}
		if (account_id > 0) {
			params.put("account_id", account_id);
		}
		if (tank_id > 0) {
			params.put("tank_id", tank_id);
		}
	}

	/** Access token is used to access personal user data. The token is obtained via authentication and has expiration time. */
	private String access_token;
	/** Player account ID. */
	private final long account_id;
	/** Player's vehicle ID. */
	private long tank_id;
}
