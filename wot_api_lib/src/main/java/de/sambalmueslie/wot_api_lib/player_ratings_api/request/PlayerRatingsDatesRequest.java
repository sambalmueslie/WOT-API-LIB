package de.sambalmueslie.wot_api_lib.player_ratings_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class PlayerRatingsDatesRequest extends BaseWotRequest  {

	public PlayerRatingsDatesRequest(final java.lang.String type) {
		this.type = type;
	}

	@Override
	public String getMethod(  ) { 
		return "ratings/dates/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (account_id > 0) {
			params.put("account_id",account_id);
		}
if (battle_type != null ) {
			params.put("battle_type",battle_type);
		}
if (type != null ) {
			params.put("type",type);
		}

	}

	public  void setAccount_id( long account_id ) { 
		this.account_id = account_id;

	}

	public  void setBattle_type( String battle_type ) { 
		this.battle_type = battle_type;

	}

	private long account_id;
	private java.lang.String battle_type;
	private java.lang.String type;
}

