package de.sambalmueslie.wot_api_lib.player_vehicles_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class PlayerVehiclesAchievementsResponse extends BaseWotResponse {

	public class PlayerVehiclesAchievement {
		public long getAccountId() {
			return account_id;
		}

		public Map<String, Integer> getAchievements() {
			return achievements;
		}

		public Map<String, Integer> getMaxSeries() {
			return max_series;
		}

		public Map<String, Integer> getSeries() {
			return series;
		}

		public long getTank_Id() {
			return tank_id;
		}

		private long account_id;
		private Map<String, Integer> achievements;
		private Map<String, Integer> max_series;
		private Map<String, Integer> series;
		private long tank_id;
	}

	public Map<String, PlayerVehiclesAchievement[]> getData() {
		return data;
	}

	private Map<String, PlayerVehiclesAchievement[]> data;
}
