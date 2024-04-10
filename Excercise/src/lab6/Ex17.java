package lab6;

import java.util.ArrayList;
import java.util.List;

public class Ex17 {
	public static String getAllSubstrings(String str) {
		List<String> substrings = new ArrayList<>();

		// Iterate through the string
		for (int i = 0; i < str.length(); i++) {
			// Generate substrings starting from the current character
			for (int j = i + 1; j <= str.length(); j++) {
				substrings.add(str.substring(i, j));
			}
		}

		return "" + substrings;
	}
}
