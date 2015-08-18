package de.sambalmueslie.wot_api_lib.clan_ratings_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class ClanratingsClansResponse extends BaseWotResponse {

	public Map<String, ClanRating> getData() {
		return data;
	}

	private Map<String, ClanRating> data;
}
