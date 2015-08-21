package de.sambalmueslie.wot_rest_connector.api;

import de.sambalmueslie.wot_api_lib.clan_ratings_api.request.*;
import de.sambalmueslie.wot_api_lib.clan_ratings_api.response.*;

/**
 * The {@link WotApiConnector} for the clan ratings api.
 *
 * @autor Sambalmueslie
 */
public interface ClanRatingsApiConnector extends WotApiConnector {

	/**
	 * Query a {@link ClanratingsTypesRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	ClanratingsClansResponse query(ClanratingsClansRequest request);

	/**
	 * Query a {@link ClanratingsTypesRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	ClanratingsDatesResponse query(ClanratingsDatesRequest request);

	/**
	 * Query a {@link ClanratingsNeighborsRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	ClanratingsNeighborsResponse query(ClanratingsNeighborsRequest request);

	/**
	 * Query a {@link ClanratingsTopRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	ClanratingsTopResponse query(ClanratingsTopRequest request);

	/**
	 * Query a {@link ClanratingsTypesRequest}.
	 *
	 * @param request
	 *            the request
	 * @return the response
	 */
	ClanratingsTypesResponse query(ClanratingsTypesRequest request);

}
