package de.sambalmueslie.wot_api_lib.clans_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class ClansInfoResponse extends BaseWotResponse {

	public class ClanInfoEntry {
		public long getClanId() {
			return clan_id;
		}

		public String getColor() {
			return color;
		}

		public long getCreatedAt() {
			return created_at;
		}

		public long getCreatorId() {
			return creator_id;
		}

		public String getCreatorName() {
			return creator_name;
		}

		public String getDescription() {
			return description;
		}

		public String getDescriptionHtml() {
			return description_html;
		}

		public ClanEmblems getEmblems() {
			return emblems;
		}

		public long getLeaderId() {
			return leader_id;
		}

		public String getLeaderName() {
			return leader_name;
		}

		public ClanMember[] getMembers() {
			return members;
		}

		public long getMembersCount() {
			return members_count;
		}

		public String getMotto() {
			return motto;
		}

		public String getName() {
			return name;
		}

		public String getOldName() {
			return old_name;
		}

		public String getOldTag() {
			return old_tag;
		}

		public long getRenamedAt() {
			return renamed_at;
		}

		public String getTag() {
			return tag;
		}

		public long getUpdatedAt() {
			return updated_at;
		}

		public boolean isAcceptsJoinRequests() {
			return accepts_join_requests;
		}

		public boolean isClanDisbanded() {
			return is_clan_disbanded;
		}

		private boolean accepts_join_requests;
		private long clan_id;
		private String color;
		private long created_at;
		private long creator_id;
		private String creator_name;
		private String description;
		private String description_html;
		private ClanEmblems emblems;
		private boolean is_clan_disbanded;
		private long leader_id;
		private String leader_name;
		private ClanMember[] members;
		private long members_count;
		private String motto;
		private String name;
		private String old_name;
		private String old_tag;
		private long renamed_at;
		private String tag;
		private long updated_at;
	}

	public class ClanMember {
		public long getAccountId() {
			return account_id;
		}

		public String getAccountName() {
			return account_name;
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
		private long joined_at;
		private String role;
		private String role_i18n;
	}

	public Map<String, ClanInfoEntry> getData() {
		return data;
	}

	private Map<String, ClanInfoEntry> data;
}
