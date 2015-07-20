package de.sambalmueslie.wot_api_definition.clan_wars_api;

import java.time.LocalDateTime;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns information about the changes of clan's fame points.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/globalwar/clanpointshistory/")
public class GlobalWarAccountClanPointsHistoryRequestDefinition extends WotRequestDefinition {

	/** Clan ID. */
	@WotApiFieldDefinition(required = true, list = true)
	private long clan_id;
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
