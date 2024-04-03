package lab4_5.lab5;

public class Ex3 {

	public static int[][] transpose(int[][] matrix) {
		int n = matrix.length;
		int[][] transposeMatrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				transposeMatrix[j][i] = matrix[i][j];
			}
		}
		return transposeMatrix;
	}

	public static int[][] swapColumns(int[][] matrix) {
		int n = matrix.length;
		int[][] swappedMatrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				swappedMatrix[i][j] = matrix[i][n - 1 - j];
			}
		}
		return swappedMatrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
