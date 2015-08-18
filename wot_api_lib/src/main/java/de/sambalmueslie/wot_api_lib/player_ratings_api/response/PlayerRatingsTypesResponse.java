package de.sambalmueslie.wot_api_lib.player_ratings_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class PlayerRatingsTypesResponse extends BaseWotResponse {
	public class PlayerRatingsType {
		public String[] getRankFields() {
			return rank_fields;
		}

		public int getThreshold() {
			return threshold;
		}

		public String getType() {
			return type;
		}

		private String[] rank_fields;
		private int threshold;
		private String type;
	}

	public Map<String, PlayerRatingsType> getData() {
		return data;
	}

	private Map<String, PlayerRatingsType> data;
}
