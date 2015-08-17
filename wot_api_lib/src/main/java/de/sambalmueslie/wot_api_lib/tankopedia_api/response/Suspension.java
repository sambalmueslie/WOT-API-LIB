package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

public class Suspension {
	public int getLoadLimit() {
		return load_limit;
	}

	public String getName() {
		return name;
	}

	public String getTag() {
		return tag;
	}

	public int getTier() {
		return tier;
	}

	public int getTraverseSpeed() {
		return traverse_speed;
	}

	public int getWeight() {
		return weight;
	}

	private int load_limit;
	private String name;
	private String tag;
	private int tier;
	private int traverse_speed;
	private int weight;
}