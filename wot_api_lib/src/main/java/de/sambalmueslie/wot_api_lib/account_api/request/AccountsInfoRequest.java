package de.sambalmueslie.wot_api_lib.account_api.request;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;

public class AccountsInfoRequest extends BaseWotRequest {

	public AccountsInfoRequest(final long accountId) {
		this.account_id = accountId;
	}

	@Override
	public String getMethod() {
		return "account/info/";
	}

	public void setAccess_token(final String access_token) {
		this.access_token = access_token;
	}

	public void setExtra(final String extra) {
		this.extra = extra;
	}

	@Override
	protected void getParameter(final Map<String, Object> params) {
		if (access_token != null) {
			params.put("access_token", access_token);
		}
		if (extra != null) {
			params.put("extra", extra);
		}
		if (account_id > 0) {
			params.put("account_id", account_id);
		}
	}

	/** Access token is used to access personal user data. The token is obtained via authentication and has expiration time. */
	private String access_token;
	/** Player account ID. */
	private final long account_id;

	/** Extra fields to be included into the response. Valid values: private.personal_missions, private.grouped_contacts, private.rented. */
	private String extra;
}
