package by.course.glavdel_olga.strings_and_stringbuilder;
//Подсчитать, сколько раз среди символов заданной строки встречается буква "a"

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		String word = enterString("Введите строку");

		int count;

		count = findCount(word);

		System.out.println(count);
	}

	private static int findCount(String word) {
		int count = 0;
		
		for( int i=0; i<word.length();i++) {
			if(word.charAt(i)=='a'|| word.charAt(i)=='а') {
				count ++;
			}
		}
	
		return count;
	}

	private static String enterString(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		String phrase = scanner.nextLine();
		
		return phrase;
	}
}
