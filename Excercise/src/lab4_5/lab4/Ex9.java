package lab4_5.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex9 {

	public static int[] calculateRowSums(int[][] matrix) {
		int n = matrix.length;
		int[] rowSums = new int[n];

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += matrix[i][j];
			}
			rowSums[i] = sum;
		}

		return rowSums;
	}

	public static int findMaxRowIndex(int[] rowSums) {
		int maxRowIndex = 0;
		int maxRowSum = rowSums[0];

		for (int i = 1; i < rowSums.length; i++) {
			if (rowSums[i] > maxRowSum) {
				maxRowSum = rowSums[i];
				maxRowIndex = i;
			}
		}

		return maxRowIndex;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.toString(calculateRowSums(matrix)));

	}
}
