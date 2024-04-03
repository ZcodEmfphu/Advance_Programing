package lab4_5.lab5;

public class Ex1 {

	public static int findMaxValue(int[][] matrix) {
		int max = matrix[0][0];
		for (int[] row : matrix) {
			for (int value : row) {
				if (value > max) {
					max = value;
				}
			}
		}
		return max;
	}

	public static int findMinValue(int[][] matrix) {
		int min = matrix[0][0];
		for (int[] row : matrix) {
			for (int value : row) {
				if (value < min) {
					min = value;
				}
			}
		}
		return min;
	}

	public static int sumMatrix(int[][] matrix) {
		int sum = 0;
		for (int[] row : matrix) {
			for (int value : row) {
				sum += value;
			}
		}
		return sum;
	}
}
