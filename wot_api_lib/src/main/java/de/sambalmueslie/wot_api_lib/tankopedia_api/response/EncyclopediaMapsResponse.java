package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class EncyclopediaMapsResponse extends BaseWotResponse {

	public class Arena {
		public String getArenaId() {
			return arena_id;
		}

		public String getDescription() {
			return description;
		}

		public String getNameI18n() {
			return name_i18n;
		}

		private String arena_id;
		private String description;
		private String name_i18n;
	}

	public Map<String, Arena> getData() {
		return data;
	}

	private Map<String, Arena> data;
}
