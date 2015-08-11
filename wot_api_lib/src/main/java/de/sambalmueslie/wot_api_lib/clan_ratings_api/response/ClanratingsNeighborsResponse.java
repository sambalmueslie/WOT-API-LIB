package de.sambalmueslie.wot_api_lib.clan_ratings_api.response;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class ClanratingsNeighborsResponse extends BaseWotResponse {

	public class ClanratingsNeighborsEntry {
		public Clanrating getAvgBattlesCount() {
			return avg_battles_count;
		}

		public Clanrating getAvgGlobalRating() {
			return avg_global_rating;
		}

		public Clanrating getBattlesCountAvg() {
			return battles_count_avg;
		}

		public Clanrating getBattlesCountAvgDaily() {
			return battles_count_avg_daily;
		}

		public long getClanId() {
			return clan_id;
		}

		public Clanrating getEfficiency() {
			return efficiency;
		}

		public Clanrating getEloRatingFb() {
			return elo_rating_fb;
		}

		public Clanrating getEloRatingGm() {
			return elo_rating_gm;
		}

		public Clanrating getGlobalRatingAvg() {
			return global_rating_avg;
		}

		public Clanrating getRatingFort() {
			return rating_fort;
		}

		public Clanrating getV10lAvg() {
			return v10l_avg;
		}

		public Clanrating getV10lCount() {
			return v10l_count;
		}

		public Clanrating getWinsRatioAvg() {
			return wins_ratio_avg;
		}

		public Clanrating getWinsRatioFs() {
			return wins_ratio_fs;
		}

		private Clanrating avg_battles_count;
		private Clanrating avg_global_rating;
		private Clanrating battles_count_avg;
		private Clanrating battles_count_avg_daily;
		private long clan_id;
		private Clanrating efficiency;
		private Clanrating elo_rating_fb;
		private Clanrating elo_rating_gm;
		private Clanrating global_rating_avg;
		private Clanrating rating_fort;
		private Clanrating v10l_avg;
		private Clanrating v10l_count;
		private Clanrating wins_ratio_avg;
		private Clanrating wins_ratio_fs;
	}

	public ClanratingsNeighborsEntry[] getData() {
		return data;
	}

	private ClanratingsNeighborsEntry[] data;

}
