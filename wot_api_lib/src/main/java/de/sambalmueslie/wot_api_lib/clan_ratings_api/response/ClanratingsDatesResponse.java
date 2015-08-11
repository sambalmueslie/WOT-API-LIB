package de.sambalmueslie.wot_api_lib.clan_ratings_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class ClanratingsDatesResponse extends BaseWotResponse {

	public class ClanratingsDateEntry {
		public String[] getDates() {
			return dates;
		}

		private String[] dates;
	}

	public Map<String, ClanratingsDateEntry> getData() {
		return data;
	}

	private Map<String, ClanratingsDateEntry> data;
}
