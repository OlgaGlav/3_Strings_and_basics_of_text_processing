package by.course.glavdel_olga.strings_and_stringbuilder;
//Вводится строка. Трубуется удалить из нее поторяющиеся символы и все пробелы.

//Например, если если введено "abc cde def" то должно быть выведено "abcdef"

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		String word = enterString("Введите строку");

		StringBuilder builder = new StringBuilder(word);

		builder = deleteSpace(builder);

		builder = deleteRepeat(builder);

		word = new String (builder);
		
		System.out.println(word);
	}

	private static StringBuilder deleteRepeat(StringBuilder builder) {

		for (int i = 0; i < builder.length() - 1; i++) {

			if (builder.charAt(i) == builder.charAt(i + 1)) {

				builder.deleteCharAt(i);
			}
		}
		return builder;
	}

	private static StringBuilder deleteSpace(StringBuilder builder) {

		for (int i = 0; i < builder.length(); i++) {

			if (builder.charAt(i) == ' ') {

				builder.deleteCharAt(i);
			}
		}
		return builder;
	}

	private static String enterString(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		String phrase = scanner.nextLine();

		return phrase;
	}
}
