package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class EncyclopediaVehicleProfileResponse extends BaseWotResponse {
	public class VehicleProfileEntry {
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

	public Map<String, VehicleProfileEntry> getData() {
		return data;
	}

	private Map<String, VehicleProfileEntry> data;
}
