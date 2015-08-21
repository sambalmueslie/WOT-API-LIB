package de.sambalmueslie.wot_rest_connector.api;

import de.sambalmueslie.wot_api_lib.player_ratings_api.request.*;
import de.sambalmueslie.wot_api_lib.player_ratings_api.response.*;

/**
 * The {@link WotApiConnector} for the player ratings api.
 *
 * @autor Sambalmueslie
 */
public interface PlayerRatingsApiConnector extends WotApiConnector {

	/**
	 * Query a {@link PlayerRatingsAccountsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	PlayerRatingsAccountsResponse query(PlayerRatingsAccountsRequest request);

	/**
	 * Query a {@link PlayerRatingsDatesRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	PlayerRatingsDatesResponse query(PlayerRatingsDatesRequest request);

	/**
	 * Query a {@link PlayerRatingsNeighborsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	PlayerRatingsNeighborsResponse query(PlayerRatingsNeighborsRequest request);

	/**
	 * Query a {@link PlayerRatingsTopRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	PlayerRatingsTopResponse query(PlayerRatingsTopRequest request);

	/**
	 * Query a {@link PlayerRatingsTypesRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	PlayerRatingsTypesResponse query(PlayerRatingsTypesRequest request);

}
