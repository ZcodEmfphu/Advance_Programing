package lab6;

public class Ex8 {

	public static String removeFirstLastCharacter(String str) {
		// Check if the string has at least two characters
		if (str.length() < 2) {
			return "";
		}
		// Return the substring from index 1 to the second last character
		return str.substring(1, str.length() - 1);
	}
}
