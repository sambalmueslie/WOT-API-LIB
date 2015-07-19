package de.sambalmueslie.wot_api_lib.clan_ratings_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class ClanratingsTopRequest extends BaseWotRequest  {

	public ClanratingsTopRequest(final java.lang.String rank_field,final java.lang.String type) {
		this.rank_field = rank_field;
		this.type = type;
	}

	@Override
	public String getMethod(  ) { 
		return "clanratings/top/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (date != null ) {
			params.put("date",date);
		}
if (limit > 0) {
			params.put("limit",limit);
		}
if (page_no > 0) {
			params.put("page_no",page_no);
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

	public  void setPage_no( long page_no ) { 
		this.page_no = page_no;

	}

	private java.lang.String date;
	private long limit;
	private long page_no;
	private java.lang.String rank_field;
	private java.lang.String type;
}

