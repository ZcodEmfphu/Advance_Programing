package lab6;

public class Ex12 {
	public static String reverseString(String str) {
		// Convert the string to a character array
		char[] charArray = str.toCharArray();

		// Initialize pointers for the start and end of the array
		int start = 0;
		int end = charArray.length - 1;

		// Iterate until start pointer is less than end pointer
		while (start < end) {
			// Swap characters at start and end pointers
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;

			// Move the pointers towards each other
			start++;
			end--;
		}

		// Convert the character array back to a string
		return new String(charArray);
	}
}
