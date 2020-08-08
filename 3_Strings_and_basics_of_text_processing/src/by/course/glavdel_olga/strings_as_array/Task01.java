package by.course.glavdel_olga.strings_as_array;
//Дан массиы названий переменных в camelCase. Преобразовать названия в snake_case

public class Task01 {

	public static void main(String[] args) {

		String valueString = "stringStringString";

		StringBuilder valueBuilder = new StringBuilder(valueString);

		int offset = 0;

		for (int i = 0; i < valueString.length(); i++) {

			if (valueString.charAt(i) == valueString.toUpperCase().charAt(i)) {

				valueBuilder.insert(i + offset, '_');

				valueBuilder.deleteCharAt(i + offset + 1);

				valueBuilder.insert(i + offset + 1, valueString.toLowerCase().charAt(i));

				offset = offset + 1;
			}
		}
		
		valueString=new String(valueBuilder);
		
		System.out.println(valueString);
	}

}
