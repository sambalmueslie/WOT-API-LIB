package de.sambalmueslie.wot_api_lib.player_vehicles_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class PlayerVehiclesStatsResponse extends BaseWotResponse {

	public class PlayerVehicleStats {
		public long getAccountId() {
			return account_id;
		}

		public Stats getAll() {
			return all;
		}

		public Stats getClan() {
			return clan;
		}

		public Stats getCompany() {
			return company;
		}

		public long getFrags() {
			return frags;
		}

		public Stats getGlobalmap() {
			return globalmap;
		}

		public String getInGarage() {
			return in_garage;
		}

		public long getMarkOfMastery() {
			return mark_of_mastery;
		}

		public long getMaxFrags() {
			return max_frags;
		}

		public long getMaxXp() {
			return max_xp;
		}

		public Stats getRegularTeam() {
			return regular_team;
		}

		public Stats getStrongholdDefense() {
			return stronghold_defense;
		}

		public Stats getStrongholdSkirmish() {
			return stronghold_skirmish;
		}

		public long getTankId() {
			return tank_id;
		}

		public Stats getTeam() {
			return team;
		}

		private long account_id;
		private Stats all;
		private Stats clan;
		private Stats company;
		private long frags;
		private Stats globalmap;
		private String in_garage;
		private long mark_of_mastery;
		private long max_frags;
		private long max_xp;
		private Stats regular_team;
		private Stats stronghold_defense;
		private Stats stronghold_skirmish;
		private long tank_id;
		private Stats team;
	}

	public class Stats {
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

		public long getDraws() {
			return draws;
		}

		public long getDroppedCapturePoints() {
			return dropped_capture_points;
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

		public long getMaxDamage() {
			return max_damage;
		}

		public long getMaxFrags() {
			return max_frags;
		}

		public long getMaxXp() {
			return max_xp;
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
		private long draws;
		private long dropped_capture_points;
		private long frags;
		private long hits;
		private long hits_percents;
		private long losses;
		private long max_damage;
		private long max_frags;
		private long max_xp;
		private long shots;
		private long spotted;
		private long survived_battles;
		private long wins;
		private long xp;
	}

	public Map<String, PlayerVehicleStats[]> getData() {
		return data;
	}

	private Map<String, PlayerVehicleStats[]> data;
}
