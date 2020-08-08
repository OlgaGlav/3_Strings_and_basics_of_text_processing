package by.course.glavdel_olga.strings_as_array;
//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы

//Крайние пробелы в строке удалить

public class Task05 {

	public static void main(String[] args) {
		String line = " we   are nead   changes ";

		System.out.println(line);

		char[] lineChar = line.toCharArray();

		char[] newLineChar = new char[lineChar.length];

		char[] endLineChar;

		int offset = 0;

		int index = 0;

		
		if (lineChar[0] == ' ') {

			index = 1;

			offset = -1;
		}

		offset = removeSpace(newLineChar, lineChar, index, offset);

		endLineChar = removeEndSpace(offset, newLineChar);

		line = new String(endLineChar);
		
		System.out.println(line);

	}

	private static int removeSpace(char[] result, char[] array, int index, int offset) {

		for (int i = index; i < array.length - 1; i++) {

			if (array[i] == ' ' && array[i + 1] == ' ') {

				offset--;

			} else {

				result[i + offset] = array[i];
			}
		}
		return offset;
	}

	private static char[] removeEndSpace(int offset, char[] array) {

		char[] result = new char[array.length + offset - 1];

		for (int i = 0; i < result.length; i++) {

			result[i] = array[i];
		}
		return result;
	}

}
