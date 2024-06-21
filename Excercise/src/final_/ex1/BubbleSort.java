package final_.ex1;

import java.util.Arrays;

public class BubbleSort {

	public void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int arr[] = { 5, 3, 8, 4, 2 };
		bubbleSort.bubbleSort(arr);

		for (int items : arr) {
			System.out.print(items + " ");
		}
	}

}
