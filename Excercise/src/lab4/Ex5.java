package lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex5 {

	public static boolean contains(int x, int[] arr) {

		for (int items : arr) {
			if (items == x) {
				return true;
			}
		}
		return false;
	}

	public static String findOccurrences(int[] arr, int x) {
		int countX = 0;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				countX++;
				list.add(i + 1);
			}
		}
		return "CountX: " + countX + " Pos: " + list;
	}

	public static int[] removeElements(int[] arr, int x) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != x) {
				list.add(arr[i]);
			}
		}
		int[] array = new int[list.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = list.get(i);
		}
		return array;
	}

	public static int[] removeElements2(int[] arr, int x) {
		int count = 0;
		for (int items : arr) {
			if (items != x) {
				count++;
			}
		}
		int[] list = new int[count];
		int index = 0;
		for (int i : arr) {
			if (i != x) {
				list[index] = i;
				index++;
			}

		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 6, 1, 3 };

		System.out.println(findOccurrences(arr1, 1));
		System.out.println(Arrays.toString(removeElements(arr1, 1)));
		System.out.println(Arrays.toString(removeElements2(arr1, 1)));
	}
}
