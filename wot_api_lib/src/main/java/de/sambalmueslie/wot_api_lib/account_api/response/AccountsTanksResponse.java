package de.sambalmueslie.wot_api_lib.account_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class AccountsTanksResponse extends BaseWotResponse {
	public class AccountTanksEntry {

		public long getMarkOfMastery() {
			return mark_of_mastery;
		}

		public Statistics getStatistics() {
			return statistics;
		}

		public long getTankId() {
			return tank_id;
		}

		private long mark_of_mastery;
		private Statistics statistics;
		private long tank_id;
	}

	public class Statistics {
		/**
		 * @return the {@link #battles}
		 */
		public long getBattles() {
			return battles;
		}

		/**
		 * @return the {@link #wins}
		 */
		public long getWins() {
			return wins;
		}

		private long battles;
		private long wins;
	}

	public Map<String, AccountTanksEntry[]> getData() {
		return data;
	}

	private Map<String, AccountTanksEntry[]> data;

}
