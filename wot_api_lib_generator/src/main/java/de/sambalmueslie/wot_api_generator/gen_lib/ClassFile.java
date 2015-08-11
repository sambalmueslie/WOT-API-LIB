package de.sambalmueslie.wot_api_generator.gen_lib;

import java.util.LinkedHashSet;
import java.util.Set;

public class ClassFile {

	public ClassFile(final String packageName, final String className) {
		this.packageName = packageName;
		this.className = className;

		constructorDeclarations = new LinkedHashSet<>();
		methodDeclarations = new LinkedHashSet<>();
		importTypes = new LinkedHashSet<>();
		extendedTypes = new LinkedHashSet<>();
		implementedTypes = new LinkedHashSet<>();
		attributes = new LinkedHashSet<>();
	}

	public void add(final ConstructorDeclaration constructorDeclaration) {
		constructorDeclarations.add(constructorDeclaration);
		constructorDeclaration.getParameters().values().forEach(t -> addImport(t));
	}

	public void add(final MethodDeclaration methodDeclaration) {
		methodDeclarations.add(methodDeclaration);
		methodDeclaration.getParameters().values().forEach(t -> t.getTypes().forEach(s -> addImport(s)));
		addImport(methodDeclaration.getReturnType());
	}

	public void addAttribute(final Attribute a) {
		attributes.add(a);
		addImport(a.getType());
	}

	public void addExtendedType(final Class<?> type) {
		extendedTypes.add(type);
		addImport(type);
	}

	public void addImplementedType(final Class<?> type) {
		implementedTypes.add(type);
		addImport(type);
	}

	@Override
	public String toString() {
		final StringBuffer s = new StringBuffer();
		// write package
		s.append("package " + packageName + ";\n");
		s.append("\n");
		// write imports
		importTypes.forEach(t -> s.append("import " + t.getName() + ";\n"));
		s.append("\n");
		// write class header
		s.append("public class " + className + " ");

		// write class header - extends
		if (extendedTypes.size() > 0) {
			s.append("extends ");
			int i = 0;
			for (final Class<?> extendedType : extendedTypes) {
				s.append(extendedType.getSimpleName() + " ");
			}
			i++;
			if (i < extendedTypes.size()) {
				s.append(", ");
			}
		}
		// write class header - implements
		if (implementedTypes.size() > 0) {
			s.append("implements ");
			int i = 0;
			for (final Class<?> implementedType : implementedTypes) {
				s.append(implementedType.getSimpleName() + " ");
			}
			i++;
			if (i < implementedTypes.size()) {
				s.append(", ");
			}
		}
		s.append(" {\n");
		s.append("\n");
		// write constructors
		constructorDeclarations.forEach(c -> s.append(c));

		// write methods
		methodDeclarations.forEach(m -> s.append(m));

		// write attributes
		attributes.forEach(a -> s.append(a));

		s.append("}\n");
		s.append("\n");
		return s.toString();
	}

	private void addImport(final Class<?> type) {
		if (type == null || type.isPrimitive()) return;
		importTypes.add(type);
	}

	private final Set<Attribute> attributes;
	private final String className;
	private final Set<ConstructorDeclaration> constructorDeclarations;
	private final Set<Class<?>> extendedTypes;
	private final Set<Class<?>> implementedTypes;
	private final Set<Class<?>> importTypes;
	private final Set<MethodDeclaration> methodDeclarations;
	private final String packageName;
}
