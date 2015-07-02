package de.sambalmueslie.wot_api_generator.gen_lib;

import java.util.LinkedHashMap;
import java.util.Map;

public class MethodDeclaration {

	public MethodDeclaration(final String name, final boolean override, final String content, final Class<?> returnType) {
		this.name = name;
		this.override = override;
		this.content = content;
		this.returnType = returnType;

		parameters = new LinkedHashMap<>();
	}

	public void addParameter(final Parameter parameter) {
		parameters.put(parameter.getName(), parameter);
	}

	@Override
	public String toString() {
		final StringBuffer s = new StringBuffer();
		if (override) {
			s.append("@Override\n");
		}
		s.append("public ");
		s.append(returnType == null ? " void " : returnType.getSimpleName() + " ");
		s.append(name);
		s.append("( ");
		parameters.values().forEach(e -> s.append(e));
		s.append(" ) { \n");
		s.append("\t");
		s.append(content);
		s.append("\n");
		s.append("}\n");
		s.append("\n");
		return s.toString();
	}

	Map<String, Parameter> getParameters() {
		return parameters;
	}

	Class<?> getReturnType() {
		return returnType;
	}

	private final String content;
	private final String name;
	private final boolean override;
	/** the types by name. */
	private final Map<String, Parameter> parameters;
	private final Class<?> returnType;

}
