package de.sambalmueslie.wot_rest_connector.api.internal;

import de.sambalmueslie.wot_api_lib.clan_ratings_api.request.*;
import de.sambalmueslie.wot_api_lib.clan_ratings_api.response.*;
import de.sambalmueslie.wot_rest_connector.api.ClanRatingsApiConnector;
import de.sambalmueslie.wot_rest_connector.connection.ClientConnection;

public class BaseClanRatingsApiConnector extends BaseWotApiConnector implements ClanRatingsApiConnector {

	BaseClanRatingsApiConnector(final String applicationId, final ClientConnection connection) {
		super(applicationId, connection);
	}

	@Override
	public ClanratingsClansResponse query(final ClanratingsClansRequest request) {
		return query(request, ClanratingsClansResponse.class);
	}

	@Override
	public ClanratingsDatesResponse query(final ClanratingsDatesRequest request) {
		return query(request, ClanratingsDatesResponse.class);
	}

	@Override
	public ClanratingsNeighborsResponse query(final ClanratingsNeighborsRequest request) {
		return query(request, ClanratingsNeighborsResponse.class);
	}

	@Override
	public ClanratingsTopResponse query(final ClanratingsTopRequest request) {
		return query(request, ClanratingsTopResponse.class);
	}

	@Override
	public ClanratingsTypesResponse query(final ClanratingsTypesRequest request) {
		return query(request, ClanratingsTypesResponse.class);
	}

}
