package de.sambalmueslie.wot_api_definition.common;

/**
 * A base wot request definition.
 * 
 * @autor Sambalmueslie
 */
public abstract class WotRequestDefinition {
	/** Application ID. */
	@WotApiFieldDefinition(required = true)
	private String application_id;

	/**
	 * the Response field. The fields are separated with commas. Embedded fields are separated with dots. To exclude a field, use “-” in
	 * front of its name. In case the parameter is no defined, the method returns all fields.
	 */
	@WotApiFieldDefinition(list = true)
	private String fields;
	/**
	 * the Localization language. Valid values: "en" — English (by default) "ru" — Русский "pl" — Polski "de" — Deutsch "fr" — Français "es"
	 * — Español "zh-cn" — 简体中文 "tr" — Türkçe "cs" — Čeština "th" — ไทย "vi" — Tiếng Việt "ko" — 한국어 .
	 */
	@WotApiFieldDefinition
	private String language;
}
