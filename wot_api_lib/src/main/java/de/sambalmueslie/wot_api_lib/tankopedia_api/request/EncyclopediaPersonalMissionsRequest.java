package de.sambalmueslie.wot_api_lib.tankopedia_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class EncyclopediaPersonalMissionsRequest extends BaseWotRequest  {

	public EncyclopediaPersonalMissionsRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "encyclopedia/personalmissions/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (campaign_id > 0) {
			params.put("campaign_id",campaign_id);
		}
if (operation_id > 0) {
			params.put("operation_id",operation_id);
		}
if (set_id > 0) {
			params.put("set_id",set_id);
		}
if (tag_id != null ) {
			params.put("tag_id",tag_id);
		}

	}

	public  void setCampaign_id( long campaign_id ) { 
		this.campaign_id = campaign_id;

	}

	public  void setOperation_id( long operation_id ) { 
		this.operation_id = operation_id;

	}

	public  void setSet_id( long set_id ) { 
		this.set_id = set_id;

	}

	public  void setTag_id( String tag_id ) { 
		this.tag_id = tag_id;

	}

	private long campaign_id;
	private long operation_id;
	private long set_id;
	private java.lang.String tag_id;
}

