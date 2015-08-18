package de.sambalmueslie.wot_api_lib.player_ratings_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class PlayerRatingsDatesResponse extends BaseWotResponse {
	public class PlayerRatingsDateEntry {
		public String[] getDates() {
			return dates;
		}

		private String[] dates;
	}

	public Map<String, PlayerRatingsDateEntry> getData() {
		return data;
	}

	private Map<String, PlayerRatingsDateEntry> data;
}
