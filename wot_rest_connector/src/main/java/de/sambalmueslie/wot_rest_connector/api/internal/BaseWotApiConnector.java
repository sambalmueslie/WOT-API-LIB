package de.sambalmueslie.wot_rest_connector.api.internal;

import com.sun.jersey.api.representation.Form;

import de.sambalmueslie.wot_api_lib.common.WotRequest;
import de.sambalmueslie.wot_api_lib.common.WotResponse;
import de.sambalmueslie.wot_rest_connector.api.WotApiConnector;
import de.sambalmueslie.wot_rest_connector.connection.ClientConnection;

/**
 * The base wot api connector.
 *
 * @autor Sambalmueslie
 */
public class BaseWotApiConnector implements WotApiConnector {
	/** the wot base uri. */
	private static final String WOT_BASE_URI = "http://api.worldoftanks.eu/";

	/**
	 * Constructor.
	 *
	 * @param applicationId
	 *            {@link #applicationId}
	 * @param connection
	 *            {@link #connection}
	 */
	protected BaseWotApiConnector(final String applicationId, final ClientConnection connection) {
		this.applicationId = applicationId;
		this.connection = connection;
	}

	/**
	 * Query.
	 *
	 * @param request
	 *            the {@link WotRequest}
	 * @param responseType
	 *            the response type
	 * @return the response
	 * @param <T>
	 *            the response type
	 * @param <S>
	 *            the request type
	 */
	protected <T extends WotResponse, S extends WotRequest> T query(final WotRequest request, final Class<T> responseType) {
		final String uri = WOT_BASE_URI + request.getMethod();
		final Form queryParam = createQueryForm(request);
		return connection.getResponse(uri, queryParam, responseType);
	}

	/**
	 * Create the query {@link Form}.
	 *
	 * @param request
	 *            the {@link WotRequest}
	 * @return the form
	 */
	private Form createQueryForm(final WotRequest request) {
		final Form queryParam = new Form();
		queryParam.add("application_id", applicationId);
		request.getParameter().entrySet().forEach(p -> queryParam.add(p.getKey(), p.getValue()));
		return queryParam;
	}

	/** the application id. */
	private final String applicationId;

	/** the {@link ClientConnection}. */
	private final ClientConnection connection;

}
