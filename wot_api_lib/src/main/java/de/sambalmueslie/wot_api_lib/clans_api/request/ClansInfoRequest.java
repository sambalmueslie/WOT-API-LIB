package de.sambalmueslie.wot_api_lib.clans_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class ClansInfoRequest extends BaseWotRequest  {

	public ClansInfoRequest(final long clan_id) {
		this.clan_id = clan_id;
	}

	@Override
	public String getMethod(  ) { 
		return "clans/info/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (access_token != null ) {
			params.put("access_token",access_token);
		}
if (clan_id > 0) {
			params.put("clan_id",clan_id);
		}

	}

	public  void setAccess_token( String access_token ) { 
		this.access_token = access_token;

	}

	private java.lang.String access_token;
	private long clan_id;
}

