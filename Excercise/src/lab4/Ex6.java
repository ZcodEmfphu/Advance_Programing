package lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex6 {

	public static boolean checkIncreasing(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				return false;
			}
		}
		return true;
	}

	public static int[] sortIncreasing(int[] arr) {

		List<Integer> list = new ArrayList<Integer>();

		for (int items : arr) {
			list.add(items);
		}

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (list.get(i) > list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}

		}
		int[] array = new int[list.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = list.get(i);
		}
		return array;

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 6, 1, 3 };
		int[] arr2 = { 1, 4, 6, 8, 10 };

		System.out.println(checkIncreasing(arr1));
		System.out.println(checkIncreasing(arr2));
		System.out.println(Arrays.toString(sortIncreasing(arr2)));
	}

}
