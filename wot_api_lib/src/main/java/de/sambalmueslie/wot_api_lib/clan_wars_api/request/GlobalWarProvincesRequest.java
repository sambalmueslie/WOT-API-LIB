package de.sambalmueslie.wot_api_lib.clan_wars_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class GlobalWarProvincesRequest extends BaseWotRequest  {

	public GlobalWarProvincesRequest(final java.lang.String map_id) {
		this.map_id = map_id;
	}

	@Override
	public String getMethod(  ) { 
		return "globalwar/provinces/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (map_id != null ) {
			params.put("map_id",map_id);
		}
if (province_id != null ) {
			params.put("province_id",province_id);
		}
if (region_id != null ) {
			params.put("region_id",region_id);
		}
if (status != null ) {
			params.put("status",status);
		}

	}

	public  void setProvince_id( String province_id ) { 
		this.province_id = province_id;

	}

	public  void setRegion_id( String region_id ) { 
		this.region_id = region_id;

	}

	public  void setStatus( String status ) { 
		this.status = status;

	}

	private java.lang.String map_id;
	private java.lang.String province_id;
	private java.lang.String region_id;
	private java.lang.String status;
}

