package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class EncyclopediaTanksResponse extends BaseWotResponse {
	public class Tank {
		public String getContourImage() {
			return contour_image;
		}

		public String getImage() {
			return image;
		}

		public String getImageSmall() {
			return image_small;
		}

		public int getLevel() {
			return level;
		}

		public String getName() {
			return name;
		}

		public String getNameI18n() {
			return name_i18n;
		}

		public String getNation() {
			return nation;
		}

		public String getNationI18n() {
			return nation_i18n;
		}

		public String getShort_nameI18n() {
			return short_name_i18n;
		}

		public long getTankId() {
			return tank_id;
		}

		public String getType() {
			return type;
		}

		public String getTypeI18n() {
			return type_i18n;
		}

		public boolean isPremium() {
			return is_premium;
		}

		private String contour_image;
		private String image;
		private String image_small;
		private boolean is_premium;
		private int level;
		private String name;
		private String name_i18n;
		private String nation;
		private String nation_i18n;
		private String short_name_i18n;
		private long tank_id;
		private String type;
		private String type_i18n;
	}

	public Map<String, Tank> getData() {
		return data;
	}

	private Map<String, Tank> data;
}
