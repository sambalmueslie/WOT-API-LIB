package de.sambalmueslie.wot_api_definition.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface WotApiRequestDefinition {

	/**
	 * @return the method of the request.
	 */
	String method();

}
