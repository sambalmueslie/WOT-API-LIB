package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class EncyclopediaTankGunsResponse extends BaseWotResponse {
	public class TankGun {
		public int[] getDamage() {
			return damage;
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

		public int[] getPiercingPower() {
			return piercing_power;
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

		public double getRate() {
			return rate;
		}

		public long[] getTanks() {
			return tanks;
		}

		public long[] getTurrets() {
			return turrets;
		}

		public long getWeight() {
			return weight;
		}

		private int[] damage;
		private int level;
		private long module_id;
		private String name;
		private String name_i18n;
		private String nation;
		private String nation_i18n;
		private int[] piercing_power;
		private long price_credit;
		private long price_gold;
		private long price_xp;
		private double rate;
		private long[] tanks;
		private long[] turrets;
		private long weight;
	}

	public Map<String, TankGun> getData() {
		return data;
	}

	private Map<String, TankGun> data;
}
