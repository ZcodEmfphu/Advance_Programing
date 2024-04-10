package lab6;

public class Ex12 {
	public static String reverseString(String str) {

		char[] charArray = str.toCharArray();

		int start = 0;
		int end = charArray.length - 1;

		while (start < end) {

			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;

			start++;
			end--;
		}

		return new String(charArray);
	}
}
