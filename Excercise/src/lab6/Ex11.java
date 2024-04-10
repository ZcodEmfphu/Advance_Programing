package lab6;

public class Ex11 {
	
	public static int countVowels(String str) {
		// Convert the input string to lowercase for easier comparison
		str = str.toLowerCase();

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// Check if the character is a vowel
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
}
