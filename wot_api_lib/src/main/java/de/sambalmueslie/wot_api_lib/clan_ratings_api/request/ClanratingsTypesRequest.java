package de.sambalmueslie.wot_api_lib.clan_ratings_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class ClanratingsTypesRequest extends BaseWotRequest  {

	public ClanratingsTypesRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "clanratings/types/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		
	}

}

