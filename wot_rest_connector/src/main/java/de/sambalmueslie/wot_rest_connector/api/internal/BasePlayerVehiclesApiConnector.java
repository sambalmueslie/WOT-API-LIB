package de.sambalmueslie.wot_rest_connector.api.internal;

import de.sambalmueslie.wot_api_lib.player_vehicles_api.request.PlayerVehiclesAchievementsRequest;
import de.sambalmueslie.wot_api_lib.player_vehicles_api.request.PlayerVehiclesStatsRequest;
import de.sambalmueslie.wot_api_lib.player_vehicles_api.response.PlayerVehiclesAchievementsResponse;
import de.sambalmueslie.wot_api_lib.player_vehicles_api.response.PlayerVehiclesStatsResponse;
import de.sambalmueslie.wot_rest_connector.api.PlayerVehiclesApiConnector;
import de.sambalmueslie.wot_rest_connector.connection.ClientConnection;

public class BasePlayerVehiclesApiConnector extends BaseWotApiConnector implements PlayerVehiclesApiConnector {

	BasePlayerVehiclesApiConnector(final String applicationId, final ClientConnection connection) {
		super(applicationId, connection);
	}

	@Override
	public PlayerVehiclesAchievementsResponse query(final PlayerVehiclesAchievementsRequest request) {
		return query(request, PlayerVehiclesAchievementsResponse.class);
	}

	@Override
	public PlayerVehiclesStatsResponse query(final PlayerVehiclesStatsRequest request) {
		return query(request, PlayerVehiclesStatsResponse.class);
	}

}
