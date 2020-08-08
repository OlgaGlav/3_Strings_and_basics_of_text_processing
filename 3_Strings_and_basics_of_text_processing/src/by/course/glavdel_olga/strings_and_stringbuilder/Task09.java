package by.course.glavdel_olga.strings_and_stringbuilder;

import java.util.Scanner;

//Посчитать количество строчных(маленьких) и прописных (больших) букв в введенной строке.
//Учитывать только английские буквы

public class Task09 {

	public static void main(String[] args) {
		
		String str = enterString("Введите строку");

		int countLittleLetter = 0;
		
		int countBigLetter = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.codePointAt(i) >= '\u0041' && str.codePointAt(i) <= '\u005A') {
				
				countBigLetter++;
			}
			if (str.codePointAt(i) >= '\u0061' && str.codePointAt(i) <= '\u007A') {
				
				countLittleLetter++;
			}

		}
		System.out.println("Количество строчных английских букв " + countLittleLetter);

		System.out.println("Количество прописных английских букв " + countBigLetter);

	}

	private static String enterString(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		return scanner.nextLine();
	}

}
