package de.sambalmueslie.wot_api_definition.tankopedia_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns vehicle configuration characteristics based on the specified module IDs.
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/encyclopedia/vehicleprofile/")
public class EncyclopediaVehicleProfileRequestDefinition extends WotRequestDefinition {

	/** Engine ID. If module is not specified, standard module is used by default. */
	@WotApiFieldDefinition
	private long engine_id;
	/** Gun ID. If module is not specified, standard module is used by default. */
	@WotApiFieldDefinition
	private long gun_id;
	/** Radio ID. If module is not specified, standard module is used by default. */
	@WotApiFieldDefinition
	private long radio_id;
	/** Suspension ID. If module is not specified, standard module is used by default. */
	@WotApiFieldDefinition
	private long suspension_id;
	/** Vehicle ID. */
	@WotApiFieldDefinition(required = true)
	private long tank_id;
	/** Turret ID. If module is not specified, standard module is used by default. */
	@WotApiFieldDefinition
	private long turret_id;
}
