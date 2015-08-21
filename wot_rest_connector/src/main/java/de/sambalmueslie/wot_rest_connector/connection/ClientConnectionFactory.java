package de.sambalmueslie.wot_rest_connector.connection;

import com.sun.jersey.api.client.Client;

/**
 * The factory for the client connection.
 *
 * @autor Sambalmueslie
 */
public final class ClientConnectionFactory {

	/** the {@link Client}. */
	private static Client client;

	/**
	 * @return a new {@link ClientConnection}.
	 */
	public static ClientConnection createClientConnection() {
		return new BaseClientConnection(getClient());
	}

	/**
	 * @return the {@link Client}.
	 */
	static Client getClient() {
		if (client == null) {
			client = Client.create();
		}
		return client;
	}

	/**
	 * Constructor.
	 */
	private ClientConnectionFactory() {
		// intentionally left empty
	}
}
