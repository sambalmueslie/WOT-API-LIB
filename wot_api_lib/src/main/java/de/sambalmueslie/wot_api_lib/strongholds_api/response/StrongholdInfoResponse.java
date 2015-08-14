package de.sambalmueslie.wot_api_lib.strongholds_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class StrongholdInfoResponse extends BaseWotResponse {

	public class StrongholdBuilding {
		public String getDirectionName() {
			return direction_name;
		}

		public long getLevel() {
			return level;
		}

		public long getType() {
			return type;
		}

		private String direction_name;
		private long level;
		private long type;
	}

	public class StrongholdDefense {
		public int getAttacksCount() {
			return attacks_count;
		}

		public int getAttacksEfficiency() {
			return attacks_efficiency;
		}

		public int getAttacksWins() {
			return attacks_wins;
		}

		public int getBattlesCount() {
			return battles_count;
		}

		public int getBattlesWinPercentage() {
			return battles_win_percentage;
		}

		public int getBattlesWins() {
			return battles_wins;
		}

		public int getCaptureBasesCount() {
			return capture_bases_count;
		}

		public int getCaptureBuildingsCount() {
			return capture_buildings_count;
		}

		public int getCaptureResourcesCount() {
			return capture_resources_count;
		}

		public int getClashesCount() {
			return clashes_count;
		}

		public int getClashesWinPercentage() {
			return clashes_win_percentage;
		}

		public int getClashesWins() {
			return clashes_wins;
		}

		public int getDefensesCount() {
			return defenses_count;
		}

		public int getDefensesEfficiency() {
			return defenses_efficiency;
		}

		public int getDefensesWins() {
			return defenses_wins;
		}

		public int getLossBasesCount() {
			return loss_bases_count;
		}

		public int getLossBuildingsCount() {
			return loss_buildings_count;
		}

		public int getLossResourcesCount() {
			return loss_resources_count;
		}

		private int attacks_count;
		private int attacks_efficiency;
		private int attacks_wins;
		private int battles_count;
		private int battles_win_percentage;
		private int battles_wins;
		private int capture_bases_count;
		private int capture_buildings_count;
		private int capture_resources_count;
		private int clashes_count;
		private int clashes_win_percentage;
		private int clashes_wins;
		private int defenses_count;
		private int defenses_efficiency;
		private int defenses_wins;
		private int loss_bases_count;
		private int loss_buildings_count;
		private int loss_resources_count;
	}

	public class StrongholdInfoEntry {
		public Map<String, StrongholdBuilding> getBuildings() {
			return buildings;
		}

		public long getClanId() {
			return clan_id;
		}

		public StrongholdDefense getDefense() {
			return defense;
		}

		public int getDirectionsCount() {
			return directions_count;
		}

		public int getLevel() {
			return level;
		}

		public StrongholdSkirmish getSkirmish() {
			return skirmish;
		}

		public boolean isDefenseModeActivated() {
			return defense_mode_is_activated;
		}

		private Map<String, StrongholdBuilding> buildings;
		private long clan_id;
		private StrongholdDefense defense;
		private boolean defense_mode_is_activated;
		private int directions_count;
		private int level;
		private StrongholdSkirmish skirmish;
	}

	public class StrongholdSkirmish {
		public int getBattlesCount() {
			return battles_count;
		}

		public int getBattlesWinPercentage() {
			return battles_win_percentage;
		}

		public int getBattlesWins() {
			return battles_wins;
		}

		private int battles_count;
		private int battles_win_percentage;
		private int battles_wins;
	}

	public Map<String, StrongholdInfoEntry> getData() {
		return data;
	}

	private Map<String, StrongholdInfoEntry> data;
}
