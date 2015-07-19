package de.sambalmueslie.wot_api_definition.tankopedia_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns details on Personal Missions on the basis of specified campaign IDs, operation IDs, mission branch and tag IDs.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "encyclopedia/personalmissions/")
public class EncyclopediaPersonalMissionsRequestDefinition extends WotRequestDefinition {
	/** Campaign ID. */
	@WotApiFieldDefinition(list = true)
	private long campaign_id;
	/** Operation ID. */
	@WotApiFieldDefinition(list = true)
	private long operation_id;
	/** Mission branch ID. */
	@WotApiFieldDefinition(list = true)
	private long set_id;
	/** Mission tag. */
	@WotApiFieldDefinition(list = true)
	private String tag_id;
}
