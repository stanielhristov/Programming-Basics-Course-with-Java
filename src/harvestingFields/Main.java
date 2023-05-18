package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Class<RichSoilLand> clazz = RichSoilLand.class;
		Field[] declaredField = clazz.getDeclaredFields();
		Consumer<Field> printer = field -> System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());
		String input = scanner.nextLine();

		while (!input.equals("HARVEST")) {
			Field[] fields = declaredField;
			if (!input.equals("all")) {
				fields = getFields(declaredField, input);
			}
			for (Field field : fields) {
				printer.accept(field);
			}
			input = scanner.nextLine();
		}
	}

	private static Field[] getFields(Field[] declaredField, String argument) {
		return Arrays.stream(declaredField)
				.filter(f -> Modifier.toString(f.getModifiers()).startsWith(argument))
				.toArray(Field[]::new);
	}
}