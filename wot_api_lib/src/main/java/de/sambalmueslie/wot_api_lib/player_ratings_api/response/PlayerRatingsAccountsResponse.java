package de.sambalmueslie.wot_api_lib.player_ratings_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class PlayerRatingsAccountsResponse extends BaseWotResponse {

	public Map<String, PlayerRating> getData() {
		return data;
	}

	private Map<String, PlayerRating> data;
}
