package de.sambalmueslie.wot_api_generator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;

import de.sambalmueslie.wot_api_definition.account_api.AccountAchievementsRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotApiRequestDefinition;
import de.sambalmueslie.wot_api_definition.common.WotRequestDefinition;
import de.sambalmueslie.wot_api_generator.gen_lib.ClassFile;
import de.sambalmueslie.wot_api_generator.gen_lib.MethodDeclaration;
import de.sambalmueslie.wot_api_generator.gen_lib.Parameter;
import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;

public class WotApiLibGenerator {
	public static void main(final String[] args) {
		new WotApiLibGenerator();
	}

	public WotApiLibGenerator() {
		try {
			transform(AccountAchievementsRequestDefinition.class, "account_api", "AccountAchievementsRequest");
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private BufferedWriter createOutputFile(final String apiName, final String requestName) throws IOException {
		final Path path = Paths.get("src", "main", "java", "de", "sambalmueslie", "wot_api_lib", apiName, "gen_code", requestName + ".java");
		System.out.println(path);
		if (!Files.exists(path)) {
			Files.createFile(path);
		}
		return Files.newBufferedWriter(path, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
	}

	private void transform(final Class<? extends WotRequestDefinition> type, final String apiName, final String requestName) throws IOException {
		final String packageName = "de.sambalmueslie.wot_api_lib." + apiName + ".gen_code";
		final String className = requestName;
		final ClassFile classFile = new ClassFile(packageName, className);

		// do the BaseWotRequest
		classFile.addExtendedType(BaseWotRequest.class);

		// BaseWotRequest#getMethod
		final WotApiRequestDefinition requestDefinition = type.getAnnotation(WotApiRequestDefinition.class);
		classFile.add(new MethodDeclaration("getMethod", true, "return \"" + requestDefinition.method() + "\";", String.class));

		// BaseWotRequest#getParameter
		final MethodDeclaration methodDeclaration = new MethodDeclaration("getParameter", true, "// TODO Auto-generated method stub", null);
		methodDeclaration.addParameter(new Parameter("params", Map.class, String.class, Object.class));
		classFile.add(methodDeclaration);

		// @Override
		// protected void getParameter(final Map<String, Object> params) {
		// // TODO Auto-generated method stub
		//
		// }

		final BufferedWriter file = createOutputFile(apiName, requestName);
		file.write(classFile.toString());
		file.close();
	}

}
