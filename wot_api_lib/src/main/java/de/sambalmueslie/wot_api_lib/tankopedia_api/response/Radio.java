package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

public class Radio {
	public String getName() {
		return name;
	}

	public int getSignalRange() {
		return signal_range;
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

	private String name;
	private int signal_range;
	private String tag;
	private int tier;
	private int weight;
}