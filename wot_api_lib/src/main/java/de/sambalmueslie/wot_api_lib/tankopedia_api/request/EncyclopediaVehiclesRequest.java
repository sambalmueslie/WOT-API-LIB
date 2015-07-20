package de.sambalmueslie.wot_api_lib.tankopedia_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class EncyclopediaVehiclesRequest extends BaseWotRequest  {

	public EncyclopediaVehiclesRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "wot/encyclopedia/tanks/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (nation != null ) {
			params.put("nation",nation);
		}
if (tank_id > 0) {
			params.put("tank_id",tank_id);
		}
if (tier > 0) {
			params.put("tier",tier);
		}

	}

	public  void setNation( String nation ) { 
		this.nation = nation;

	}

	public  void setTank_id( long tank_id ) { 
		this.tank_id = tank_id;

	}

	public  void setTier( long tier ) { 
		this.tier = tier;

	}

	private java.lang.String nation;
	private long tank_id;
	private long tier;
}

