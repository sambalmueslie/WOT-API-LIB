package de.sambalmueslie.wot_api_generator;

import java.io.IOException;
import java.util.stream.Stream;

import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;

/**
 * Generator for the wot api.
 * 
 * @autor Sambalmueslie
 */
public class WotApiLibGenerator {
	/**
	 * Main.
	 *
	 * @param args
	 *            the args
	 * @throws IOException
	 *             on errro
	 */
	public static void main(final String[] args) throws IOException {
		new WotApiLibGenerator();
	}

	/**
	 * Constructor.
	 *
	 * @throws IOException
	 *             on error
	 */
	public WotApiLibGenerator() throws IOException {
		generateCode("de.sambalmueslie.wot_api_definition");
	}

	/**
	 * Create the code for the request.
	 *
	 * @param type
	 *            the type
	 */
	private void createRequestCode(final Class<? extends WotRequestDefinition> type) {
		final RequestCodeGenerator requestCodeGenerator = new RequestCodeGenerator();
		try {
			requestCodeGenerator.generateCode(type);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Generate the code for the base package.
	 *
	 * @param basePackage
	 *            the base package
	 * @throws IOException
	 *             on error
	 */
	@SuppressWarnings("unchecked")
	private void generateCode(final String basePackage) throws IOException {
		final ApiDefinitionClassCollector collector = new ApiDefinitionClassCollector();

		final Stream<Class<?>> classes = collector.collect(basePackage).stream();
		classes.filter(c -> WotRequestDefinition.class.isAssignableFrom(c)).map(c -> ((Class<WotRequestDefinition>) c)).forEach(this::createRequestCode);

	}
}
