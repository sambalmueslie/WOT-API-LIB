package de.sambalmueslie.wot_api_lib.tankopedia_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class EncyclopediaTankTurretsRequest extends BaseWotRequest  {

	public EncyclopediaTankTurretsRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "encyclopedia/tankturrets/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (module_id > 0) {
			params.put("module_id",module_id);
		}
if (nation != null ) {
			params.put("nation",nation);
		}

	}

	public  void setModule_id( long module_id ) { 
		this.module_id = module_id;

	}

	public  void setNation( String nation ) { 
		this.nation = nation;

	}

	private long module_id;
	private java.lang.String nation;
}

