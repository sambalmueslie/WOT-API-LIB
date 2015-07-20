package de.sambalmueslie.wot_api_lib.clan_wars_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class GlobalWarClansRequest extends BaseWotRequest  {

	public GlobalWarClansRequest(final java.lang.String map_id) {
		this.map_id = map_id;
	}

	@Override
	public String getMethod(  ) { 
		return "wot/globalwar/clans/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (limit > 0) {
			params.put("limit",limit);
		}
if (map_id != null ) {
			params.put("map_id",map_id);
		}
if (page_no > 0) {
			params.put("page_no",page_no);
		}

	}

	public  void setLimit( long limit ) { 
		this.limit = limit;

	}

	public  void setPage_no( long page_no ) { 
		this.page_no = page_no;

	}

	private long limit;
	private java.lang.String map_id;
	private long page_no;
}

