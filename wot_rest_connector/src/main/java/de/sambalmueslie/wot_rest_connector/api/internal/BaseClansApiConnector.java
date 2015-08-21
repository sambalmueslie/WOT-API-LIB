package de.sambalmueslie.wot_rest_connector.api.internal;

import de.sambalmueslie.wot_api_lib.clans_api.request.ClansGlossaryRequest;
import de.sambalmueslie.wot_api_lib.clans_api.request.ClansInfoRequest;
import de.sambalmueslie.wot_api_lib.clans_api.request.ClansListRequest;
import de.sambalmueslie.wot_api_lib.clans_api.request.ClansMembersInfoRequest;
import de.sambalmueslie.wot_api_lib.clans_api.response.ClansGlossaryResponse;
import de.sambalmueslie.wot_api_lib.clans_api.response.ClansInfoResponse;
import de.sambalmueslie.wot_api_lib.clans_api.response.ClansListResponse;
import de.sambalmueslie.wot_api_lib.clans_api.response.ClansMembersInfoResponse;
import de.sambalmueslie.wot_rest_connector.api.ClansApiConnector;
import de.sambalmueslie.wot_rest_connector.connection.ClientConnection;

public class BaseClansApiConnector extends BaseWotApiConnector implements ClansApiConnector {

	BaseClansApiConnector(final String applicationId, final ClientConnection connection) {
		super(applicationId, connection);
	}

	@Override
	public ClansGlossaryResponse query(final ClansGlossaryRequest request) {
		return query(request, ClansGlossaryResponse.class);
	}

	@Override
	public ClansInfoResponse query(final ClansInfoRequest request) {
		return query(request, ClansInfoResponse.class);
	}

	@Override
	public ClansListResponse query(final ClansListRequest request) {
		return query(request, ClansListResponse.class);
	}

	@Override
	public ClansMembersInfoResponse query(final ClansMembersInfoRequest request) {
		return query(request, ClansMembersInfoResponse.class);
	}

}
