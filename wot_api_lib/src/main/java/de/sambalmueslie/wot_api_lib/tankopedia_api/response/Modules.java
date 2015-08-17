package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

public class Modules {
	public long getEngineId() {
		return engine_id;
	}

	public long getGunId() {
		return gun_id;
	}

	public long getRadioId() {
		return radio_id;
	}

	public long getSuspensionId() {
		return suspension_id;
	}

	public long getTurretId() {
		return turret_id;
	}

	private long engine_id;
	private long gun_id;
	private long radio_id;
	private long suspension_id;
	private long turret_id;
}