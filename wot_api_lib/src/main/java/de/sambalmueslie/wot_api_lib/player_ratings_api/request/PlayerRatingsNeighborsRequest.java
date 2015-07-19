package de.sambalmueslie.wot_api_lib.player_ratings_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class PlayerRatingsNeighborsRequest extends BaseWotRequest  {

	public PlayerRatingsNeighborsRequest(final long account_id,final java.lang.String rank_field,final java.lang.String type) {
		this.account_id = account_id;
		this.rank_field = rank_field;
		this.type = type;
	}

	@Override
	public String getMethod(  ) { 
		return "ratings/neighbors/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (account_id > 0) {
			params.put("account_id",account_id);
		}
if (date != null ) {
			params.put("date",date);
		}
if (limit > 0) {
			params.put("limit",limit);
		}
if (rank_field != null ) {
			params.put("rank_field",rank_field);
		}
if (type != null ) {
			params.put("type",type);
		}

	}

	public  void setDate( String date ) { 
		this.date = date;

	}

	public  void setLimit( long limit ) { 
		this.limit = limit;

	}

	private long account_id;
	private java.lang.String date;
	private long limit;
	private java.lang.String rank_field;
	private java.lang.String type;
}

