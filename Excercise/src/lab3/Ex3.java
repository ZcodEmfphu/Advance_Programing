package lab3;

public class Ex3 {

	public static int calculateYearsToDoubleAge(int dadOld, int sonOld) {
		int year = 0;

		while (dadOld > 2 * sonOld) {
			dadOld++;
			sonOld++;
			year++;
		}

		return year;
	}

	public static void main(String[] args) {
		System.out.println(calculateYearsToDoubleAge(35, 4));
	}
}
