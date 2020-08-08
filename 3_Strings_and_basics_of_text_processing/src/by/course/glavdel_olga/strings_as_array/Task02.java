package by.course.glavdel_olga.strings_as_array;
//Замените в строке все вхождения "word' на 'letter'

public class Task02 {

	public static void main(String[] args) {

		String line = "word letter word";

		char[] lineArray = line.toCharArray();

		int count = findLength(lineArray);

		char[] newLineArray = new char[line.length() + 2 * count];

		change(newLineArray, lineArray);

		line = new String(newLineArray);

		System.out.println(line);
	}

	private static void change(char[] newArray, char[] line) {

		int offset = 0;

		for (int i = 0; i < line.length; i++) {

			if ((i < line.length - 4) && line[i] == 'w' && line[i + 1] == 'o' && line[i + 2] == 'r'
					&& line[i + 3] == 'd') {

				i = initialization(newArray, i, offset);

				offset = offset + 2;

			} else if ((i == line.length - 4) && line[line.length - 4] == 'w' && line[line.length - 3] == 'o'
					&& line[line.length - 2] == 'r' && line[line.length - 1] == 'd') {

				i = initialization(newArray, i, offset);

				offset = offset + 2;

			} else {
				newArray[i + offset] = line[i];
			}

		}
	}

	private static int initialization(char[] newArray, int i, int offset) {
		
		newArray[i + offset] = 'l';
		newArray[i + offset + 1] = 'e';
		newArray[i + offset + 2] = 't';
		newArray[i + offset + 3] = 't';
		newArray[i + offset + 4] = 'e';
		newArray[i + offset + 5] = 'r';
		
		return i + 4;

	}

	private static int findLength(char[] line) {

		int count = 0;

		for (int i = 0; i < line.length; i++) {

			if (i < line.length - 4 && line[i] == 'w' && line[i + 1] == 'o' && line[i + 2] == 'r'
					&& line[i + 3] == 'd') {

				count = count + 1;
			}

			if (i == line.length - 4 && line[line.length - 4] == 'w' && line[line.length - 3] == 'o'
					&& line[line.length - 2] == 'r' && line[line.length - 1] == 'd') {

				count = count + 1;
			}
		}
		return count;
	}

}
