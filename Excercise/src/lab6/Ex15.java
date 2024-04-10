package lab6;

public class Ex15 {

	public static String capitalizeFirstLetterOfEachWord(String sentence) {
		if (sentence == null || sentence.isEmpty()) {
			return sentence;
		}

		String[] words = sentence.split("\\s+");
		StringBuilder sb = new StringBuilder();

		for (String word : words) {
			if (!word.isEmpty()) { // Skip empty words
				char firstChar = Character.toUpperCase(word.charAt(0));
				sb.append(firstChar).append(word.substring(1)).append(" ");
			}
		}

		// Remove trailing space and return the result
		return sb.toString().trim();
	}

}
