package de.sambalmueslie.wot_api_lib.clan_wars_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import java.time.LocalDateTime;

public class GlobalWarAccountPointsHistoryRequest extends BaseWotRequest  {

	public GlobalWarAccountPointsHistoryRequest(final java.lang.String access_token,final java.lang.String map_id) {
		this.access_token = access_token;
		this.map_id = map_id;
	}

	@Override
	public String getMethod(  ) { 
		return "wot/globalwar/accountpointshistory/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (access_token != null ) {
			params.put("access_token",access_token);
		}
if (limit > 0) {
			params.put("limit",limit);
		}
if (map_id != null ) {
			params.put("map_id",map_id);
		}
if (page_no > 0) {
			params.put("page_no",page_no);
		}
if (since != null ) {
			params.put("since",since);
		}
if (until != null ) {
			params.put("until",until);
		}

	}

	public  void setLimit( long limit ) { 
		this.limit = limit;

	}

	public  void setPage_no( long page_no ) { 
		this.page_no = page_no;

	}

	public  void setSince( LocalDateTime since ) { 
		this.since = since;

	}

	public  void setUntil( LocalDateTime until ) { 
		this.until = until;

	}

	private java.lang.String access_token;
	private long limit;
	private java.lang.String map_id;
	private long page_no;
	private java.time.LocalDateTime since;
	private java.time.LocalDateTime until;
}

