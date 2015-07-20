package de.sambalmueslie.wot_api_lib.clans_api.response;

import de.sambalmueslie.wot_api_lib.clans_api.request.ClansListRequest;
import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

/**
 * The response for the {@link ClansListRequest}.
 *
 * @autor Sambalmueslie
 */
public class ClansListResponse extends BaseWotResponse {

	/**
	 * A clan list entry.
	 *
	 * @autor Sambalmueslie
	 */
	public class ClansListEntry {
		/**
		 * @return the {@link #clan_id}
		 */
		public long getClanId() {
			return clan_id;
		}

		/**
		 * @return the {@link #color}
		 */
		public String getColor() {
			return color;
		}

		/**
		 * @return the {@link #created_at}
		 */
		public long getCreatedAt() {
			return created_at;
		}

		/**
		 * @return the {@link #emblems}
		 */
		public ClanEmblems getEmblems() {
			return emblems;
		}

		/**
		 * @return the {@link #members_count}
		 */
		public long getMembersCount() {
			return members_count;
		}

		/**
		 * @return the {@link #name}
		 */
		public String getName() {
			return name;
		}

		/**
		 * @return the {@link #tag}
		 */
		public String getTag() {
			return tag;
		}

		/** Clan ID. */
		private long clan_id;
		/** Clan color in HEX #RRGGBB. */
		private String color;
		/** Clan creation date. */
		private long created_at;
		/** the {@link ClanEmblems}. */
		private ClanEmblems emblems;
		/** Number of clan members. */
		private long members_count;
		/** Clan name. */
		private String name;
		/** Clan Tag. */
		private String tag;
	}

	/**
	 * @return the {@link #data}
	 */
	public ClansListEntry[] getData() {
		return data;
	}

	/** the data. */
	private ClansListEntry[] data;
}
