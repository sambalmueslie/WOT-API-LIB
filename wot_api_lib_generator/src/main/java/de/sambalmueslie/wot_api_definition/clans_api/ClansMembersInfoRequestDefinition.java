package de.sambalmueslie.wot_api_definition.clans_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns clan member info and short info on the clan.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wgn/clans/membersinfo/")
public class ClansMembersInfoRequestDefinition extends WotRequestDefinition {

	/** User ID. */
	@WotApiFieldDefinition(required = true, list = true)
	private long account_id;
}
