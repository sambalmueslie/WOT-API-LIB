package de.sambalmueslie.wot_api_lib.clan_ratings_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class ClanratingsClansRequest extends BaseWotRequest  {

	public ClanratingsClansRequest(final long clan_id,final java.lang.String type) {
		this.clan_id = clan_id;
		this.type = type;
	}

	@Override
	public String getMethod(  ) { 
		return "wot/clanratings/clans/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (clan_id > 0) {
			params.put("clan_id",clan_id);
		}
if (date != null ) {
			params.put("date",date);
		}
if (type != null ) {
			params.put("type",type);
		}

	}

	public  void setDate( String date ) { 
		this.date = date;

	}

	private long clan_id;
	private java.lang.String date;
	private java.lang.String type;
}

