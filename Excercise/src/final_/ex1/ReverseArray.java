package final_.ex1;

import java.util.Arrays;

public class ReverseArray {

	public int[] reverseArray(int[] arr) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[arr.length - 1 - i];
		}
		return newArr;

	}

	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		int arr[] = { 1, 2, 3, 4, 5 };
		reverseArray.reverseArray(arr);
		System.out.println(Arrays.toString(reverseArray.reverseArray(arr)));
	}

}
