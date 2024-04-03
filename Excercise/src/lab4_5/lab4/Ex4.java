package lab4_5.lab4;

import java.util.Arrays;

public class Ex4 {

	public static int[] reverseArray(int[] arr) {
		int n = arr.length;
		int[] list = new int[n];

		for (int i = 0; i < n; i++) {
			list[i] = arr[n - 1 - i];
		}
		return list;
	}

	public static void print(int arr[]) {
		System.out.println("Array  : " + Arrays.toString(arr));
		System.out.println("Reverse: " + Arrays.toString(reverseArray(arr)));
		System.out.println("=============================");
	}

}
