package lab6;

public class Ex9 {

	public static String countWords(String str) {
		// Trim leading and trailing spaces to handle cases with leading/trailing spaces
		str = str.trim();

		// If the string is empty, return 0
		if (str.isEmpty()) {
			return "0";
		}

		// Split the string by one or more whitespace characters
		String[] words = str.split("\\s+");

		// Return the number of elements in the split array, which represents the number
		// of words
		return "Count Words: " + words.length;
	}
}
