package de.sambalmueslie.wot_api_lib.player_ratings_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class PlayerRatingsTypesRequest extends BaseWotRequest  {

	public PlayerRatingsTypesRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "wot/ratings/types/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (battle_type != null ) {
			params.put("battle_type",battle_type);
		}

	}

	public  void setBattle_type( String battle_type ) { 
		this.battle_type = battle_type;

	}

	private java.lang.String battle_type;
}

