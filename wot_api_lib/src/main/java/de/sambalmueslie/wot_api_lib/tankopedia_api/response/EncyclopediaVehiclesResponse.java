package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class EncyclopediaVehiclesResponse extends BaseWotResponse {

	public class Crew {
		public String getMemberId() {
			return member_id;
		}

		public Map<String, String> getRoles() {
			return roles;
		}

		private String member_id;
		private Map<String, String> roles;
	}

	public class Images {
		public String getBigIcon() {
			return big_icon;
		}

		public String getContourIcon() {
			return contour_icon;
		}

		public String getSmallIcon() {
			return small_icon;
		}

		private String big_icon;
		private String contour_icon;
		private String small_icon;
	}

	public class Module {
		public long getModuleId() {
			return module_id;
		}

		public String getName() {
			return name;
		}

		public long[] getNextModules() {
			return next_modules;
		}

		public long[] getNextTanks() {
			return next_tanks;
		}

		public long getPriceCredit() {
			return price_credit;
		}

		public long getPriceXp() {
			return price_xp;
		}

		public String getType() {
			return type;
		}

		public boolean isDefault() {
			return is_default;
		}

		private boolean is_default;
		private long module_id;
		private String name;
		private long[] next_modules;
		private long[] next_tanks;
		private long price_credit;
		private long price_xp;
		private String type;
	}

	public class Profile {
		public Ammo[] getAmmo() {
			return ammo;
		}

		public Map<String, Armor> getArmor() {
			return armor;
		}

		public Engine getEngine() {
			return engine;
		}

		public Gun getGun() {
			return gun;
		}

		public int getHp() {
			return hp;
		}

		public int getHullHp() {
			return hull_hp;
		}

		public int getHullWeight() {
			return hull_weight;
		}

		public int getMaxAmmo() {
			return max_ammo;
		}

		public long getMaxWeight() {
			return max_weight;
		}

		public Modules getModules() {
			return modules;
		}

		public Radio getRadio() {
			return radio;
		}

		public int getSpeedBackward() {
			return speed_backward;
		}

		public int getSpeedForward() {
			return speed_forward;
		}

		public Suspension getSuspension() {
			return suspension;
		}

		public long getTankId() {
			return tank_id;
		}

		public Turret getTurret() {
			return turret;
		}

		public long getWeight() {
			return weight;
		}

		public boolean isDefault() {
			return is_default;
		}

		private Ammo[] ammo;
		private Map<String, Armor> armor;
		private Engine engine;
		private Gun gun;
		private int hp;
		private int hull_hp;
		private int hull_weight;
		private boolean is_default;
		private int max_ammo;
		private long max_weight;
		private Modules modules;
		private Radio radio;
		private int speed_backward;
		private int speed_forward;
		private Suspension suspension;
		private long tank_id;
		private Turret turret;
		private long weight;
	}

	public class Vehicle {
		public Crew[] getCrew() {
			return crew;
		}

		public Profile getDefaultDrofile() {
			return default_profile;
		}

		public String getDescription() {
			return description;
		}

		public long[] getEngines() {
			return engines;
		}

		public long[] getGuns() {
			return guns;
		}

		public Images getImages() {
			return images;
		}

		public Map<String, Module> getModulesTree() {
			return modules_tree;
		}

		public String getName() {
			return name;
		}

		public String getNation() {
			return nation;
		}

		public Map<String, Long> getNextTanks() {
			return next_tanks;
		}

		public long getPriceCredit() {
			return price_credit;
		}

		public long getPriceGold() {
			return price_gold;
		}

		public Map<String, Long> getPricesXp() {
			return prices_xp;
		}

		public long[] getProvisions() {
			return provisions;
		}

		public long[] getRadios() {
			return radios;
		}

		public String getShortName() {
			return short_name;
		}

		public long[] getSuspensions() {
			return suspensions;
		}

		public String getTag() {
			return tag;
		}

		public long getTankId() {
			return tank_id;
		}

		public int getTier() {
			return tier;
		}

		public long[] getTurrets() {
			return turrets;
		}

		public String getType() {
			return type;
		}

		public boolean isGift() {
			return is_gift;
		}

		public boolean isPremium() {
			return is_premium;
		}

		private Crew[] crew;
		private Profile default_profile;
		private String description;
		private long[] engines;
		private long[] guns;
		private Images images;
		private boolean is_gift;
		private boolean is_premium;
		private Map<String, Module> modules_tree;
		private String name;
		private String nation;
		private Map<String, Long> next_tanks;
		private long price_credit;
		private long price_gold;
		private Map<String, Long> prices_xp;
		private long[] provisions;
		private long[] radios;
		private String short_name;
		private long[] suspensions;
		private String tag;
		private long tank_id;
		private int tier;
		private long turrets[];
		private String type;
	}

	public Map<String, Vehicle> getData() {
		return data;
	}

	private Map<String, Vehicle> data;
}
