package week_1;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();

		boolean prim = isPrime(num);
		System.out.println("The number: " + num + " is Prime : " + prim);
		scanner.close();

	}
}
