package lab3;

import java.util.Scanner;

public class Ex1 {

	public static void processIntegers(Scanner scanner) {
		int total = 0;
		int count = 0;
		Integer max = null;

		System.out.println("Nhập các số nguyên (nhập 0 để dừng):");

		while (true) {
			try {
				int num = scanner.nextInt();
				if (num == 0) {
					break;
				}
				total += num;
				count++;
				if (max == null || num > max) {
					max = num;
				}
			} catch (Exception e) {
				System.out.println("Vui lòng chỉ nhập số nguyên.");
				scanner.next();
			}
		}
		double average = count != 0 ? (double) total / count : 0;
		System.out.println("Tổng: " + total);
		System.out.println("Trung bình cộng: " + average);
		if (max != null) {
			System.out.println("Max: " + max);
		} else {
			System.out.println("None");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		processIntegers(in);
	}

}
