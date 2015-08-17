package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class EncyclopediaInfoResponse extends BaseWotResponse {
	public class Info {
		public Map<String, String> getClansRoles() {
			return clans_roles;
		}

		public String getGameVersion() {
			return game_version;
		}

		public Map<String, String> getLanguages() {
			return languages;
		}

		public long getTanksUpdatedAt() {
			return tanks_updated_at;
		}

		public Map<String, String> getVehicleCrewRoles() {
			return vehicle_crew_roles;
		}

		public Map<String, String> getVehicleNations() {
			return vehicle_nations;
		}

		public Map<String, String> getVehicleTypes() {
			return vehicle_types;
		}

		private Map<String, String> clans_roles;
		private String game_version;
		private Map<String, String> languages;
		private long tanks_updated_at;
		private Map<String, String> vehicle_crew_roles;
		private Map<String, String> vehicle_nations;
		private Map<String, String> vehicle_types;
	}

	public Info getData() {
		return data;
	}

	private Info data;
}
