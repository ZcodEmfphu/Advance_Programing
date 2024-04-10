package lab6;

import java.util.Arrays;

public class Ex13 {

	public static boolean areAnagrams(String str1, String str2) {
		// Convert strings to character arrays
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		// Sort the character arrays
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		// Compare sorted character arrays
		return Arrays.equals(charArray1, charArray2);
	}
}
