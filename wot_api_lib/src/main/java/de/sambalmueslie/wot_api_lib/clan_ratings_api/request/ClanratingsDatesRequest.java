package de.sambalmueslie.wot_api_lib.clan_ratings_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class ClanratingsDatesRequest extends BaseWotRequest  {

	public ClanratingsDatesRequest(final java.lang.String type) {
		this.type = type;
	}

	@Override
	public String getMethod(  ) { 
		return "wot/clanratings/dates/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (clan_id > 0) {
			params.put("clan_id",clan_id);
		}
if (type != null ) {
			params.put("type",type);
		}

	}

	public  void setClan_id( long clan_id ) { 
		this.clan_id = clan_id;

	}

	private long clan_id;
	private java.lang.String type;
}

