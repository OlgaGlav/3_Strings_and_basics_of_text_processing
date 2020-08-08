package by.course.glavdel_olga.strings_and_stringbuilder;
//С помощью функции копирования и операции конкатенации составить из частей слова "информатика" слово "торт"

public class Task04 {

	public static void main(String[] args) {
		String word = "информатика";
		
		String resultWord = word.substring(7,8)+word.substring(3,5)+word.substring(7, 8);
		
		System.out.println(resultWord);

	}

}
