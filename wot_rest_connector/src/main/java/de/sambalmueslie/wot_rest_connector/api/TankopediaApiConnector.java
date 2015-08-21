package de.sambalmueslie.wot_rest_connector.api;

import de.sambalmueslie.wot_api_lib.tankopedia_api.request.*;
import de.sambalmueslie.wot_api_lib.tankopedia_api.response.*;

/**
 * The {@link WotApiConnector} for the tankopedia api.
 *
 * @autor Sambalmueslie
 */
public interface TankopediaApiConnector extends WotApiConnector {

	/**
	 * Query a {@link EncyclopediaAchievementsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaAchievementsResponse query(EncyclopediaAchievementsRequest request);

	/**
	 * Query a {@link EncyclopediaInfoRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaInfoResponse query(EncyclopediaInfoRequest request);

	/**
	 * Query a {@link EncyclopediaMapsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaMapsResponse query(EncyclopediaMapsRequest request);

	/**
	 * Query a {@link EncyclopediaPersonalMissionsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaPersonalMissionsResponse query(EncyclopediaPersonalMissionsRequest request);

	/**
	 * Query a {@link EncyclopediaProvisionsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaProvisionsResponse query(EncyclopediaProvisionsRequest request);

	/**
	 * Query a {@link EncyclopediaTankChassisRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaTankChassisResponse query(EncyclopediaTankChassisRequest request);

	/**
	 * Query a {@link EncyclopediaTankEnginesRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaTankEnginesResponse query(EncyclopediaTankEnginesRequest request);

	/**
	 * Query a {@link EncyclopediaTankGunsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaTankGunsResponse query(EncyclopediaTankGunsRequest request);

	/**
	 * Query a {@link EncyclopediaTankInfoRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaTankInfoResponse query(EncyclopediaTankInfoRequest request);

	/**
	 * Query a {@link EncyclopediaTankRadiosRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaTankRadiosResponse query(EncyclopediaTankRadiosRequest request);

	/**
	 * Query a {@link EncyclopediaTanksRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaTanksResponse query(EncyclopediaTanksRequest request);

	/**
	 * Query a {@link EncyclopediaTankTurretsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaTankTurretsResponse query(EncyclopediaTankTurretsRequest request);

	/**
	 * Query a {@link EncyclopediaVehicleProfileRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaVehicleProfileResponse query(EncyclopediaVehicleProfileRequest request);

	/**
	 * Query a {@link EncyclopediaVehiclesRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	EncyclopediaVehiclesResponse query(EncyclopediaVehiclesRequest request);
}
