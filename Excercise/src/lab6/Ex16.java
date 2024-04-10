package lab6;

public class Ex16 {

	public static boolean isPalindrome(String str) {
		if (str == null) {
			return false; // Null strings are not palindromes
		}

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			// Ignore non-alphanumeric characters
			while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
				right--;
			}

			// Compare characters ignoring case
			if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
				return false; // Characters at left and right positions don't match
			}

			left++;
			right--;
		}

		return true; // If the loop completes, the string is a palindrome
	}

}
