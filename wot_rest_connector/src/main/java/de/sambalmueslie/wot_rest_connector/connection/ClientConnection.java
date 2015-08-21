package de.sambalmueslie.wot_rest_connector.connection;

import javax.ws.rs.core.MultivaluedMap;

import de.sambalmueslie.wot_api_lib.common.WotResponse;

/**
 * The client connection.
 * 
 * @autor Sambalmueslie
 */
public interface ClientConnection {

	/**
	 * Get the response.
	 *
	 * @param uri
	 *            the uri
	 * @param queryParam
	 *            the query param
	 * @param responseType
	 *            the response type
	 * @return the response
	 */
	<T extends WotResponse> T getResponse(final String uri, final MultivaluedMap<String, String> queryParam, final Class<T> responseType);
}
