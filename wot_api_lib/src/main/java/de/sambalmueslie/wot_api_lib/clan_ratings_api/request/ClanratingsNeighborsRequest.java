package de.sambalmueslie.wot_api_lib.clan_ratings_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class ClanratingsNeighborsRequest extends BaseWotRequest  {

	public ClanratingsNeighborsRequest(final long clan_id,final java.lang.String rank_field,final java.lang.String type) {
		this.clan_id = clan_id;
		this.rank_field = rank_field;
		this.type = type;
	}

	@Override
	public String getMethod(  ) { 
		return "clanratings/neighbors/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (clan_id > 0) {
			params.put("clan_id",clan_id);
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

	private long clan_id;
	private java.lang.String date;
	private long limit;
	private java.lang.String rank_field;
	private java.lang.String type;
}

