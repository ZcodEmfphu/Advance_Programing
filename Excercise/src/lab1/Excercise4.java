package lab1;

import java.util.Scanner;

public class Excercise4 {

	public static double diameterOfCircle(double radius) {
		return Math.PI * 2 * radius;
	}

	public static double acreageOfCircle(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = scanner.nextDouble();

		double diameter = diameterOfCircle(radius);
		double acreage = acreageOfCircle(radius);

		System.out.println("Diameter of Circle is: " + diameter + "\n" + "Acreage of Circle is: " + acreage);
		scanner.close();
	}

}
