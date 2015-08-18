package de.sambalmueslie.wot_api_lib.player_ratings_api.response;

public class PlayerRankRating {
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