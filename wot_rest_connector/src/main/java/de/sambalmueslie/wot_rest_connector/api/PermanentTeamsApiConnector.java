package de.sambalmueslie.wot_rest_connector.api;

import de.sambalmueslie.wot_api_lib.permanent_teams_api.request.RegularTeamsInfoRequest;
import de.sambalmueslie.wot_api_lib.permanent_teams_api.request.RegularTeamsListRequest;
import de.sambalmueslie.wot_api_lib.permanent_teams_api.response.RegularTeamsInfoResponse;
import de.sambalmueslie.wot_api_lib.permanent_teams_api.response.RegularTeamsListResponse;

/**
 * The {@link WotApiConnector} for the permanent teams api.
 *
 * @autor Sambalmueslie
 */
public interface PermanentTeamsApiConnector extends WotApiConnector {

	/**
	 * Query a {@link RegularTeamsInfoRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	RegularTeamsInfoResponse query(RegularTeamsInfoRequest request);

	/**
	 * Query a {@link RegularTeamsListRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	RegularTeamsListResponse query(RegularTeamsListRequest request);
}
