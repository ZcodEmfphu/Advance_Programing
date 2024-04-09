package lab6;

public class Ex2 {

	public static boolean isPalindrome(String str) {
		String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int left = 0;
		int right = cleanedStr.length() - 1;
		while (left < right) {
			if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
