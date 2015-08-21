package de.sambalmueslie.wot_rest_connector.api;

import de.sambalmueslie.wot_api_lib.clans_api.request.ClansGlossaryRequest;
import de.sambalmueslie.wot_api_lib.clans_api.request.ClansInfoRequest;
import de.sambalmueslie.wot_api_lib.clans_api.request.ClansListRequest;
import de.sambalmueslie.wot_api_lib.clans_api.request.ClansMembersInfoRequest;
import de.sambalmueslie.wot_api_lib.clans_api.response.ClansGlossaryResponse;
import de.sambalmueslie.wot_api_lib.clans_api.response.ClansInfoResponse;
import de.sambalmueslie.wot_api_lib.clans_api.response.ClansListResponse;
import de.sambalmueslie.wot_api_lib.clans_api.response.ClansMembersInfoResponse;

/**
 * The {@link WotApiConnector} for the clans api.
 *
 * @autor Sambalmueslie
 */
public interface ClansApiConnector extends WotApiConnector {

	/**
	 * Query a {@link ClansGlossaryRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	ClansGlossaryResponse query(ClansGlossaryRequest request);

	/**
	 * Query a {@link ClansInfoRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	ClansInfoResponse query(ClansInfoRequest request);

	/**
	 * Query a {@link ClansListRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	ClansListResponse query(ClansListRequest request);

	/**
	 * Query a {@link ClansMembersInfoRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	ClansMembersInfoResponse query(ClansMembersInfoRequest request);
}
