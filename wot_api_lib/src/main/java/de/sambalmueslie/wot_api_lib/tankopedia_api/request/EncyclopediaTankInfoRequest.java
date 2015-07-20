package de.sambalmueslie.wot_api_lib.tankopedia_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class EncyclopediaTankInfoRequest extends BaseWotRequest  {

	public EncyclopediaTankInfoRequest(final long tank_id) {
		this.tank_id = tank_id;
	}

	@Override
	public String getMethod(  ) { 
		return "wot/encyclopedia/tankinfo/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (tank_id > 0) {
			params.put("tank_id",tank_id);
		}

	}

	private long tank_id;
}

