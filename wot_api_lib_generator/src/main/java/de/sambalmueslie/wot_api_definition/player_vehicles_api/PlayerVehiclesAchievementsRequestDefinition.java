package de.sambalmueslie.wot_api_definition.player_vehicles_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns list of achievements on all vehicles. Achievement properties define the achievements field values (ref. Achievements): 1-4
 * for Mastery Badges and Stage Achievements (type: "class"); maximum value of Achievement series (type: "series"); number of achievements
 * earned from sections: Battle Hero, Epic Achievements, Group Achievements, Special Achievements, etc. (type: "repeatable, single, custom"
 * ).
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "wot/tanks/achievements/")
public class PlayerVehiclesAchievementsRequestDefinition extends WotRequestDefinition {

	/** Access token is used to access personal user data. The token is obtained via authentication and has expiration time. */
	@WotApiFieldDefinition
	private String aaccess_token;

	/** Player account ID. */
	@WotApiFieldDefinition(required = true)
	private long account_id;
	/**
	 * Filter by vehicle availability in the Garage. If the parameter is not specified, all vehicles are returned. Parameter processing
	 * requires a valid access_token for the specified account_id. Valid values: "1" — Return vehicles available in the Garage. "0" — Return
	 * vehicles that are no longer in the Garage.
	 */
	@WotApiFieldDefinition
	private String in_garage;
	/** Player's vehicle ID. */
	@WotApiFieldDefinition(list = true)
	private long tank_id;
}
