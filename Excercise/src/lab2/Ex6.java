package lab2;

import java.util.Scanner;

public class Ex6 {

	public static boolean checkTriangle(double a, double b, double c) {
		if (a + b > c && a + c > b && c + b > a)
			return true;
		else {
			return false;
		}
	}

	public static double trianglePerimeter(double a, double b, double c) {
		return a + b + c;
	}

	public static double triangleArea(double a, double b, double c) {
		double p = trianglePerimeter(a, b, c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public static double cosinCornerA(double a, double b, double c) {
		return (b * b + c * c - a * a) / (2 * b * c);
	}

	public static double cosinCornerB(double a, double b, double c) {
		return (a * a + c * c - b * b) / (2 * a * c);
	}

	public static double cosinCornerC(double a, double b, double c) {
		return (b * b + a * a - c * c) / (2 * b * a);
	}

	public static double tgCornerX(double cosX) {
		return Math.sqrt((1 / (cosX * cosX)) - 1);
	}

	public static double cornerX(double cosX) {		
		return Math.atan(tgCornerX(cosX)) * 180 / Math.PI;
	}

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			Scanner in = new Scanner(System.in);

			System.out.println("Enter a: ");
			int a = in.nextInt();
			System.out.println("Enter b: ");
			int b = in.nextInt();
			System.out.println("Enter c: ");
			int c = in.nextInt();

			if (checkTriangle(a, b, c) == true) {
				double p = trianglePerimeter(a, b, c);
				System.out.println("Triangle Perimeter: " + p);
				double s = triangleArea(a, b, c);
				System.out.println("Triangle Area: " + s);
				double cosA = cosinCornerA(a, b, c);
				double cosB = cosinCornerB(a, b, c);
				double cosC = cosinCornerC(a, b, c);

				System.out.println("Corner A: " + cornerX(cosA));
				System.out.println("Corner B: " + cornerX(cosB));
				System.out.println("Corner C: " + cornerX(cosC));
			}

		}

	}
}
