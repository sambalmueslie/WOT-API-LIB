package de.sambalmueslie.wot_api_lib.clan_wars_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

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

