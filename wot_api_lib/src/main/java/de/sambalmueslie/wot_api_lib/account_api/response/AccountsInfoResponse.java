package de.sambalmueslie.wot_api_lib.account_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class AccountsInfoResponse extends BaseWotResponse {
	public class AccountInfoEntry {
		public long getAccountId() {
			return account_id;
		}

		public long getClanId() {
			return clan_id;
		}

		public String getClientLanguage() {
			return client_language;
		}

		public String getCreatedAt() {
			return created_at;
		}

		public long getGlobalRating() {
			return global_rating;
		}

		public String getLastBattleTime() {
			return last_battle_time;
		}

		public String getLogoutAt() {
			return logout_at;
		}

		public String getNickname() {
			return nickname;
		}

		public String getUpdatedAt() {
			return updated_at;
		}

		private long account_id;
		private long clan_id;
		private String client_language;
		private String created_at;
		private long global_rating;
		private String last_battle_time;
		private String logout_at;
		private String nickname;
		private String updated_at;
	}

	public Map<String, AccountInfoEntry> getData() {
		return data;
	}

	private Map<String, AccountInfoEntry> data;
}
