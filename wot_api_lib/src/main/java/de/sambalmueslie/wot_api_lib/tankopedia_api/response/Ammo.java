package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

public class Ammo {
	public int[] getDamage() {
		return damage;
	}

	public int[] getPenetration() {
		return penetration;
	}

	public String getType() {
		return type;
	}

	private int[] damage;
	private int[] penetration;
	private String type;
}