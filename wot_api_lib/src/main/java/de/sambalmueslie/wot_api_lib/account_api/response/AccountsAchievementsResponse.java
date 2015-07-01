package de.sambalmueslie.wot_api_lib.account_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class AccountsAchievementsResponse extends BaseWotResponse {

	public class AccountAchievementEntry {
		public Map<String, Long> getAchievements() {
			return achievements;
		}

		public Map<String, Long> getFrags() {
			return frags;
		}

		public Map<String, Long> getMaxSeries() {
			return max_series;
		}

		private Map<String, Long> achievements;
		private Map<String, Long> frags;
		private Map<String, Long> max_series;
	}

	public Map<String, AccountAchievementEntry> getData() {
		return data;
	}

	private Map<String, AccountAchievementEntry> data;

}
