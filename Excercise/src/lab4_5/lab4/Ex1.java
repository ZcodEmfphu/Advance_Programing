package lab4_5.lab4;

public class Ex1 {

	public static int[] findMax(int[] n) {
		int index = 0;
		int maxValue = n[0];

		for (int i = 0; i < n.length; i++) {
			if (n[i] > maxValue) {
				maxValue = n[i];
				index = i;
			}
		}
		return new int[] { index + 1, maxValue };
	}

	public static int[] findMin(int[] n) {
		int index = 0;
		int minValue = n[0];

		for (int i = 0; i < n.length; i++) {
			if (n[i] < minValue) {
				minValue = n[i];
				index = i;
			}
		}
		return new int[] { index + 1, minValue };
	}

	public static int findNumber(int[] arr, int n) {
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				index = i;
			}
		}
		return index + 1;
	}

	public static int sumOfArrays(int[] arr) {
		int res = 0;
//		int sum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			res += arr[i];
		}
		return res;
	}

}
