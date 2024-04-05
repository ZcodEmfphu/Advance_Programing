package lab5;

public class Ex7 {
	
	public static void printPascalTriangle(int n) {
		for (int line = 0; line <= n; line++) {
			for (int i = 0; i <= line; i++) {
				System.out.print(binomialCoefficient(line, i) + " ");
			}
			System.out.println();
		}
	}

	public static int binomialCoefficient(int n, int k) {
		if (k == 0 || k == n) {
			return 1;
		} else {
			return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
		}
	}
}
