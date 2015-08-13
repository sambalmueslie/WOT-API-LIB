package de.sambalmueslie.wot_api_lib.clans_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class ClansMembersInfoResponse extends BaseWotResponse {
	public class ClanInfo {
		public long getClanId() {
			return clan_id;
		}

		public String getColor() {
			return color;
		}

		public long getCreatedAt() {
			return created_at;
		}

		public ClanEmblems getEmblems() {
			return emblems;
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

		private long clan_id;
		private String color;
		private long created_at;
		private ClanEmblems emblems;
		private long members_count;
		private String name;
		private String tag;
	}

	public class ClanMembersInfoEntry {
		public long getAccountId() {
			return account_id;
		}

		public String getAccountName() {
			return account_name;
		}

		public ClanInfo getClan() {
			return clan;
		}

		public long getJoinedAt() {
			return joined_at;
		}

		public String getRole() {
			return role;
		}

		public String getRoleI18n() {
			return role_i18n;
		}

		private long account_id;
		private String account_name;
		private ClanInfo clan;
		private long joined_at;
		private String role;
		private String role_i18n;
	}

	public Map<String, ClanMembersInfoEntry> getData() {
		return data;
	}

	private Map<String, ClanMembersInfoEntry> data;
}
