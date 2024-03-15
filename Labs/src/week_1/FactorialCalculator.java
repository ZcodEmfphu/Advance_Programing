package week_1;

import java.util.Scanner;

public class FactorialCalculator {

	// Tính giai thừa của một số nguyên cho trước
	public static int calculateFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * calculateFactorial(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int n = scanner.nextInt();

		int factorial = calculateFactorial(n);
		System.out.println("The factorial is " + factorial);
		scanner.close();
	}
}
