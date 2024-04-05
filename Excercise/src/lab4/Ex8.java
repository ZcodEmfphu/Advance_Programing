package lab4;

public class Ex8 {

	public static int findMaxElement(int[][] matrix) {
		int max = matrix[0][0];
		for (int[] row : matrix) {
			for (int element : row) {
				if (element > max) {
					max = element;
				}
			}
		}
		return max;
	}

	public static int findMinElement(int[][] matrix) {
		int min = matrix[0][0];
		for (int[] row : matrix) {
			for (int element : row) {
				if (element < min) {
					min = element;
				}
			}
		}
		return min;
	}

	public static int[] findMinMax(int[][] matrix) {
		int min = findMinElement(matrix);
		int max = findMaxElement(matrix);

		return new int[] { min, max };
	}

	public static int calculateSum(int[][] matrix) {
		int sum = 0;
		for (int[] row : matrix) {
			for (int element : row) {
				sum += element;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

	}
}
