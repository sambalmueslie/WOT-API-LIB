package de.sambalmueslie.wot_api_lib.permanent_teams_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class RegularTeamsListRequest extends BaseWotRequest  {

	public RegularTeamsListRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "wot/regularteams/list/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (limit > 0) {
			params.put("limit",limit);
		}
if (order_by != null ) {
			params.put("order_by",order_by);
		}
if (page_no > 0) {
			params.put("page_no",page_no);
		}
if (search != null ) {
			params.put("search",search);
		}

	}

	public  void setLimit( long limit ) { 
		this.limit = limit;

	}

	public  void setOrder_by( String order_by ) { 
		this.order_by = order_by;

	}

	public  void setPage_no( long page_no ) { 
		this.page_no = page_no;

	}

	public  void setSearch( String search ) { 
		this.search = search;

	}

	private long limit;
	private java.lang.String order_by;
	private long page_no;
	private java.lang.String search;
}

