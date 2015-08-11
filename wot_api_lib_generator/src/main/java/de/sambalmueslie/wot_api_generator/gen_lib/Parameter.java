package de.sambalmueslie.wot_api_generator.gen_lib;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Parameter {

	public Parameter(final String name, final Class<?> type, final Class<?>... genericTypes) {
		super();
		this.name = name;
		this.type = type;
		this.genericTypes = genericTypes;
	}

	@Override
	public String toString() {
		final StringBuffer s = new StringBuffer();
		s.append(type.getSimpleName());
		if (genericTypes.length > 0) {

			s.append("<");
			for (int i = 0; i < genericTypes.length; i++) {
				s.append(genericTypes[i].getSimpleName());
				if (i < genericTypes.length - 1) {
					s.append(", ");
				}
			}
			s.append(">");
		}
		s.append(" ");
		s.append(name);
		return s.toString();
	}

	String getName() {
		return name;
	}

	Set<Class<?>> getTypes() {
		final Set<Class<?>> types = new HashSet<>();
		types.add(type);
		types.addAll(Arrays.asList(genericTypes));
		return types;
	}

	private final Class<?>[] genericTypes;
	private final String name;

	private final Class<?> type;
}
