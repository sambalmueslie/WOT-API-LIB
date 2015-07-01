package de.sambalmueslie.wot_api_lib.account_api.response;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class AccountsListResponse extends BaseWotResponse {
	public class AccountListEntry {
		public long getAccountId() {
			return account_id;
		}

		public String getNickname() {
			return nickname;
		}

		private long account_id;

		private String nickname;
	}

	public AccountListEntry[] getData() {
		return data;
	}

	private AccountListEntry[] data;
}
