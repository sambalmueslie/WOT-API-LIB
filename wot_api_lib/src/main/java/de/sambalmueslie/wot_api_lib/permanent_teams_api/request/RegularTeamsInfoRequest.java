package de.sambalmueslie.wot_api_lib.permanent_teams_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class RegularTeamsInfoRequest extends BaseWotRequest  {

	public RegularTeamsInfoRequest(final long team_id) {
		this.team_id = team_id;
	}

	@Override
	public String getMethod(  ) { 
		return "wot/regularteams/info/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (team_id > 0) {
			params.put("team_id",team_id);
		}

	}

	private long team_id;
}

