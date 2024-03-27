package lab3;

import java.util.Scanner;

public class Ex2 {

	public static int countDigits(int number) {
		if (number == 0) {
			return 1;
		}
		int count = 0;
		while (number != 0) {
			number /= 10;
			count++;
		}
		return count;
	}

	public static int reverseNumber(int number) {
		int reversed = 0;
		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
		}
		return reversed;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter countDigits: ");
		int number = in.nextInt();
		int countDigits = countDigits(number);
		int reverseNumber = reverseNumber(number);

		System.out.println("Count Digit: " + countDigits + "\nReverse number: " + reverseNumber);
	}
}
