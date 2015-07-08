package de.sambalmueslie.wot_api_lib.account_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.lang.Object;
import java.util.Map;

public class AccountTanksRequest extends BaseWotRequest  {

	public AccountTanksRequest(final long account_id) {
		this.account_id = account_id;
	}

	@Override
	public String getMethod(  ) { 
		return "account/tanks/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (access_token != null ) {
			params.put("access_token",access_token);
		}
if (account_id > 0) {
			params.put("account_id",account_id);
		}
if (tank_id > 0) {
			params.put("tank_id",tank_id);
		}

	}

	public  void setAccess_token( String access_token ) { 
		this.access_token = access_token;

	}

	public  void setTank_id( long tank_id ) { 
		this.tank_id = tank_id;

	}

	private java.lang.String access_token;
	private long account_id;
	private long tank_id;
}

