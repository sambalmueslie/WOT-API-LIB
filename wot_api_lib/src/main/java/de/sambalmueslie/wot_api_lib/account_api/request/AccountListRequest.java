package de.sambalmueslie.wot_api_lib.account_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.lang.Object;
import java.util.Map;

public class AccountListRequest extends BaseWotRequest  {

public AccountListRequest(final java.lang.String search) {
this.search = search;
}@Override
public String getMethod(  ) { 
	return "account/list/";
}

@Override
public  void getParameter( Map<String, Object> params ) { 
	if (limit > 0) {
	 params.put("limit",limit);
}
if (search != null ) {
	 params.put("search",search);
}
if (type != null ) {
	 params.put("type",type);
}

}

public  void setLimit( long limit ) { 
	this.limit = limit;

}

public  void setType( String type ) { 
	this.type = type;

}

private long limit;
private java.lang.String search;
private java.lang.String type;
}

