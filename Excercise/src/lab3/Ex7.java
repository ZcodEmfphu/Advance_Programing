package lab3;

public class Ex7 {

	public static void printMultiplicationTables(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println("Bảng cửu chương " + i + ":");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printMultiplicationTables(2, 9);
	}

}
