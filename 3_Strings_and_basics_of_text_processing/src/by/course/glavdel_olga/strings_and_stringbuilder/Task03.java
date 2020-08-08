package by.course.glavdel_olga.strings_and_stringbuilder;

import java.util.Scanner;

//Проверить, является ли заданное слово палиндромом

public class Task03 {

	public static void main(String[] args) {
		String word = enterString("Введите слово");

		boolean isPalindrom;

		isPalindrom = checkIsPalindrom(word);

		System.out.println(isPalindrom);
	}

	private static boolean checkIsPalindrom(String word) {
		
		StringBuilder wordBuilder = new StringBuilder(word);

		while (wordBuilder.length() > 1) {

			if (wordBuilder.charAt(0) == wordBuilder.charAt(wordBuilder.length() - 1)) {

				wordBuilder.deleteCharAt(0);

				wordBuilder.deleteCharAt(wordBuilder.length() - 1);

			} else {
				return false;
			}
		}
		return true;
	}

	private static String enterString(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		return scanner.next();
	}

}
