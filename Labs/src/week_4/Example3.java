package week_4;

public class Example3 {

	public static boolean isPalindrome(String str) {
		String clearString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		return clearString.equals(new StringBuilder(clearString).reverse().toString());
	}
}
