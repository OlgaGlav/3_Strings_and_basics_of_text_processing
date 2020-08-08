package by.course.glavdel_olga.strings_and_stringbuilder;

import java.util.Scanner;

//Из заданной строки получить новую, повторив каждый символ дважды

public class Task06 {

	public static void main(String[] args) {

		String word = enterString("Введите строку");

		StringBuilder builder = new StringBuilder(word);

		builder = repeat(word);

		word = new String(builder);

		System.out.println(word);
	}

	private static StringBuilder repeat(String word) {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < word.length(); i++) {

			String part = partString(word, i);

			builder.append(part);
		}
		return builder;
	}

	private static String partString(String word, int i) {

		String element = word.substring(i, i + 1);

		return element + element;
	}

	private static String enterString(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		String phrase = scanner.nextLine();

		return phrase;
	}
}
