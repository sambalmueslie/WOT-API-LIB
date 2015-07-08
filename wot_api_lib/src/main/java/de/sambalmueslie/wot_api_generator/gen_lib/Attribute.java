package de.sambalmueslie.wot_api_generator.gen_lib;

public class Attribute {

	/**
	 * Constructor.
	 *
	 * @param name
	 *            {@link #name}
	 * @param type
	 *            {@link #type}
	 */
	public Attribute(final String name, final Class<?> type) {
		this.name = name;
		this.type = type;
	}

	/**
	 * @return the {@link #name}
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the {@link #type}
	 */
	public Class<?> getType() {
		return type;
	}

	@Override
	public String toString() {
		final StringBuffer s = new StringBuffer();
		s.append("private ");
		s.append(type.getTypeName());
		s.append(" ");
		s.append(name);
		s.append(";\n");
		return s.toString();
	}

	/** the name. */
	private final String name;

	/** the type. */
	private final Class<?> type;
}
