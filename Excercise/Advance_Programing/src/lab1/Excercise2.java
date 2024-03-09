package lab1;

import java.util.Scanner;

public class Excercise2 {

	public static int solveEquation(int x) {
		return 4 * (x - 3) + 20;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number x: ");
		int x = scanner.nextInt();
		int y = solveEquation(x);

		System.out.println("Result of euquation 4*(" + x + "-3)+20 is: " + y);
		scanner.close();
	}
}
