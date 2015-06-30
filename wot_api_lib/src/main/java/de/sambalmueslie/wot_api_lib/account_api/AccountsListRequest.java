package de.sambalmueslie.wot_api_lib.account_api;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;

public class AccountsListRequest extends BaseWotRequest {

	public AccountsListRequest(final String search) {
		this.search = search;
	}

	@Override
	public String getMethod() {
		return "account/list/";
	}

	public void setLimit(final long limit) {
		this.limit = limit;
	}

	public void setType(final String type) {
		this.type = type;
	}

	@Override
	protected void getParameter(final Map<String, Object> params) {
		if (type != null) {
			params.put("type", type);
		}
		if (search != null) {
			params.put("search", search);
		}
		if (limit > 0) {
			params.put("limit", limit);
		}
	}

	/**
	 * Number of returned entries (fewer can be returned, but not more than 100). If the limit sent exceeds 100, an limit of None is applied
	 * (by default).
	 */
	private long limit;
	/** Player name search string. Parameter 'type' defines minimum length and type of search. Maximum length: 24 symbols. */
	private final String search;

	/**
	 * Search type. Defines minimum length and type of search. Default value: startswith. Valid values: "startswith" — Search by initial
	 * characters of player name. Minimum length: 3 characters. Case insensitive. (by default) "exact" — Search by exact match of player
	 * name. Minimum length: 1 character. Case insensitive.
	 */
	private String type;
}
