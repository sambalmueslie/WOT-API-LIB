package de.sambalmueslie.wot_api_lib.clan_ratings_api.response;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class ClanratingsNeighborsResponse extends BaseWotResponse {

	public ClanRating[] getData() {
		return data;
	}

	private ClanRating[] data;

}
