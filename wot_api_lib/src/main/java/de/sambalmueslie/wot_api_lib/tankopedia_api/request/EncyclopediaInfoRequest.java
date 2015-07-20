package de.sambalmueslie.wot_api_lib.tankopedia_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class EncyclopediaInfoRequest extends BaseWotRequest  {

	public EncyclopediaInfoRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "wot/encyclopedia/info/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		
	}

}

