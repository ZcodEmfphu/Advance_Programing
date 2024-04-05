package lab5;

public class Ex6 {
	
	public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
		int m = matrixA.length;
		int p = matrixA[0].length;
		int n = matrixB[0].length;

		int[][] result = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int sum = 0;
				for (int k = 0; k < p; k++) {
					sum += matrixA[i][k] * matrixB[k][j];
				}
				result[i][j] = sum;
			}
		}

		return result;
	}

	public static void printMatrix(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
