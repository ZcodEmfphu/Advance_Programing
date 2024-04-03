package lab4_5.lab5;

public class Ex5 {

	public static double[][] addMatrices(double[][] matrixA, double[][] matrixB) {
		int n = matrixA.length;
		double[][] result = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		return result;
	}

	public static double[][] subtractMatrices(double[][] matrixA, double[][] matrixB) {
		int n = matrixA.length;
		double[][] result = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = matrixA[i][j] - matrixB[i][j];
			}
		}
		return result;
	}

	public static void printMatrix(double[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
