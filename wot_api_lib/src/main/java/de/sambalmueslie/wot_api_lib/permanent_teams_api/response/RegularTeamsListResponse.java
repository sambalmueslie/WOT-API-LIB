package de.sambalmueslie.wot_api_lib.permanent_teams_api.response;

import de.sambalmueslie.wot_api_lib.clans_api.response.ClanEmblems;
import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class RegularTeamsListResponse extends BaseWotResponse {
	public class RegularTeamsEntry {
		public long getCaptainId() {
			return captain_id;
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

		public String getTag() {
			return tag;
		}

		public long getTeamId() {
			return team_id;
		}

		private long captain_id;
		private ClanEmblems emblems;
		private RegularTeamLadder ladder;
		private long members_count;
		private String name;
		private String tag;
		private long team_id;
	}

	public RegularTeamsEntry[] getData() {
		return data;
	}

	private RegularTeamsEntry[] data;
}
