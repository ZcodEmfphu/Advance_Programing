package lab5;

public class Ex2 {

	public static boolean isUpperTriangular(int[][] matrix) {
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				if (matrix[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isSymmetric(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isSymmetricAcrossCenter(int[][] matrix) {
		int n = matrix.length;
		if (n % 2 == 0) {
			return false;
		}
		int center = n / 2;
		for (int i = 0; i < center; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] != matrix[n - 1 - i][n - 1 - j]) {
					return false;
				}
			}
		}
		return true;
	}
}
