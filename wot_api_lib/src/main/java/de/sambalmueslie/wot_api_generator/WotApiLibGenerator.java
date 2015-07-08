package de.sambalmueslie.wot_api_generator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import de.sambalmueslie.wot_api_definition.account_api.AccountAchievementsRequestDefinition;
import de.sambalmueslie.wot_api_definition.account_api.AccountInfoRequestDefinition;
import de.sambalmueslie.wot_api_definition.account_api.AccountListRequestDefinition;
import de.sambalmueslie.wot_api_definition.account_api.AccountTanksRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiFieldDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;
import de.sambalmueslie.wot_api_generator.gen_lib.*;
import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;

public class WotApiLibGenerator {
	public static void main(final String[] args) {
		new WotApiLibGenerator();
	}

	public WotApiLibGenerator() {
		try {
			transform(AccountAchievementsRequestDefinition.class);
			transform(AccountInfoRequestDefinition.class);
			transform(AccountListRequestDefinition.class);
			transform(AccountTanksRequestDefinition.class);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private String createGetParameterContent(final Class<? extends WotRequestDefinition> type) {
		final List<Field> defs = getDefinitions(type).collect(Collectors.toList());
		final StringBuffer s = new StringBuffer();
		for (final Field f : defs) {
			if (f.getType().isAssignableFrom(long.class)) {
				s.append("if (" + f.getName() + " > 0) {\n");
			} else {
				s.append("if (" + f.getName() + " != null ) {\n");
			}
			s.append("\t\t\tparams.put(\"" + f.getName() + "\"," + f.getName() + ");\n");
			s.append("\t\t}\n");
		}
		return s.toString();
	}

	private BufferedWriter createOutputFile(final String apiName, final String requestName) throws IOException {
		final Path path = Paths.get("src", "main", "java", "de", "sambalmueslie", "wot_api_lib", apiName, "request", requestName + ".java");
		System.out.println(path);
		if (!Files.exists(path)) {
			Files.createFile(path);
		}
		return Files.newBufferedWriter(path, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
	}

	private MethodDeclaration createSetter(final Field a) {
		final String name = "set" + Character.toUpperCase(a.getName().charAt(0)) + a.getName().substring(1);
		final String content = "this." + a.getName() + " = " + a.getName() + ";\n";
		final MethodDeclaration md = new MethodDeclaration(name, false, content, null);
		md.addParameter(new Parameter(a.getName(), a.getType()));
		return md;
	}

	private Stream<Field> getDefinitions(final Class<? extends WotRequestDefinition> type) {
		return Arrays.asList(type.getDeclaredFields()).stream().filter(f -> f.isAnnotationPresent(WotApiFieldDefinition.class));
	}

	private void transform(final Class<? extends WotRequestDefinition> type) throws IOException {
		final String requestName = type.getSimpleName().substring(0, type.getSimpleName().indexOf("Definition"));
		final String defPackageName = type.getPackage().getName();
		final String apiName = defPackageName.substring(defPackageName.lastIndexOf('.') + 1);

		final String packageName = "de.sambalmueslie.wot_api_lib." + apiName + ".request";
		final String className = requestName;
		final ClassFile classFile = new ClassFile(packageName, className);

		// do the BaseWotRequest
		classFile.addExtendedType(BaseWotRequest.class);

		// BaseWotRequest#getMethod
		final WotApiRequestDefinition requestDefinition = type.getAnnotation(WotApiRequestDefinition.class);
		classFile.add(new MethodDeclaration("getMethod", true, "return \"" + requestDefinition.method() + "\";", String.class));

		// BaseWotRequest#getParameter
		final String getParameterContent = createGetParameterContent(type);
		final MethodDeclaration methodDeclaration = new MethodDeclaration("getParameter", true, getParameterContent, null);
		methodDeclaration.addParameter(new Parameter("params", Map.class, String.class, Object.class));
		classFile.add(methodDeclaration);

		// attributes
		getDefinitions(type).map(f -> new Attribute(f.getName(), f.getType())).forEach(classFile::addAttribute);

		// constructor
		final ConstructorDeclaration constructorDeclaration = new ConstructorDeclaration(requestName);
		getDefinitions(type).filter(f -> f.getAnnotation(WotApiFieldDefinition.class).required())
				.forEach(a -> constructorDeclaration.addParameter(a.getName(), a.getType()));
		classFile.add(constructorDeclaration);

		// setter
		getDefinitions(type).filter(f -> !f.getAnnotation(WotApiFieldDefinition.class).required()).forEach(a -> classFile.add(createSetter(a)));

		final BufferedWriter file = createOutputFile(apiName, requestName);
		file.write(classFile.toString());
		file.close();
	}

}
