package de.sambalmueslie.wot_api_generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The collector for the api definition.
 * 
 * @autor Sambalmueslie
 */
public class ApiDefinitionClassCollector {

	/**
	 * Collect all api {@link Class}es in the package.
	 *
	 * @param basePackage
	 *            the base package
	 * @return the classes
	 */
	public List<Class<?>> collect(final String basePackage) {
		final Path basePath = getPackagePath(basePackage);
		try {
			final List<Path> apiPackages = getApiPackages(basePath);
			final List<Class<?>> result = new LinkedList<>();
			apiPackages.forEach(p -> result.addAll(loadApiClasses(p)));
			return result;
		} catch (final IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Get the api packages from the base path.
	 *
	 * @param basePath
	 *            the base path
	 * @return the api packages
	 * @throws IOException
	 *             on error
	 */
	private List<Path> getApiPackages(final Path basePath) throws IOException {
		return Files.walk(basePath, 1).filter(p -> p.getName(p.getNameCount() - 1).toString().endsWith("api")).collect(Collectors.toList());
	}

	/**
	 * Get the {@link Class} from file {@link Path}.
	 *
	 * @param path
	 *            the path
	 * @return the {@link Class}
	 */
	private Class<?> getClassFromFile(final Path path) {
		String filePath = path.toString();
		filePath = filePath.replace("\\", ".");
		filePath = filePath.substring("src.main.java".length() + 1, filePath.lastIndexOf("."));
		final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		try {
			return classLoader.loadClass(filePath);
		} catch (final ClassNotFoundException e) {
			return null;
		}
	}

	/**
	 * Get the {@link Path} from a package.
	 *
	 * @param fqpn
	 *            the full qualified package name
	 * @return the path
	 */
	private Path getPackagePath(final String fqpn) {
		final List<String> packagePath = new LinkedList<>();
		packagePath.add("main");
		packagePath.add("java");
		packagePath.addAll(Arrays.asList(fqpn.split("\\.")));
		final Path path = Paths.get("src", packagePath.toArray(new String[0]));
		return path;
	}

	/**
	 * Load the api classes.
	 *
	 * @param apiPackagePath
	 *            the api package {@link Path}.
	 * @return the {@link List} of {@link Class}s for the api
	 */
	private List<Class<?>> loadApiClasses(final Path apiPackagePath) {
		try {
			return Files.walk(apiPackagePath, 1).filter(s -> s.toString().endsWith(".java")).map(this::getClassFromFile).collect(Collectors.toList());
		} catch (final IOException e) {
			e.printStackTrace();
		}
		return new LinkedList<Class<?>>();
	}

}
