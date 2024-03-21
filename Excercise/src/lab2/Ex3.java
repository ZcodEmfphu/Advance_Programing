package lab2;

import java.util.Scanner;

public class Ex3 {

	// ax+b=0
	public static double solveLinearEquation(double a, double b) {
		if (a == 0) {
			return 0;
		} else {
			return -b / a;
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			Scanner in = new Scanner(System.in);

			System.out.println("Enter a: ");
			Double a = in.nextDouble();
			System.out.println("Enter b: ");
			Double b = in.nextDouble();

			Double res = solveLinearEquation(a, b);
			System.out.println("The Equation of " + a + "x+" + b + "=0 is: " + res);
		}
	}

}
