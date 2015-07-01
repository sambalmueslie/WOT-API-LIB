package de.sambalmueslie.wot_api_definition.account_api;

import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Method returns players' achievement details. Achievement properties define the achievements field values (ref. Achievements): 1-4 for
 * Mastery Badges and Stage Achievements (type: "class"); maximum value of Achievement series (type: "series"); number of achievements
 * earned from sections: Battle Hero, Epic Achievements, Group Achievements, Special Achievements, etc. (type: "repeatable, single, custom"
 * ).
 *
 * @autor Sambalmueslie
 */
@WotApiRequestDefinition(method = "account/tanks/")
public class AccountAchievementsRequestDefinition extends WotRequestDefinition {

	/** Player account ID. */
	@WotApiFieldDefinition(required = true, list = true)
	private long account_id;

}
