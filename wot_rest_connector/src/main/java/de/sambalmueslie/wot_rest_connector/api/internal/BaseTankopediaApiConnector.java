package de.sambalmueslie.wot_rest_connector.api.internal;

import de.sambalmueslie.wot_api_lib.tankopedia_api.request.*;
import de.sambalmueslie.wot_api_lib.tankopedia_api.response.*;
import de.sambalmueslie.wot_rest_connector.api.TankopediaApiConnector;
import de.sambalmueslie.wot_rest_connector.connection.ClientConnection;

public class BaseTankopediaApiConnector extends BaseWotApiConnector implements TankopediaApiConnector {

	BaseTankopediaApiConnector(final String applicationId, final ClientConnection connection) {
		super(applicationId, connection);
	}

	@Override
	public EncyclopediaAchievementsResponse query(final EncyclopediaAchievementsRequest request) {
		return query(request, EncyclopediaAchievementsResponse.class);
	}

	@Override
	public EncyclopediaInfoResponse query(final EncyclopediaInfoRequest request) {
		return query(request, EncyclopediaInfoResponse.class);
	}

	@Override
	public EncyclopediaMapsResponse query(final EncyclopediaMapsRequest request) {
		return query(request, EncyclopediaMapsResponse.class);
	}

	@Override
	public EncyclopediaPersonalMissionsResponse query(final EncyclopediaPersonalMissionsRequest request) {
		return query(request, EncyclopediaPersonalMissionsResponse.class);
	}

	@Override
	public EncyclopediaProvisionsResponse query(final EncyclopediaProvisionsRequest request) {
		return query(request, EncyclopediaProvisionsResponse.class);
	}

	@Override
	public EncyclopediaTankChassisResponse query(final EncyclopediaTankChassisRequest request) {
		return query(request, EncyclopediaTankChassisResponse.class);
	}

	@Override
	public EncyclopediaTankEnginesResponse query(final EncyclopediaTankEnginesRequest request) {
		return query(request, EncyclopediaTankEnginesResponse.class);
	}

	@Override
	public EncyclopediaTankGunsResponse query(final EncyclopediaTankGunsRequest request) {
		return query(request, EncyclopediaTankGunsResponse.class);
	}

	@Override
	public EncyclopediaTankInfoResponse query(final EncyclopediaTankInfoRequest request) {
		return query(request, EncyclopediaTankInfoResponse.class);
	}

	@Override
	public EncyclopediaTankRadiosResponse query(final EncyclopediaTankRadiosRequest request) {
		return query(request, EncyclopediaTankRadiosResponse.class);
	}

	@Override
	public EncyclopediaTanksResponse query(final EncyclopediaTanksRequest request) {
		return query(request, EncyclopediaTanksResponse.class);
	}

	@Override
	public EncyclopediaTankTurretsResponse query(final EncyclopediaTankTurretsRequest request) {
		return query(request, EncyclopediaTankTurretsResponse.class);
	}

	@Override
	public EncyclopediaVehicleProfileResponse query(final EncyclopediaVehicleProfileRequest request) {
		return query(request, EncyclopediaVehicleProfileResponse.class);
	}

	@Override
	public EncyclopediaVehiclesResponse query(final EncyclopediaVehiclesRequest request) {
		return query(request, EncyclopediaVehiclesResponse.class);
	}

}
