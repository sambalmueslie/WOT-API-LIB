package de.sambalmueslie.wot_api_lib.player_vehicles_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class PlayerVehiclesAchievementsRequest extends BaseWotRequest  {

	public PlayerVehiclesAchievementsRequest(final long account_id) {
		this.account_id = account_id;
	}

	@Override
	public String getMethod(  ) { 
		return "tanks/achievements/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (aaccess_token != null ) {
			params.put("aaccess_token",aaccess_token);
		}
if (account_id > 0) {
			params.put("account_id",account_id);
		}
if (in_garage != null ) {
			params.put("in_garage",in_garage);
		}
if (tank_id > 0) {
			params.put("tank_id",tank_id);
		}

	}

	public  void setAaccess_token( String aaccess_token ) { 
		this.aaccess_token = aaccess_token;

	}

	public  void setIn_garage( String in_garage ) { 
		this.in_garage = in_garage;

	}

	public  void setTank_id( long tank_id ) { 
		this.tank_id = tank_id;

	}

	private java.lang.String aaccess_token;
	private long account_id;
	private java.lang.String in_garage;
	private long tank_id;
}

