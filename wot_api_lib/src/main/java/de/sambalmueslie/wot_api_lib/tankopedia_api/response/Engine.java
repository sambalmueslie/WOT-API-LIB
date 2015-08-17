package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

public class Engine {
	public double getFireChance() {
		return fire_chance;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
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

	private double fire_chance;
	private String name;
	private int power;
	private String tag;
	private int tier;
	private int weight;
}