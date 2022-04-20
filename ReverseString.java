package week1.day2;

public class ReverseString {

	public static void main(String[] args) {

		// To Reverse String

		String str = "Feeling good";

		System.out.println("Original string: " + str);

		StringBuilder revStr = new StringBuilder(str);

		revStr.reverse();

		String result = revStr.toString();

		System.out.println("Reversed string: " + result);

	}

}