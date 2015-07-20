package de.sambalmueslie.wot_api_lib.tankopedia_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class EncyclopediaVehicleProfileRequest extends BaseWotRequest  {

	public EncyclopediaVehicleProfileRequest(final long tank_id) {
		this.tank_id = tank_id;
	}

	@Override
	public String getMethod(  ) { 
		return "wot/encyclopedia/vehicleprofile/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (engine_id > 0) {
			params.put("engine_id",engine_id);
		}
if (gun_id > 0) {
			params.put("gun_id",gun_id);
		}
if (radio_id > 0) {
			params.put("radio_id",radio_id);
		}
if (suspension_id > 0) {
			params.put("suspension_id",suspension_id);
		}
if (tank_id > 0) {
			params.put("tank_id",tank_id);
		}
if (turret_id > 0) {
			params.put("turret_id",turret_id);
		}

	}

	public  void setEngine_id( long engine_id ) { 
		this.engine_id = engine_id;

	}

	public  void setGun_id( long gun_id ) { 
		this.gun_id = gun_id;

	}

	public  void setRadio_id( long radio_id ) { 
		this.radio_id = radio_id;

	}

	public  void setSuspension_id( long suspension_id ) { 
		this.suspension_id = suspension_id;

	}

	public  void setTurret_id( long turret_id ) { 
		this.turret_id = turret_id;

	}

	private long engine_id;
	private long gun_id;
	private long radio_id;
	private long suspension_id;
	private long tank_id;
	private long turret_id;
}

