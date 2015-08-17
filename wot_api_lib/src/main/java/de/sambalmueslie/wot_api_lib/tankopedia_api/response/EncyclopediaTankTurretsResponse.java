package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class EncyclopediaTankTurretsResponse extends BaseWotResponse {

	public class TankTurret {
		public int getArmorBoard() {
			return armor_board;
		}

		public int getArmorFedd() {
			return armor_fedd;
		}

		public int getArmorForehead() {
			return armor_forehead;
		}

		public int getCircularVisionRadius() {
			return circular_vision_radius;
		}

		public int getLevel() {
			return level;
		}

		public long getModuleId() {
			return module_id;
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

		public long getPriceCredit() {
			return price_credit;
		}

		public long getPriceGold() {
			return price_gold;
		}

		public long getPriceXp() {
			return price_xp;
		}

		public int getRotationSpeed() {
			return rotation_speed;
		}

		public long[] getTanks() {
			return tanks;
		}

		public long getWeight() {
			return weight;
		}

		private int armor_board;
		private int armor_fedd;
		private int armor_forehead;
		private int circular_vision_radius;
		private int level;
		private long module_id;
		private String name;
		private String name_i18n;
		private String nation;
		private String nation_i18n;
		private long price_credit;
		private long price_gold;
		private long price_xp;
		private int rotation_speed;
		private long[] tanks;
		private long weight;
	}

	public Map<String, TankTurret> getData() {
		return data;
	}

	private Map<String, TankTurret> data;
}
