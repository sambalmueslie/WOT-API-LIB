package de.sambalmueslie.wot_api_lib.clan_wars_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class GlobalWarAccountClanProvincesRequest extends BaseWotRequest  {

	public GlobalWarAccountClanProvincesRequest(final java.lang.String clan_id) {
		this.clan_id = clan_id;
	}

	@Override
	public String getMethod(  ) { 
		return "wot/globalwar/clanprovinces/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (clan_id != null ) {
			params.put("clan_id",clan_id);
		}

	}

	private java.lang.String clan_id;
}

