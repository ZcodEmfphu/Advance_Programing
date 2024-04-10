package lab6;

public class Ex3 {

	public static String countVowelsAndConsonants(String str) {
		int vowelCount = 0;
		int consonantCount = 0;

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}
		}
		return "Vowel: " + vowelCount + "- Consonant: " + consonantCount;
	}
}
