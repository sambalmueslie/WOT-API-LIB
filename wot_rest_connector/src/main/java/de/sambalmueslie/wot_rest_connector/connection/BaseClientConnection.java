package de.sambalmueslie.wot_rest_connector.connection;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import de.sambalmueslie.wot_api_lib.common.WotResponse;

class BaseClientConnection implements ClientConnection {

	private static Logger logger = LogManager.getLogger(BaseClientConnection.class);

	/**
	 * Constructor.
	 * 
	 * @param the
	 *            {@link #client}
	 */
	BaseClientConnection(final Client client) {
		this.client = client;
	}

	@Override
	public <T extends WotResponse> T getResponse(final String uri, final MultivaluedMap<String, String> queryParam, final Class<T> responseType) {
		final String output = getJson(uri, queryParam);
		if (logger.isDebugEnabled()) {
			logger.debug("get from " + uri + " = " + output);
		}
		if (output == null) return null;
		return parse(responseType, output);
	}

	String getJson(final String uri, final MultivaluedMap<String, String> queryParam) {
		try {
			final WebResource webResource = client.resource(uri);
			final WebResource accept = webResource.queryParams(queryParam);
			final ClientResponse response = accept.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			if (response.getStatus() != 200) return null;

			return response.getEntity(String.class);
		} catch (final Exception e) {
			logger.error("Cannot get from uri " + uri, e);
			return null;
		}
	}

	private <T extends WotResponse> T parse(final Class<T> responseType, final String output) {
		try {
			final Gson gson = new GsonBuilder().create();
			return gson.fromJson(output, responseType);
		} catch (final Exception e) {
			logger.error("Cannot process output " + output, e);
			return null;
		}
	}

	/** the {@link Client}. */
	private final Client client;

}
