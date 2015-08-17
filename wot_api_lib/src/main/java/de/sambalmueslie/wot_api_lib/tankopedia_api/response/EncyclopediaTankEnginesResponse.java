package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class EncyclopediaTankEnginesResponse extends BaseWotResponse {
	public class TankEngine {
		public int getFireStartingChance() {
			return fire_starting_chance;
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

		public int getPower() {
			return power;
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

		public long[] getTanks() {
			return tanks;
		}

		public long getWeight() {
			return weight;
		}

		private int fire_starting_chance;
		private int level;
		private long module_id;
		private String name;
		private String name_i18n;
		private String nation;
		private String nation_i18n;
		private int power;
		private long price_credit;
		private long price_gold;
		private long price_xp;
		private long[] tanks;
		private long weight;
	}

	public Map<String, TankEngine> getData() {
		return data;
	}

	private Map<String, TankEngine> data;
}
