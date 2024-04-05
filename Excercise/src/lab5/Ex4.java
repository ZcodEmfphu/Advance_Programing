package lab5;

public class Ex4 {

	public static int[] sumRows(int[][] matrix) {
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

	public static int findMaxSumRowIndex(int[] rowSums) {
		int maxSum = rowSums[0];
		int maxSumRowIndex = 0;
		for (int i = 1; i < rowSums.length; i++) {
			if (rowSums[i] > maxSum) {
				maxSum = rowSums[i];
				maxSumRowIndex = i;
			}
		}
		return maxSumRowIndex;
	}
	
}
