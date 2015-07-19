package de.sambalmueslie.wot_api_lib.clans_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class ClansMembersInfoRequest extends BaseWotRequest  {

	public ClansMembersInfoRequest(final long account_id) {
		this.account_id = account_id;
	}

	@Override
	public String getMethod(  ) { 
		return "clans/membersinfo/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (account_id > 0) {
			params.put("account_id",account_id);
		}

	}

	private long account_id;
}

