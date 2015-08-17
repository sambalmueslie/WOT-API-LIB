package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class EncyclopediaAchievementsResponse extends BaseWotResponse {

	public class Achievement {
		public String getCondition() {
			return condition;
		}

		public String getDescription() {
			return description;
		}

		public String getHeroInfo() {
			return hero_info;
		}

		public String getImage() {
			return image;
		}

		public String getImageBig() {
			return image_big;
		}

		public String getName() {
			return name;
		}

		public String getNameI18n() {
			return name_i18n;
		}

		public AchievementOption[] getOptions() {
			return options;
		}

		public int getOrder() {
			return order;
		}

		public String getSection() {
			return section;
		}

		public String getSectionI18n() {
			return section_i18n;
		}

		public int getSectionOrder() {
			return section_order;
		}

		public String getType() {
			return type;
		}

		private String condition;
		private String description;
		private String hero_info;
		private String image;
		private String image_big;
		private String name;
		private String name_i18n;
		private AchievementOption[] options;
		private int order;
		private String section;
		private String section_i18n;
		private int section_order;
		private String type;
	}

	public class AchievementOption {
		public String getDescription() {
			return description;
		}

		public String getImage() {
			return image;
		}

		public String getImageBig() {
			return image_big;
		}

		public String getNameI18n() {
			return name_i18n;
		}

		private String description;
		private String image;
		private String image_big;
		private String name_i18n;
	}

	public Map<String, Achievement> getData() {
		return data;
	}

	private Map<String, Achievement> data;
}
