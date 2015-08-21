package de.sambalmueslie.wot_rest_connector.api.internal;

import de.sambalmueslie.wot_api_lib.player_ratings_api.request.*;
import de.sambalmueslie.wot_api_lib.player_ratings_api.response.*;
import de.sambalmueslie.wot_rest_connector.api.PlayerRatingsApiConnector;
import de.sambalmueslie.wot_rest_connector.connection.ClientConnection;

public class BasePlayerRatingsApiConnector extends BaseWotApiConnector implements PlayerRatingsApiConnector {

	BasePlayerRatingsApiConnector(final String applicationId, final ClientConnection connection) {
		super(applicationId, connection);
	}

	@Override
	public PlayerRatingsAccountsResponse query(final PlayerRatingsAccountsRequest request) {
		return query(request, PlayerRatingsAccountsResponse.class);
	}

	@Override
	public PlayerRatingsDatesResponse query(final PlayerRatingsDatesRequest request) {
		return query(request, PlayerRatingsDatesResponse.class);
	}

	@Override
	public PlayerRatingsNeighborsResponse query(final PlayerRatingsNeighborsRequest request) {
		return query(request, PlayerRatingsNeighborsResponse.class);
	}

	@Override
	public PlayerRatingsTopResponse query(final PlayerRatingsTopRequest request) {
		return query(request, PlayerRatingsTopResponse.class);
	}

	@Override
	public PlayerRatingsTypesResponse query(final PlayerRatingsTypesRequest request) {
		return query(request, PlayerRatingsTypesResponse.class);
	}

}
