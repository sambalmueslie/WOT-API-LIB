package de.sambalmueslie.wot_api_definition.clan_wars_api;

import java.time.LocalDateTime;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns information about player's fame points.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/globalwar/accountpointshistory/")
public class GlobalWarAccountPointsHistoryRequestDefinition extends WotRequestDefinition {

	/** Access token is used to access personal user data. The token is obtained via authentication and has expiration time. */
	@WotApiFieldDefinition(required = true)
	private String access_token;

	/**
	 * Number of returned entries (fewer can be returned, but not more than 100). If the limit sent exceeds 100, an limit of 100 is applied
	 * (by default).
	 */
	@WotApiFieldDefinition
	private long limit;

	/** Global Map ID. */
	@WotApiFieldDefinition(required = true)
	private String map_id;
	/** Result page number. */
	@WotApiFieldDefinition
	private long page_no;
	/** Stage start time. */
	@WotApiFieldDefinition
	private LocalDateTime since;
	/** Stage end time. */
	@WotApiFieldDefinition
	private LocalDateTime until;
}
