package lab6;

public class Ex11 {

	public static String countVowels(String str) {

		str = str.toLowerCase();

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return "Vowels: " + count;
	}
}
