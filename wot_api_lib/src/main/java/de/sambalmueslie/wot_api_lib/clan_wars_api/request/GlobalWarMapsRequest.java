package de.sambalmueslie.wot_api_lib.clan_wars_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.lang.Object;
import java.util.Map;

public class GlobalWarMapsRequest extends BaseWotRequest  {

	public GlobalWarMapsRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "globalwar/maps/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		
	}

}

