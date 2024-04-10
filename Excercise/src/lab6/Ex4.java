package lab6;

public class Ex4 {

	public static String findLargestWord(String str) {
		String[] words = str.split("\\s+");
		String largestWord = "";
		int maxLength = 0;

		for (String word : words) {

			word = word.replaceAll("[^a-zA-Z]", "");

			if (word.length() > maxLength) {
				maxLength = word.length();
				largestWord = word;
			}
		}

		return largestWord;
	}

}
