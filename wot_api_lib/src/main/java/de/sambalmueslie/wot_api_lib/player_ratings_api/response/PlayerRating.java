package de.sambalmueslie.wot_api_lib.player_ratings_api.response;

public class PlayerRating {
	public long getAccountId() {
		return account_id;
	}

	public PlayerRankRating getBattlesCount() {
		return battles_count;
	}

	public long getBattlesToPlay() {
		return battles_to_play;
	}

	public PlayerRankRating getCapturePoints() {
		return capture_points;
	}

	public PlayerRankRating getDamageAvg() {
		return damage_avg;
	}

	public PlayerRankRating getDamageDealt() {
		return damage_dealt;
	}

	public PlayerRankRating getFragsAvg() {
		return frags_avg;
	}

	public PlayerRankRating getFragsCount() {
		return frags_count;
	}

	public PlayerRankRating getGlobalRating() {
		return global_rating;
	}

	public PlayerRankRating getHitsRatio() {
		return hits_ratio;
	}

	public PlayerRankRating getSpottedAvg() {
		return spotted_avg;
	}

	public PlayerRankRating getSpottedCount() {
		return spotted_count;
	}

	public PlayerRankRating getSurvivedRatio() {
		return survived_ratio;
	}

	public PlayerRankRating getWinsRatio() {
		return wins_ratio;
	}

	public PlayerRankRating getXpAmount() {
		return xp_amount;
	}

	public PlayerRankRating getXpAvg() {
		return xp_avg;
	}

	public PlayerRankRating getXpMax() {
		return xp_max;
	}

	private long account_id;
	private PlayerRankRating battles_count;
	private long battles_to_play;
	private PlayerRankRating capture_points;
	private PlayerRankRating damage_avg;
	private PlayerRankRating damage_dealt;
	private PlayerRankRating frags_avg;
	private PlayerRankRating frags_count;
	private PlayerRankRating global_rating;
	private PlayerRankRating hits_ratio;
	private PlayerRankRating spotted_avg;
	private PlayerRankRating spotted_count;
	private PlayerRankRating survived_ratio;
	private PlayerRankRating wins_ratio;
	private PlayerRankRating xp_amount;
	private PlayerRankRating xp_avg;
	private PlayerRankRating xp_max;
}