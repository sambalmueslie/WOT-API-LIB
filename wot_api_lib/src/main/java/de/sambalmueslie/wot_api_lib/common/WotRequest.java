package de.sambalmueslie.wot_api_lib.common;

import java.util.Map;

/**
 * The base interface for an world of tank api request.
 */
public interface WotRequest {

	/**
	 * @return the method of the request.
	 */
	String getMethod();

	/**
	 * @return the parameter (name value pair) of the request.
	 */
	Map<String, Object> getParameter();
}
