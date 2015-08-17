package de.sambalmueslie.wot_api_lib.tankopedia_api.response;

import java.util.Map;

import de.sambalmueslie.wot_api_lib.common.BaseWotResponse;

public class EncyclopediaProvisionsResponse extends BaseWotResponse {
	public class Provision {
		public String getDescription() {
			return description;
		}

		public String getImage() {
			return image;
		}

		public String getName() {
			return name;
		}

		public long getPriceCredit() {
			return price_credit;
		}

		public long getPriceGold() {
			return price_gold;
		}

		public long getProvisionId() {
			return provision_id;
		}

		public String getTag() {
			return tag;
		}

		public String getType() {
			return type;
		}

		public long getWeight() {
			return weight;
		}

		private String description;
		private String image;
		private String name;
		private long price_credit;
		private long price_gold;
		private long provision_id;
		private String tag;
		private String type;
		private long weight;
	}

	public Map<String, Provision> getData() {
		return data;
	}

	private Map<String, Provision> data;
}
