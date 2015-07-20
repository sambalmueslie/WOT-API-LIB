package de.sambalmueslie.wot_api_lib.clan_wars_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class GlobalWarAccountClanPointsRequest extends BaseWotRequest  {

	public GlobalWarAccountClanPointsRequest(final long clan_id,final java.lang.String map_id) {
		this.clan_id = clan_id;
		this.map_id = map_id;
	}

	@Override
	public String getMethod(  ) { 
		return "wot/globalwar/clanpoints/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (clan_id > 0) {
			params.put("clan_id",clan_id);
		}
if (map_id != null ) {
			params.put("map_id",map_id);
		}

	}

	private long clan_id;
	private java.lang.String map_id;
}

