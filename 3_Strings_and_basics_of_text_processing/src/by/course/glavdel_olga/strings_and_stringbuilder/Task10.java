package by.course.glavdel_olga.strings_and_stringbuilder;
//Строка Х состоит из нескольких предложений, каждое из которых кончается точкой, ! или ?

//Определить количество предложений в тексте

public class Task10 {

	public static void main(String[] args) {

		String str = "Рано? Поздно! нет, еще успеем.";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
				count++;
			}
		}
		System.out.println(count);

	}

}
