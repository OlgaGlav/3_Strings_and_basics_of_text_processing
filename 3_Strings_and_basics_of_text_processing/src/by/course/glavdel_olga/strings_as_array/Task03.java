package by.course.glavdel_olga.strings_as_array;
//В строке найти количество цифр

public class Task03 {

	public static void main(String[] args) {
		String line = "3 gdfgf 1 bfdb 0 fdb 3 dfgdfgdfgdfg 8fdgf 9 dbd 9 9";

		int count = 0;

		for (int i = 0; i < line.length(); i++) {

			if (line.charAt(i) == '0' || line.charAt(i) == '1' || line.charAt(i) == '2' || line.charAt(i) == '3'
					|| line.charAt(i) == '4' || line.charAt(i) == '5' || line.charAt(i) == '6' || line.charAt(i) == '7'
					|| line.charAt(i) == '8' || line.charAt(i) == '9') {

				count = count + 1;
			}
		}
		System.out.println(count);
	}

}
