package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

public class Gun {
	public double getAimTime() {
		return aim_time;
	}

	public int getCaliber() {
		return caliber;
	}

	public double getDispersion() {
		return dispersion;
	}

	public int getFireRate() {
		return fire_rate;
	}

	public int getMoveDownArc() {
		return move_down_arc;
	}

	public int getMoveUpArc() {
		return move_up_arc;
	}

	public String getName() {
		return name;
	}

	public double getReloadTime() {
		return reload_time;
	}

	public String getTag() {
		return tag;
	}

	public int getTier() {
		return tier;
	}

	public int getWeight() {
		return weight;
	}

	private double aim_time;
	private int caliber;
	private double dispersion;
	private int fire_rate;
	private int move_down_arc;
	private int move_up_arc;
	private String name;
	private double reload_time;
	private String tag;
	private int tier;
	private int weight;
}