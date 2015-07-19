package de.sambalmueslie.wot_api_lib.tankopedia_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class EncyclopediaTankGunsRequest extends BaseWotRequest  {

	public EncyclopediaTankGunsRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "encyclopedia/tankguns/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (module_id > 0) {
			params.put("module_id",module_id);
		}
if (nation != null ) {
			params.put("nation",nation);
		}
if (tank_id > 0) {
			params.put("tank_id",tank_id);
		}
if (turret_id > 0) {
			params.put("turret_id",turret_id);
		}

	}

	public  void setModule_id( long module_id ) { 
		this.module_id = module_id;

	}

	public  void setNation( String nation ) { 
		this.nation = nation;

	}

	public  void setTank_id( long tank_id ) { 
		this.tank_id = tank_id;

	}

	public  void setTurret_id( long turret_id ) { 
		this.turret_id = turret_id;

	}

	private long module_id;
	private java.lang.String nation;
	private long tank_id;
	private long turret_id;
}

