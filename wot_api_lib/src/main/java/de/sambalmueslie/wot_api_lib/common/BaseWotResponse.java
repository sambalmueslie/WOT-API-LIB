package de.sambalmueslie.wot_api_lib.common;

/**
 * Base class for a {@link WotResponse}.
 */
public abstract class BaseWotResponse implements WotResponse {

	@Override
	public final WotMeta getMeta() {
		return meta;
	}

	@Override
	public final String getStatus() {
		return status;
	}

	/** the {@link WotMeta}. */
	private WotMeta meta;
	/** the status. */
	private String status;
}
