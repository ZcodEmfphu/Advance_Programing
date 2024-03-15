package lab1;

import java.util.Scanner;

public class Excercise1 {

	public static double inputNumber(int x, double y) {
		return x * y;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input one integer and one floating-point number: ");

		System.out.println("Enter one integer number: ");
		int x = scanner.nextInt();

		System.out.println("Enter one floating-point number: ");
		double y = scanner.nextDouble();

		double num = inputNumber(x, y);
		
		System.out.println("Input value are " + x + " and " + y + " their product is " + num);
		scanner.close();
	}

}
