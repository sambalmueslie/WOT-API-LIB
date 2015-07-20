package de.sambalmueslie.wot_api_lib.player_ratings_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class PlayerRatingsAccountsRequest extends BaseWotRequest  {

	public PlayerRatingsAccountsRequest(final long account_id,final java.lang.String type) {
		this.account_id = account_id;
		this.type = type;
	}

	@Override
	public String getMethod(  ) { 
		return "wot/ratings/accounts/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (account_id > 0) {
			params.put("account_id",account_id);
		}
if (battle_type != null ) {
			params.put("battle_type",battle_type);
		}
if (date != null ) {
			params.put("date",date);
		}
if (type != null ) {
			params.put("type",type);
		}

	}

	public  void setBattle_type( String battle_type ) { 
		this.battle_type = battle_type;

	}

	public  void setDate( String date ) { 
		this.date = date;

	}

	private long account_id;
	private java.lang.String battle_type;
	private java.lang.String date;
	private java.lang.String type;
}

