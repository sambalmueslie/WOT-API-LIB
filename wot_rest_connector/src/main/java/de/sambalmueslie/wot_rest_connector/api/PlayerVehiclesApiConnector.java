package de.sambalmueslie.wot_rest_connector.api;

import de.sambalmueslie.wot_api_lib.player_vehicles_api.request.PlayerVehiclesAchievementsRequest;
import de.sambalmueslie.wot_api_lib.player_vehicles_api.request.PlayerVehiclesStatsRequest;
import de.sambalmueslie.wot_api_lib.player_vehicles_api.response.PlayerVehiclesAchievementsResponse;
import de.sambalmueslie.wot_api_lib.player_vehicles_api.response.PlayerVehiclesStatsResponse;

/**
 * The {@link WotApiConnector} for the player vehicles api.
 *
 * @autor Sambalmueslie
 */
public interface PlayerVehiclesApiConnector extends WotApiConnector {
	/**
	 * Query a {@link PlayerVehiclesAchievementsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	PlayerVehiclesAchievementsResponse query(PlayerVehiclesAchievementsRequest request);

	/**
	 * Query a {@link PlayerVehiclesStatsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	PlayerVehiclesStatsResponse query(PlayerVehiclesStatsRequest request);
}
