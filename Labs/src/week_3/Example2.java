package week_3;

import java.util.Scanner;

public class Example2 {

	public static int findMax(int[] arr) {
		if (arr.length == 0) {
			throw new IllegalArgumentException("Array not empty !");
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter element of Array: ");
		int n = in.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println(i + 1 + ". Enter your number: ");
			arr[i] = in.nextInt();
		}

		int max = Example2.findMax(arr);
		System.out.println("The max element of Arrays is: " + max);
		in.close();
	}

}
