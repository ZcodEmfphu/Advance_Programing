package lab6;

public class Ex18 {

	public static String reverseString(String str) {
		StringBuilder reversed = new StringBuilder();

		// Iterate through the string in reverse order
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}

		return reversed.toString();
	}

}
