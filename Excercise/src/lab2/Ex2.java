package lab2;

import java.util.Scanner;

public class Ex2 {

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static int getDayInMonth(int month, int year) {
		if (month == 2) {
			if (isLeapYear(year) == true) {
				return 29;
			} else {
				return 28;
			}
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else {
			return 31;
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			Scanner in = new Scanner(System.in);

			System.out.println("Enter year: ");
			int year = in.nextInt();

			Boolean res = isLeapYear(year);
			System.out.println("The year is leap year: " + res);

			System.out.println("Enter month: ");
			int month = in.nextInt();
			System.out.println("Enter year: ");
			int year1 = in.nextInt();
			int res1 = getDayInMonth(month, year);
			System.out.println("The day of " + month + "/" + year1 + " is: " + res1);
		}

	}
}
