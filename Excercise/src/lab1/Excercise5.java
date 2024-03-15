package lab1;

import java.util.Scanner;

public class Excercise5 {
	int resutl;

	public static String secondToHour(int second) {

		if (second <= 60) {
			return "0h:0m:" + second + "s";
		} else if ((second / 60) <= 60) {
			return "0h:" + (second / 60) + "m:" + (second % 60) + "s";
		}
		return (second / 3600) + "h:" + ((second % 3600) / 60) + "m:" + ((second % 3600) % 60) + "s";
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the second: ");
		int second = scanner.nextInt();
		String sth = secondToHour(second);
		System.out.println("Resutl is: " + sth);
	}
}
