package lab6;

public class Ex20 {
	public static String removeSpecialCharacters(String str) {
		StringBuilder result = new StringBuilder();

		// Iterate through the string
		for (char ch : str.toCharArray()) {
			// Check if the character is alphanumeric
			if (Character.isLetterOrDigit(ch)) {
				result.append(ch);
			}
		}

		return result.toString();
	}

}
