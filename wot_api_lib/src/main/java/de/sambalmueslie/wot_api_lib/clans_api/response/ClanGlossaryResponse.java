package de.sambalmueslie.wot_api_lib.clans_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class ClanGlossaryResponse extends BaseWotResponse {
	public class ClanRoles {

		/**
		 * @return the {@link #clan_roles}
		 */
		public Map<String, String> getClanRoles() {
			return clan_roles;
		}

		private Map<String, String> clan_roles;
	}

	/**
	 * @return the {@link #data}
	 */
	public ClanRoles getData() {
		return data;
	}

	private ClanRoles data;
}
