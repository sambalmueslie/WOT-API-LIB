package de.sambalmueslie.wot_api_lib.clan_wars_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.lang.Object;
import java.util.Map;

public class GlobalWarAccountPointsRequest extends BaseWotRequest  {

	public GlobalWarAccountPointsRequest(final long account_id,final java.lang.String map_id) {
		this.account_id = account_id;
		this.map_id = map_id;
	}

	@Override
	public String getMethod(  ) { 
		return "globalwar/accountpoints/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (account_id > 0) {
			params.put("account_id",account_id);
		}
if (map_id != null ) {
			params.put("map_id",map_id);
		}

	}

	private long account_id;
	private java.lang.String map_id;
}

