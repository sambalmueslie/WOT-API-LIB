package de.sambalmueslie.wot_rest_connector;

import de.sambalmueslie.wot_rest_connector.api.*;
import de.sambalmueslie.wot_rest_connector.api.internal.WotApiConnectorFactory;

/**
 * The wot client application.
 */
public class WotRestConnector {

	/**
	 * Constructor.
	 *
	 * @param applicationId
	 *            {@link #applicationId}
	 */
	public WotRestConnector(final String applicationId) {
		this.applicationId = applicationId;
		setup();
	}

	/**
	 * @return the {@link AccountApiConnector}.
	 */
	public AccountApiConnector getAccountApiConnector() {
		return accountApiConnector;
	}

	/**
	 * @return the {@link ClanRatingsApiConnector}.
	 */
	public ClanRatingsApiConnector getClanRatingsApiConnector() {
		return clanRatingsApiConnector;
	}

	/**
	 * @return the {@link ClansApiConnector}.
	 */
	public ClansApiConnector getClansApiConnector() {
		return clansApiConnector;
	}

	/**
	 * @return the {@link PermanentTeamsApiConnector}.
	 */
	public PermanentTeamsApiConnector getPermanentTeamsApiConnector() {
		return permanentTeamsApiConnector;
	}

	/**
	 * @return the {@link PlayerRatingsApiConnector}.
	 */
	public PlayerRatingsApiConnector getPlayerRatingsApiConnector() {
		return playerRatingsApiConnector;
	}

	/**
	 * @return the {@link PlayerVehiclesApiConnector}.
	 */
	public PlayerVehiclesApiConnector getPlayerVehiclesApiConnector() {
		return playerVehiclesApiConnector;
	}

	/**
	 * @return the {@link StrongholdsApiConnector}.
	 */
	public StrongholdsApiConnector getStrongholdsApiConnector() {
		return strongholdsApiConnector;
	}

	/**
	 * @return the {@link TankopediaApiConnector}.
	 */
	public TankopediaApiConnector getTankopediaApiConnector() {
		return tankopediaApiConnector;
	}

	/**
	 * Setup.
	 */
	private void setup() {
		accountApiConnector = WotApiConnectorFactory.getAccountApiConnector(applicationId);
		clanRatingsApiConnector = WotApiConnectorFactory.getClanRatingsApiConnector(applicationId);
		clansApiConnector = WotApiConnectorFactory.getClansApiConnector(applicationId);
		permanentTeamsApiConnector = WotApiConnectorFactory.getPermanentTeamsApiConnector(applicationId);
		playerRatingsApiConnector = WotApiConnectorFactory.getPlayerRatingsApiConnector(applicationId);
		playerVehiclesApiConnector = WotApiConnectorFactory.getPlayerVehiclesApiConnector(applicationId);
		strongholdsApiConnector = WotApiConnectorFactory.getStrongholdsApiConnector(applicationId);
		tankopediaApiConnector = WotApiConnectorFactory.getTankopediaApiConnector(applicationId);
	}

	/** the {@link AccountApiConnector}. */
	private AccountApiConnector accountApiConnector;

	/** the application id. */
	private final String applicationId;

	/** the {@link ClanRatingsApiConnector}. */
	private ClanRatingsApiConnector clanRatingsApiConnector;

	/** the {@link ClansApiConnector}. */
	private ClansApiConnector clansApiConnector;
	/** the {@link PermanentTeamsApiConnector}. */
	private PermanentTeamsApiConnector permanentTeamsApiConnector;
	/** the {@link PlayerRatingsApiConnector}. */
	private PlayerRatingsApiConnector playerRatingsApiConnector;
	/** the {@link PlayerVehiclesApiConnector}. */
	private PlayerVehiclesApiConnector playerVehiclesApiConnector;
	/** the {@link StrongholdsApiConnector}. */
	private StrongholdsApiConnector strongholdsApiConnector;
	/** the {@link TankopediaApiConnector}. */
	private TankopediaApiConnector tankopediaApiConnector;

}
