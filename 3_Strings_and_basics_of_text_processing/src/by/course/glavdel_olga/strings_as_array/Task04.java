package by.course.glavdel_olga.strings_as_array;
//В строке найти количество чисел

public class Task04 {

	public static void main(String[] args) {

		String line = "zzxc 11 nscsc 22 ccc  5 555 555 dcfdfd zdcd 6 vdv 6.";

		StringBuilder lineBuilder = new StringBuilder(line);

		int count;

		removeSpaceDigits(line, lineBuilder);

		System.out.println(lineBuilder);

		count = findCount(line, lineBuilder);

		System.out.println(count);
	}

	private static int findCount(String line, StringBuilder lineBuilder) {

		int count = 0;

		for (int i = 0; i < lineBuilder.length() - 1; i++) {

			if ((Character.isDigit(lineBuilder.charAt(i)) && lineBuilder.charAt(i + 1) == ' ')
					
					|| (Character.isDigit(lineBuilder.charAt(i)) && lineBuilder.charAt(i + 1) == '.')) {

				count = count + 1;
			}
		}
		return count;
	}

	private static void removeSpaceDigits(String line, StringBuilder lineBuilder) {

		int offset = 0;

		for (int i = 0; i < line.length() - 3; i++) {

			if (Character.isDigit(line.charAt(i)) && line.charAt(i + 1) == ' '
					
					&& Character.isDigit(line.charAt(i + 2))) {

				lineBuilder.deleteCharAt(i + 1 + offset);

				offset--;
			}
		}

	}

}
