package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

public class Turret {
	public int getHp() {
		return hp;
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

	public int getTraverseLeftArc() {
		return traverse_left_arc;
	}

	public int getTraverseRightArc() {
		return traverse_right_arc;
	}

	public int getTraverseSpeed() {
		return traverse_speed;
	}

	public int getViewRange() {
		return view_range;
	}

	public int getWeight() {
		return weight;
	}

	private int hp;
	private String name;
	private String tag;
	private int tier;
	private int traverse_left_arc;
	private int traverse_right_arc;
	private int traverse_speed;
	private int view_range;
	private int weight;
}