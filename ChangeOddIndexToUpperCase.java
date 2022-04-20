package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		// To convert alternate character of a string to upper case

		String str = "changeme";

		StringBuffer newstr = new StringBuffer();

		char[] chara = str.toCharArray();

		for (int i = 0; i < chara.length; i++) {

			char c = chara[i];

			if (i % 2 != 0) {

				c = Character.toUpperCase(c);
			}

			newstr.append(c);
		}
		System.out.println(newstr);
	}
}
