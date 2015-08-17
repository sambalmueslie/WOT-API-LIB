package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class EncyclopediaPersonalMissionsResponse extends BaseWotResponse {

	public class Mission {
		public String getDescription() {
			return description;
		}

		public String getHint() {
			return hint;
		}

		public int getMaxLevel() {
			return max_level;
		}

		public int getMinLevel() {
			return min_level;
		}

		public long getMissionId() {
			return mission_id;
		}

		public String getName() {
			return name;
		}

		public Map<String, MissionReward> getRewards() {
			return rewards;
		}

		public long getSetId() {
			return set_id;
		}

		public String[] getTags() {
			return tags;
		}

		private String description;
		private String hint;
		private int max_level;
		private int min_level;
		private long mission_id;
		private String name;
		private Map<String, MissionReward> rewards;
		private long set_id;
		private String[] tags;
	}

	public class MissionReward {
		public int getBerths() {
			return berths;
		}

		public String getConditions() {
			return conditions;
		}

		public long getCredits() {
			return credits;
		}

		public long getFreeXp() {
			return free_xp;
		}

		public Map<String, Long> getItems() {
			return items;
		}

		public long getPremium() {
			return premium;
		}

		public int getSlots() {
			return slots;
		}

		public long getTokens() {
			return tokens;
		}

		private int berths;
		private String conditions;
		private long credits;
		private long free_xp;
		private Map<String, Long> items;
		private long premium;
		private int slots;
		private long tokens;
	}

	public class Operation {
		public String getDescription() {
			return description;
		}

		public String getImage() {
			return image;
		}

		public Map<String, Mission> getMissions() {
			return missions;
		}

		public int getMissionsInSet() {
			return missions_in_set;
		}

		public String getName() {
			return name;
		}

		public long getNextId() {
			return next_id;
		}

		public long getOperationId() {
			return operation_id;
		}

		public OperationReward getReward() {
			return reward;
		}

		public int getSetsCount() {
			return sets_count;
		}

		public int getSetsToNext() {
			return sets_to_next;
		}

		private String description;
		private String image;
		private Map<String, Mission> missions;
		private int missions_in_set;
		private String name;
		private long next_id;
		private long operation_id;
		private OperationReward reward;
		private int sets_count;
		private int sets_to_next;
	}

	public class OperationReward {
		public int getSlots() {
			return slots;
		}

		public long[] getTanks() {
			return tanks;
		}

		private int slots;
		private long[] tanks;
	}

	public class PersonalMission {
		public long getCampaign_id() {
			return campaign_id;
		}

		public String getDescription() {
			return description;
		}

		public String getName() {
			return name;
		}

		public Map<String, Operation> getOperations() {
			return operations;
		}

		private long campaign_id;
		private String description;
		private String name;
		private Map<String, Operation> operations;
	}

	public Map<String, PersonalMission> getData() {
		return data;
	}

	private Map<String, PersonalMission> data;
}
