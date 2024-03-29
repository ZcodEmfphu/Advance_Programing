package lab3;

public class Ex8 {

	public static int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static long calculateFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			long factorial = 1;
			for (int i = 2; i <= n; i++) {
				factorial *= i;
			}
			return factorial;
		}
	}
}
