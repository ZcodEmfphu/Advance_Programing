package week_4;

public class Example1 {

	public static String findLongestString(String[] arr) {
		String longest = arr[0];

		for (String items : arr) {
			if (items.length() > longest.length()) {
				longest = items;
			}
		}
		return longest;
	}
}
