package de.sambalmueslie.wot_api_lib.strongholds_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class StrongholdAccountStatsResponse extends BaseWotResponse {
	public class StrongholdAccountStatsEntry {
		public long getAccountId() {
			return account_id;
		}

		public long getClanId() {
			return clan_id;
		}

		public StrongholdStats getStrongholdDefense() {
			return stronghold_defense;
		}

		public StrongholdStats getStrongholdSkirmish() {
			return stronghold_skirmish;
		}

		private long account_id;
		private long clan_id;
		private StrongholdStats stronghold_defense;
		private StrongholdStats stronghold_skirmish;
	}

	public class StrongholdStats {
		public long getBattleAvgXp() {
			return battle_avg_xp;
		}

		public long getBattles() {
			return battles;
		}

		public long getCapturePoints() {
			return capture_points;
		}

		public long getDamageDealt() {
			return damage_dealt;
		}

		public long getDamageReceived() {
			return damage_received;
		}

		public long getDirectHitsReceived() {
			return direct_hits_received;
		}

		public long getDraws() {
			return draws;
		}

		public long getDroppedCapturePoints() {
			return dropped_capture_points;
		}

		public long getExplosionHits() {
			return explosion_hits;
		}

		public long getExplosionHitsReceived() {
			return explosion_hits_received;
		}

		public long getFrags() {
			return frags;
		}

		public long getHits() {
			return hits;
		}

		public long getHitsPercents() {
			return hits_percents;
		}

		public long getLosses() {
			return losses;
		}

		public long getNoDamageDirectHitsReceived() {
			return no_damage_direct_hits_received;
		}

		public long getPiercings() {
			return piercings;
		}

		public long getPiercingsReceived() {
			return piercings_received;
		}

		public long getShots() {
			return shots;
		}

		public long getSpotted() {
			return spotted;
		}

		public long getSurvivedBattles() {
			return survived_battles;
		}

		public double getTankingFactor() {
			return tanking_factor;
		}

		public long getWins() {
			return wins;
		}

		public long getXp() {
			return xp;
		}

		private long battle_avg_xp;
		private long battles;
		private long capture_points;
		private long damage_dealt;
		private long damage_received;
		private long direct_hits_received;
		private long draws;
		private long dropped_capture_points;
		private long explosion_hits;
		private long explosion_hits_received;
		private long frags;
		private long hits;
		private long hits_percents;
		private long losses;
		private long no_damage_direct_hits_received;
		private long piercings;
		private long piercings_received;
		private long shots;
		private long spotted;
		private long survived_battles;
		private double tanking_factor;
		private long wins;
		private long xp;
	}

	public Map<String, StrongholdAccountStatsEntry> getData() {
		return data;
	}

	private Map<String, StrongholdAccountStatsEntry> data;
}
