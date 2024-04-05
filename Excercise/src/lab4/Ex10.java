package lab4;

public class Ex10 {

	public static boolean isUpperTriangular(int[][] matrix) {
		int n = matrix.length;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (matrix[i][j] != 0) {
					return false;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (matrix[i][i] != 0) {
				return true;
			}
		}
		return false;
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

	public static boolean isSymmetricAboutCenter(int[][] matrix) {
		int n = matrix.length;
		// Kiểm tra có đối xứng qua tâm không
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] != matrix[n - i - 1][n - j - 1]) {
					return false;
				}
			}
		}
		return true;
	}
}
