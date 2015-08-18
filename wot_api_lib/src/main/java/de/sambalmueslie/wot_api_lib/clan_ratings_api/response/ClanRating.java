package de.sambalmueslie.wot_api_lib.clan_ratings_api.response;

public class ClanRating {
	public ClanRankRating getAvgBattlesCount() {
		return avg_battles_count;
	}

	public ClanRankRating getAvgGlobalRating() {
		return avg_global_rating;
	}

	public ClanRankRating getBattlesCountAvg() {
		return battles_count_avg;
	}

	public ClanRankRating getBattlesCountAvgDaily() {
		return battles_count_avg_daily;
	}

	public long getClanId() {
		return clan_id;
	}

	public String getClanName() {
		return clan_name;
	}

	public String getClanTag() {
		return clan_tag;
	}

	public ClanRankRating getEfficiency() {
		return efficiency;
	}

	public ClanRankRating getEloRatingFb() {
		return elo_rating_fb;
	}

	public ClanRankRating getEloRatingGm() {
		return elo_rating_gm;
	}

	public ClanRankRating getGlobalRatingAvg() {
		return global_rating_avg;
	}

	public ClanRankRating getRatingFort() {
		return rating_fort;
	}

	public ClanRankRating getV10lAvg() {
		return v10l_avg;
	}

	public ClanRankRating getV10lCount() {
		return v10l_count;
	}

	public ClanRankRating getWinsRatioAvg() {
		return wins_ratio_avg;
	}

	public ClanRankRating getWinsRatioFs() {
		return wins_ratio_fs;
	}

	private ClanRankRating avg_battles_count;
	private ClanRankRating avg_global_rating;
	private ClanRankRating battles_count_avg;
	private ClanRankRating battles_count_avg_daily;
	private long clan_id;
	private String clan_name;
	private String clan_tag;
	private ClanRankRating efficiency;
	private ClanRankRating elo_rating_fb;
	private ClanRankRating elo_rating_gm;
	private ClanRankRating global_rating_avg;
	private ClanRankRating rating_fort;
	private ClanRankRating v10l_avg;
	private ClanRankRating v10l_count;
	private ClanRankRating wins_ratio_avg;
	private ClanRankRating wins_ratio_fs;
}