package lab2;

import java.util.Scanner;

public class Ex1 {

	public static float findMaxNumber(float a, float b) {
		if (a - b < 0)
			return b;
		if (a - b == 0)
			return a;
		else
			return a;
	}

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter number a: ");
			float a = in.nextFloat();
			System.out.println("Enter number b: ");
			float b = in.nextFloat();

			float res = findMaxNumber(a, b);
			System.out.println("The max number is: " + res);
		}

	}

}
