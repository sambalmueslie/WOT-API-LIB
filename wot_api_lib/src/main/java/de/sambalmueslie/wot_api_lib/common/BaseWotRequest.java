package de.sambalmueslie.wot_api_lib.common;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The base {@link WotRequest}.
 */
public abstract class BaseWotRequest implements WotRequest {

	@Override
	public final Map<String, Object> getParameter() {
		final Map<String, Object> map = new LinkedHashMap<>();
		if (language != null) {
			map.put("language", language);
		}
		if (fields != null) {
			map.put("fields", fields);
		}
		getParameter(map);
		return map;
	}

	public void setFields(final String fields) {
		this.fields = fields;
	}

	public void setLanguage(final String language) {
		this.language = language;
	}

	/**
	 * Get the parameter.
	 *
	 * @param params
	 *            the params
	 */
	protected abstract void getParameter(Map<String, Object> params);

	/**
	 * the Response field. The fields are separated with commas. Embedded fields are separated with dots. To exclude a field, use “-” in
	 * front of its name. In case the parameter is no defined, the method returns all fields.
	 */
	private String fields;

	/**
	 * the Localization language. Valid values: "en" — English (by default) "ru" — Русский "pl" — Polski "de" — Deutsch "fr" — Français "es"
	 * — Español "zh-cn" — 简体中文 "tr" — Türkçe "cs" — Čeština "th" — ไทย "vi" — Tiếng Việt "ko" — 한국어 .
	 */
	private String language;

}
