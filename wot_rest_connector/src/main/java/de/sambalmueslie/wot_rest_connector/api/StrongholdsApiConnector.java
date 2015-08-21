package de.sambalmueslie.wot_rest_connector.api;

import de.sambalmueslie.wot_api_lib.strongholds_api.request.StrongholdAccountStatsRequest;
import de.sambalmueslie.wot_api_lib.strongholds_api.request.StrongholdBuildingRequest;
import de.sambalmueslie.wot_api_lib.strongholds_api.request.StrongholdInfoRequest;
import de.sambalmueslie.wot_api_lib.strongholds_api.response.StrongholdAccountStatsResponse;
import de.sambalmueslie.wot_api_lib.strongholds_api.response.StrongholdBuildingResponse;
import de.sambalmueslie.wot_api_lib.strongholds_api.response.StrongholdInfoResponse;

/**
 * The {@link WotApiConnector} for the strongholds api.
 *
 * @autor Sambalmueslie
 */
public interface StrongholdsApiConnector extends WotApiConnector {
	/**
	 * Query a {@link StrongholdAccountStatsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	StrongholdAccountStatsResponse query(StrongholdAccountStatsRequest request);

	/**
	 * Query a {@link StrongholdBuildingRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	StrongholdBuildingResponse query(StrongholdBuildingRequest request);

	/**
	 * Query a {@link StrongholdInfoRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	StrongholdInfoResponse query(StrongholdInfoRequest request);
}
