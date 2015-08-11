package de.sambalmueslie.wot_api_lib.clan_ratings_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class ClanratingsTypesResponse extends BaseWotResponse {
	public class ClanratingsTypeEntry {

		public String[] getRank_fields() {
			return rank_fields;
		}

		public String getType() {
			return type;
		}

		private String[] rank_fields;
		private String type;

	}

	public Map<String, ClanratingsTypeEntry> getData() {
		return data;
	}

	private Map<String, ClanratingsTypeEntry> data;
}
