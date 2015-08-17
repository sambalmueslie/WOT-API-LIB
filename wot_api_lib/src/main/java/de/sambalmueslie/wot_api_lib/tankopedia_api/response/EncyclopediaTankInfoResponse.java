package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class EncyclopediaTankInfoResponse extends BaseWotResponse {

	public class Crew {
		public String[] getAdditionalRoles() {
			return additionalRoles;
		}

		public CrewRole[] getAdditionalRolesI18n() {
			return additional_roles_i18n;
		}

		public String getRole() {
			return role;
		}

		public String getRoleI18n() {
			return role_i18n;
		}

		private CrewRole[] additional_roles_i18n;
		private String[] additionalRoles;
		private String role;
		private String role_i18n;
	}

	public class CrewRole {
		public String getRole() {
			return role;
		}

		public String getRoleI18n() {
			return role_i18n;
		}

		private String role;
		private String role_i18n;
	}

	public class Module {
		public long getModuleId() {
			return module_id;
		}

		public boolean isDefault() {
			return is_default;
		}

		private boolean is_default;
		private long module_id;
	}

	public class TankInfo {
		public Module[] getChassis() {
			return chassis;
		}

		public int getChassisRotationSpeed() {
			return chassis_rotation_speed;
		}

		public int getCircularVisionRadius() {
			return circular_vision_radius;
		}

		public String getContourImage() {
			return contour_image;
		}

		public Crew[] getCrew() {
			return crew;
		}

		public int getEnginePower() {
			return engine_power;
		}

		public Module[] getEngines() {
			return engines;
		}

		public int getGunDamageMax() {
			return gun_damage_max;
		}

		public int getGunDamageMin() {
			return gun_damage_min;
		}

		public int getGunMaxAmmo() {
			return gun_max_ammo;
		}

		public String getGunName() {
			return gun_name;
		}

		public int getGunPiercingPowerMax() {
			return gun_piercing_power_max;
		}

		public int getGunPiercingPowerMin() {
			return gun_piercing_power_min;
		}

		public int getGunRate() {
			return gun_rate;
		}

		public Module[] getGuns() {
			return guns;
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

		public int getLimitWeight() {
			return limit_weight;
		}

		public String getLocalizedName() {
			return localized_name;
		}

		public int getMaxHealth() {
			return max_health;
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

		public long[] getParentTanks() {
			return parent_tanks;
		}

		public int getPriceCredit() {
			return price_credit;
		}

		public int getPriceGold() {
			return price_gold;
		}

		public int getPriceXp() {
			return price_xp;
		}

		public int getRadioDistance() {
			return radio_distance;
		}

		public Module[] getRadios() {
			return radios;
		}

		public String getShortNameI18n() {
			return short_name_i18n;
		}

		public int getSpeedLimit() {
			return speed_limit;
		}

		public int getTankId() {
			return tank_id;
		}

		public int getTurretArmorBoard() {
			return turret_armor_board;
		}

		public int getTurretArmorForehead() {
			return turret_armor_forehead;
		}

		public int getTurretrArmorFedd() {
			return turret_armor_fedd;
		}

		public int getTurretRotationSpeed() {
			return turret_rotation_speed;
		}

		public Module getTurrets() {
			return turrets;
		}

		public String getType() {
			return type;
		}

		public String getTypeI18n() {
			return type_i18n;
		}

		public int getVehicleArmorBoard() {
			return vehicle_armor_board;
		}

		public int getVehicleArmorFedd() {
			return vehicle_armor_fedd;
		}

		public int getVehicleArmorForehead() {
			return vehicle_armor_forehead;
		}

		public double getWeight() {
			return weight;
		}

		public boolean isGift() {
			return is_gift;
		}

		public boolean isPremium() {
			return is_premium;
		}

		private Module[] chassis;
		private int chassis_rotation_speed;
		private int circular_vision_radius;
		private String contour_image;
		private Crew[] crew;
		private int engine_power;
		private Module[] engines;
		private int gun_damage_max;
		private int gun_damage_min;
		private int gun_max_ammo;
		private String gun_name;
		private int gun_piercing_power_max;
		private int gun_piercing_power_min;
		private int gun_rate;
		private Module[] guns;
		private String image;
		private String image_small;
		private boolean is_gift;
		private boolean is_premium;
		private int level;
		private int limit_weight;
		private String localized_name;
		private int max_health;
		private String name;
		private String name_i18n;
		private String nation;
		private String nation_i18n;
		private long[] parent_tanks;
		private int price_credit;
		private int price_gold;
		private int price_xp;
		private int radio_distance;
		private Module[] radios;
		private String short_name_i18n;
		private int speed_limit;
		private int tank_id;
		private int turret_armor_board;
		private int turret_armor_fedd;
		private int turret_armor_forehead;
		private int turret_rotation_speed;
		private Module turrets;
		private String type;
		private String type_i18n;
		private int vehicle_armor_board;
		private int vehicle_armor_fedd;
		private int vehicle_armor_forehead;
		private double weight;
	}

	public Map<String, TankInfo> getData() {
		return data;
	}

	private Map<String, TankInfo> data;
}
