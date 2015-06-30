package de.sambalmueslie.wot_api_lib.common;

/**
 * A response on a world of tank request.
 */
public interface WotResponse {

	/**
	 * @return the {@link WotMeta} information.
	 */
	WotMeta getMeta();

	/**
	 * @return the status of the response.
	 */
	String getStatus();

}
