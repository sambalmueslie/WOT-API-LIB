package de.sambalmueslie.wot_rest_connector.api.internal;

import de.sambalmueslie.wot_api_lib.strongholds_api.request.StrongholdAccountStatsRequest;
import de.sambalmueslie.wot_api_lib.strongholds_api.request.StrongholdBuildingRequest;
import de.sambalmueslie.wot_api_lib.strongholds_api.request.StrongholdInfoRequest;
import de.sambalmueslie.wot_api_lib.strongholds_api.response.StrongholdAccountStatsResponse;
import de.sambalmueslie.wot_api_lib.strongholds_api.response.StrongholdBuildingResponse;
import de.sambalmueslie.wot_api_lib.strongholds_api.response.StrongholdInfoResponse;
import de.sambalmueslie.wot_rest_connector.api.StrongholdsApiConnector;
import de.sambalmueslie.wot_rest_connector.connection.ClientConnection;

public class BaseStrongholdsApiConnector extends BaseWotApiConnector implements StrongholdsApiConnector {

	BaseStrongholdsApiConnector(final String applicationId, final ClientConnection connection) {
		super(applicationId, connection);
	}

	@Override
	public StrongholdAccountStatsResponse query(final StrongholdAccountStatsRequest request) {
		return query(request, StrongholdAccountStatsResponse.class);
	}

	@Override
	public StrongholdBuildingResponse query(final StrongholdBuildingRequest request) {
		return query(request, StrongholdBuildingResponse.class);
	}

	@Override
	public StrongholdInfoResponse query(final StrongholdInfoRequest request) {
		return query(request, StrongholdInfoResponse.class);
	}

}
