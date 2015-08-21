package de.sambalmueslie.wot_rest_connector.api.internal;

import de.sambalmueslie.wot_rest_connector.api.*;
import de.sambalmueslie.wot_rest_connector.connection.ClientConnection;
import de.sambalmueslie.wot_rest_connector.connection.ClientConnectionFactory;

/**
 * The factory for the {@link WotApiConnector}s.
 *
 * @autor Sambalmueslie
 */
public final class WotApiConnectorFactory {

	/**
	 * Get the {@link AccountApiConnector}.
	 *
	 * @param applicationId
	 *            the application id
	 * @return the connector
	 */
	public static AccountApiConnector getAccountApiConnector(final String applicationId) {
		final ClientConnection connection = ClientConnectionFactory.createClientConnection();
		return new BaseAccountApiConnector(applicationId, connection);
	}

	/**
	 * Get the {@link ClanRatingsApiConnector}.
	 *
	 * @param applicationId
	 *            the application id
	 * @return the connector
	 */
	public static ClanRatingsApiConnector getClanRatingsApiConnector(final String applicationId) {
		final ClientConnection connection = ClientConnectionFactory.createClientConnection();
		return new BaseClanRatingsApiConnector(applicationId, connection);
	}

	/**
	 * Get the {@link ClansApiConnector}.
	 *
	 * @param applicationId
	 *            the application id
	 * @return the connector
	 */
	public static ClansApiConnector getClansApiConnector(final String applicationId) {
		final ClientConnection connection = ClientConnectionFactory.createClientConnection();
		return new BaseClansApiConnector(applicationId, connection);
	}

	/**
	 * Get the {@link PermanentTeamsApiConnector}.
	 *
	 * @param applicationId
	 *            the application id
	 * @return the connector
	 */
	public static PermanentTeamsApiConnector getPermanentTeamsApiConnector(final String applicationId) {
		final ClientConnection connection = ClientConnectionFactory.createClientConnection();
		return new BasePermanentTeamsApiConnector(applicationId, connection);
	}

	/**
	 * Get the {@link PlayerRatingsApiConnector}.
	 *
	 * @param applicationId
	 *            the application id
	 * @return the connector
	 */
	public static PlayerRatingsApiConnector getPlayerRatingsApiConnector(final String applicationId) {
		final ClientConnection connection = ClientConnectionFactory.createClientConnection();
		return new BasePlayerRatingsApiConnector(applicationId, connection);
	}

	/**
	 * Get the {@link PlayerVehiclesApiConnector}.
	 *
	 * @param applicationId
	 *            the application id
	 * @return the connector
	 */
	public static PlayerVehiclesApiConnector getPlayerVehiclesApiConnector(final String applicationId) {
		final ClientConnection connection = ClientConnectionFactory.createClientConnection();
		return new BasePlayerVehiclesApiConnector(applicationId, connection);
	}

	/**
	 * Get the {@link StrongholdsApiConnector}.
	 *
	 * @param applicationId
	 *            the application id
	 * @return the connector
	 */
	public static StrongholdsApiConnector getStrongholdsApiConnector(final String applicationId) {
		final ClientConnection connection = ClientConnectionFactory.createClientConnection();
		return new BaseStrongholdsApiConnector(applicationId, connection);
	}

	/**
	 * Get the {@link TankopediaApiConnector}.
	 *
	 * @param applicationId
	 *            the application id
	 * @return the connector
	 */
	public static TankopediaApiConnector getTankopediaApiConnector(final String applicationId) {
		final ClientConnection connection = ClientConnectionFactory.createClientConnection();
		return new BaseTankopediaApiConnector(applicationId, connection);
	}

	private WotApiConnectorFactory() {
		// intentionally left empty
	}
}
