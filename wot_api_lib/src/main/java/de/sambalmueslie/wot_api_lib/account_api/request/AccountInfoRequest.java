package de.sambalmueslie.wot_api_lib.account_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class AccountInfoRequest extends BaseWotRequest  {

	public AccountInfoRequest(final long account_id) {
		this.account_id = account_id;
	}

	@Override
	public String getMethod(  ) { 
		return "wot/account/info/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (access_token != null ) {
			params.put("access_token",access_token);
		}
if (account_id > 0) {
			params.put("account_id",account_id);
		}
if (extra != null ) {
			params.put("extra",extra);
		}

	}

	public  void setAccess_token( String access_token ) { 
		this.access_token = access_token;

	}

	public  void setExtra( String extra ) { 
		this.extra = extra;

	}

	private java.lang.String access_token;
	private long account_id;
	private java.lang.String extra;
}

