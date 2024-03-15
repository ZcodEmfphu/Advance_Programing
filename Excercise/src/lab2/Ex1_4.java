package lab2;

import java.util.Scanner;

public class Ex1_4 {

	public static String quadraticEquationSolver(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		System.out.println(delta);
		if (delta < 0) {
			System.out.println("Phương trình vô nghiệm");
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("Phương trình có nghiệm kép x1 = x2: " + x);
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phương trình có 2 nghiệm x1: " + x1 + "\n" + "Phương trình có 2 nghiệm x2: " + x2);

		}
		return "";
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
