package de.sambalmueslie.wot_api_lib.clan_wars_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class GlobalWarBattlesRequest extends BaseWotRequest  {

	public GlobalWarBattlesRequest(final java.lang.String map_id,final java.lang.String province_id) {
		this.map_id = map_id;
		this.province_id = province_id;
	}

	@Override
	public String getMethod(  ) { 
		return "globalwar/battles/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (map_id != null ) {
			params.put("map_id",map_id);
		}
if (province_id != null ) {
			params.put("province_id",province_id);
		}

	}

	private java.lang.String map_id;
	private java.lang.String province_id;
}

