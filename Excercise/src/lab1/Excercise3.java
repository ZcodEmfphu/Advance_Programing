package lab1;

import java.util.Scanner;

public class Excercise3 {

	public static double mileToKm(double num) {
		return num * 1609;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		double km = mileToKm(num);
		System.out.println("Translate " + num + " mile = " + km + "km.");
		scanner.close();
	}

}
