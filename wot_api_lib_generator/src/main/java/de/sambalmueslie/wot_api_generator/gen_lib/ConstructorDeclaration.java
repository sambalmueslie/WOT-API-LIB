package de.sambalmueslie.wot_api_generator.gen_lib;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ConstructorDeclaration {

	public ConstructorDeclaration(final String name) {
		this.name = name;
		parameters = new LinkedHashMap<>();
	}

	public void addParameter(final String name, final Class<?> type) {
		parameters.put(name, type);
	}

	@Override
	public String toString() {
		final StringBuffer s = new StringBuffer();
		s.append("\tpublic ");
		s.append(name);
		s.append("(");
		final Iterator<Entry<String, Class<?>>> paramIter = parameters.entrySet().iterator();
		for (int i = 0; i < parameters.size(); i++) {
			final Entry<String, Class<?>> param = paramIter.next();
			s.append("final " + param.getValue().getName() + " " + param.getKey());
			if (i < parameters.size() - 1) {
				s.append(',');
			}
		}
		s.append(") {\n");
		parameters.keySet().stream().map(p -> "\t\tthis." + p + " = " + p + ";\n").forEach(s::append);
		s.append("\t}\n\n");
		return s.toString();
	}

	Map<String, Class<?>> getParameters() {
		return parameters;
	}

	/** the name. */
	private final String name;
	/** the types by name. */
	private final Map<String, Class<?>> parameters;

}
