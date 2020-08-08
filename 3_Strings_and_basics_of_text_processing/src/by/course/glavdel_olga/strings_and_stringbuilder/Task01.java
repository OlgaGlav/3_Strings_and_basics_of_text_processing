package by.course.glavdel_olga.strings_and_stringbuilder;

//Дан текст(строка).Найдите наибольшее количество подряд идущих пробелов в нем

public class Task01 {

	public static void main(String[] args) {
		String line = "cdc scdscd  dcdcdc     cdcd csdcsdc dcdcd dc   sdcsdcsdc ";

		int max = 0;

		int count = 0;

		int index = 0;

		count = findCount(count, index, line, max);

		System.out.println(count);

	}

	private static int findCount(int count, int index, String line, int max) {

		for (int i = index; i < line.length();) {

			if (line.charAt(i) == ' ') {

				count++;

				i++;

				if (count > max) {

					max = count;
				}

				findCount(count, i, line, max);

			} else {
				
				count = 0;
				
				i++;
			}
		}
		return max;
	}

}
