package de.sambalmueslie.wot_api_lib.clan_ratings_api.response;

public class ClanRankRating {
	public long getRank() {
		return rank;
	}

	public long getRankDelta() {
		return rank_delta;
	}

	public double getValue() {
		return value;
	}

	private long rank;
	private long rank_delta;
	private double value;
}