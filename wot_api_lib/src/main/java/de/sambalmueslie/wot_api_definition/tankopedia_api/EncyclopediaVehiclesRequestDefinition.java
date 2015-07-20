package de.sambalmueslie.wot_api_definition.tankopedia_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns list of available vehicles.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/encyclopedia/tanks/")
public class EncyclopediaVehiclesRequestDefinition extends WotRequestDefinition {

	/** Nation. */
	@WotApiFieldDefinition(list = true)
	private String nation;
	/** Vehicle ID. */
	@WotApiFieldDefinition(list = true)
	private long tank_id;
	/** Tier. */
	@WotApiFieldDefinition(list = true)
	private long tier;

}
