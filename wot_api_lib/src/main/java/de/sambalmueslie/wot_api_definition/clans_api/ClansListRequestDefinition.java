package de.sambalmueslie.wot_api_definition.clans_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method searches through clans and sorts them in a specified order.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "clans/list/")
public class ClansListRequestDefinition extends WotRequestDefinition {
	/**
	 * Number of returned entries (fewer can be returned, but not more than 100). If the limit sent exceeds 100, an limit of 100 is applied
	 * (by default).
	 */
	@WotApiFieldDefinition
	private long limit;
	/**
	 * Sorting. Valid values: "id" — by clan id "-id" — by clan id in reverse order "name" — by clan name "-name" — by clan name in reverse
	 * order "members_count" — by clan’s size "-members_count" — by clan’s size in reverse order "tag" — by clan tag "-tag" — by clan tag in
	 * reverse order "created_at" — by clan’s creation date "-created_at" — by clan’s creation date in reverse order.
	 */
	@WotApiFieldDefinition
	private String order_by;
	/** Page number. */
	@WotApiFieldDefinition
	private long page_no;
	/** Part of a clan name/tag searched. */
	@WotApiFieldDefinition
	private String search;
}
