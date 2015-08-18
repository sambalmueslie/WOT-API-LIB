package de.sambalmueslie.wot_api_lib.player_ratings_api.response;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class PlayerRatingsTopResponse extends BaseWotResponse {
	public PlayerRating[] getData() {
		return data;
	}

	private PlayerRating[] data;
}
