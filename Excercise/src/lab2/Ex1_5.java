package lab2;

import java.util.Scanner;

public class Ex1_5 {

	public static int calculateIntersectionLength(int a1, int b1, int a2, int b2) {
		int endIntersection = Math.min(b1, b2);
		int startIntersection = Math.max(a1, a2);

		if (startIntersection - endIntersection > 0) {
			return 0;
		}
		return endIntersection - startIntersection;
	}

	public static int calculateUnionLength(int a1, int b1, int a2, int b2) {
		int intersectionLength = calculateIntersectionLength(a1, b1, a2, b2);
		return (b1 - a1) + (b2 - a2) - intersectionLength;
	}

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			Scanner in = new Scanner(System.in);

			System.out.println("Enter a1: ");
			int a1 = in.nextInt();
			System.out.println("Enter b1: ");
			int b1 = in.nextInt();
			System.out.println("Enter a2: ");
			int a2 = in.nextInt();
			System.out.println("Enter b2: ");
			int b2 = in.nextInt();

			int intersectionLength = calculateIntersectionLength(a1, b1, a2, b2);
			int unionLength = calculateUnionLength(a1, b1, a2, b2);

			System.out.println("Độ dài phần giao: " + intersectionLength);
			System.out.println("Độ dài phần hợp: " + unionLength);
		}
	}

}