package de.sambalmueslie.wot_api_lib.account_api.request;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;

public class AccountsAchievementsRequest extends BaseWotRequest {

	public AccountsAchievementsRequest(final long accountId) {
		this.account_id = accountId;
	}

	@Override
	public String getMethod() {
		return "account/achievements/";
	}

	@Override
	protected void getParameter(final Map<String, Object> params) {
		if (account_id > 0) {
			params.put("account_id", account_id);
		}
	}

	/** Player account ID. */
	private final long account_id;
}
