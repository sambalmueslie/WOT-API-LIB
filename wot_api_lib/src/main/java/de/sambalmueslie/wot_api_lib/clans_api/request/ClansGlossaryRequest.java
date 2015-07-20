package de.sambalmueslie.wot_api_lib.clans_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class ClansGlossaryRequest extends BaseWotRequest  {

	public ClansGlossaryRequest() {
	}

	@Override
	public String getMethod(  ) { 
		return "wgn/clans/glossary/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		
	}

}

