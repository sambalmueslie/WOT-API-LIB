package de.sambalmueslie.wot_api_lib.strongholds_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class StrongholdInfoRequest extends BaseWotRequest  {

	public StrongholdInfoRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "wot/stronghold/buildings/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		
	}

}

