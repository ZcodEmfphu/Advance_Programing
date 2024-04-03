package lab4_5.lab4;

public class Ex7 {

	public static boolean checkPalindrome(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			if (arr[i] != arr[n - 1 - i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkAlternating(int[] arr) {
		int n = arr.length;
		boolean positive = arr[0] > 0;
		for (int i = 1; i < n; i++) {
			if ((arr[i] > 0) == positive) {
				return false;
			}
			positive = !positive;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 6, 4, 1 };
		checkPalindrome(arr1);
	}

}
