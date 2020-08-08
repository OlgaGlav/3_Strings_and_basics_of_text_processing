package by.course.glavdel_olga.strings_and_stringbuilder;
//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран

import java.util.Scanner;

//Случай, когда самых длинных слов несколько, не обрабатывать

public class Task08 {

	public static void main(String[] args) {
		String str = enterString("Введите строку");

		int max;

		max = findMax(str);

		System.out.println("max=" + max);

	}

	private static int findMax(String str) {

		int max = 0;

		int indexBeginWord = 0;

		int countLetter = 0;

		int index;

		for (index = 0; index < str.length();) {

			countLetter = findCount(str, index);

			if (countLetter > max) {

				max = countLetter;

				indexBeginWord = index;
			}
			index = index + countLetter + 1;
		}
		printWord(str, indexBeginWord, max);

		return max;
	}

	private static void printWord(String str, int index, int countLetter) {

		System.out.println(str.substring(index, index + countLetter));

	}

	private static int findCount(String str, int index) {

		int countLetter = 0;

		for (int i = index; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {

				countLetter++;

			} else {
				return countLetter;
			}
		}
		return countLetter;
	}

	private static String enterString(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		String phrase = scanner.nextLine();

		return phrase;
	}
}
