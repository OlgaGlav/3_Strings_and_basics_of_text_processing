package by.course.glavdel_olga.strings_and_stringbuilder;
//В строке вставить после каждого символа 'a' символ 'b'

public class Task02 {

	public static void main(String[] args) {

		String line = "zxca gha kilma nvtyufv";

		StringBuilder lineBuilder = new StringBuilder(line);

		int offset = 0;

		for (int i = 0; i < line.length(); i++) {
			
			if (line.charAt(i) == 'a') {
				
				lineBuilder.insert(i + 1 + offset, 'b');
				
				offset++;
			}
		}

		line = new String(lineBuilder);

		System.out.println(line);
	}

}
