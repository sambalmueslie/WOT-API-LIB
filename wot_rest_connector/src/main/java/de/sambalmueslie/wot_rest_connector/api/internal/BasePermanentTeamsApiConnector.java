package de.sambalmueslie.wot_rest_connector.api.internal;

import de.sambalmueslie.wot_api_lib.permanent_teams_api.request.RegularTeamsInfoRequest;
import de.sambalmueslie.wot_api_lib.permanent_teams_api.request.RegularTeamsListRequest;
import de.sambalmueslie.wot_api_lib.permanent_teams_api.response.RegularTeamsInfoResponse;
import de.sambalmueslie.wot_api_lib.permanent_teams_api.response.RegularTeamsListResponse;
import de.sambalmueslie.wot_rest_connector.api.PermanentTeamsApiConnector;
import de.sambalmueslie.wot_rest_connector.connection.ClientConnection;

public class BasePermanentTeamsApiConnector extends BaseWotApiConnector implements PermanentTeamsApiConnector {

	BasePermanentTeamsApiConnector(final String applicationId, final ClientConnection connection) {
		super(applicationId, connection);
	}

	@Override
	public RegularTeamsInfoResponse query(final RegularTeamsInfoRequest request) {
		return query(request, RegularTeamsInfoResponse.class);
	}

	@Override
	public RegularTeamsListResponse query(final RegularTeamsListRequest request) {
		return query(request, RegularTeamsListResponse.class);
	}

}
