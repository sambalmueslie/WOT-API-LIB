package de.sambalmueslie.wot_api_lib.permanent_teams_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.clans_api.response.ClanEmblems;
import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class RegularTeamsInfoResponse extends BaseWotResponse {

	public class RegularTeamPlayer {
		public long getAccountId() {
			return account_id;
		}

		public long getJoinedAt() {
			return joined_at;
		}

		public String getRole() {
			return role;
		}

		private long account_id;
		private long joined_at;
		private String role;
	}

	public class RegularTeamsInfoEntry {
		public boolean acceptsJoinRequests() {
			return accepts_join_requests;
		}

		public boolean allowRandomBattles() {
			return allow_random_battles;
		}

		public long getBattlesCount() {
			return battles_count;
		}

		public long getCaptainId() {
			return captain_id;
		}

		public long getCreatedAt() {
			return created_at;
		}

		public String getDescription() {
			return description;
		}

		public ClanEmblems getEmblems() {
			return emblems;
		}

		public RegularTeamLadder getLadder() {
			return ladder;
		}

		public long getMembersCount() {
			return members_count;
		}

		public String getName() {
			return name;
		}

		public RegularTeamPlayer[] getPlayers() {
			return players;
		}

		public String getShortDescription() {
			return short_description;
		}

		public String getTag() {
			return tag;
		}

		public long getTeamId() {
			return team_id;
		}

		public long getUpdatedAt() {
			return updated_at;
		}

		public long getWinsCount() {
			return wins_count;
		}

		private boolean accepts_join_requests;
		private boolean allow_random_battles;
		private long battles_count;
		private long captain_id;
		private long created_at;
		private String description;
		private ClanEmblems emblems;
		private RegularTeamLadder ladder;
		private long members_count;
		private String name;
		private RegularTeamPlayer[] players;
		private String short_description;
		private String tag;
		private long team_id;
		private long updated_at;
		private long wins_count;
	}

	public Map<String, RegularTeamsInfoEntry> getData() {
		return data;
	}

	private Map<String, RegularTeamsInfoEntry> data;
}
