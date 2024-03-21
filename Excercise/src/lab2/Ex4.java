package lab2;

import java.util.Scanner;

public class Ex4 {

	public static String quadraticEquationSolver(double a, double b, double c) {
		double delta = (b * b) - (4 * a * c);
		if (delta < 0) {
			return "None";
		} else if (delta == 0) {
			double x = -b / (2 * a);
			return "x1=x2=" + x;
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			String s = String.format("x1=%.1f x2=%.1f", x1, x2);
			return s;
		}
	}

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			Scanner in = new Scanner(System.in);

			System.out.println("Enter a: ");
			Double a = in.nextDouble();
			System.out.println("Enter b: ");
			Double b = in.nextDouble();
			System.out.println("Enter c: ");
			Double c = in.nextDouble();

			String s = quadraticEquationSolver(a, b, c);
			System.out.println(s);
		}
	}

}
