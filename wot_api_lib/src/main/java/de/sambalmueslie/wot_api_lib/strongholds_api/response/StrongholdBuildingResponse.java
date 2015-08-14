package de.sambalmueslie.wot_api_lib.strongholds_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class StrongholdBuildingResponse extends BaseWotResponse {
	public class Reserve {
		public String getDescription() {
			return description;
		}

		public String getImageUrl() {
			return image_url;
		}

		public String getTitle() {
			return title;
		}

		private String description;
		private String image_url;
		private String title;
	}

	public class StrongholdBuilding {
		public String getDescription() {
			return description;
		}

		public String getImageUrl() {
			return image_url;
		}

		public Reserve getReserve() {
			return reserve;
		}

		public String getShortDescription() {
			return short_description;
		}

		public String getTitle() {
			return title;
		}

		public long getType() {
			return type;
		}

		private String description;
		private String image_url;
		private Reserve reserve;
		private String short_description;
		private String title;
		private long type;
	}

	public Map<String, StrongholdBuilding> getData() {
		return data;
	}

	private Map<String, StrongholdBuilding> data;
}
