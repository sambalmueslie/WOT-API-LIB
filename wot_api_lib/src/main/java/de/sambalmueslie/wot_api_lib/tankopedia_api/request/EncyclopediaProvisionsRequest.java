package de.sambalmueslie.wot_api_lib.tankopedia_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class EncyclopediaProvisionsRequest extends BaseWotRequest  {

	public EncyclopediaProvisionsRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "encyclopedia/achievements/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (provision_id > 0) {
			params.put("provision_id",provision_id);
		}

	}

	public  void setProvision_id( long provision_id ) { 
		this.provision_id = provision_id;

	}

	private long provision_id;
}

