package de.sambalmueslie.wot_api_generator.gen_lib;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConstructorDeclaration {

	public ConstructorDeclaration() {
		parameters = new LinkedHashMap<>();
	}

	public void addParameter(final String name, final Class<?> type) {
		parameters.put(name, type);
	}

	Map<String, Class<?>> getParameters() {
		return parameters;
	}

	/** the types by name. */
	private final Map<String, Class<?>> parameters;

}
