package de.sambalmueslie.wot_api_lib.tankopedia_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class EncyclopediaAchievementsRequest extends BaseWotRequest  {

	public EncyclopediaAchievementsRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "encyclopedia/achievements/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		
	}

}

