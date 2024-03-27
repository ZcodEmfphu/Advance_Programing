package lab3;

public class Ex4 {

	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int findLCM(int a, int b) {
		return (a * b) / findGCD(a, b);
	}

	public static String findGCDALCM(int a, int b) {
		int gcd = findGCD(a, b);
		int lcm = findLCM(a, b);
		return "GCD: " + gcd + " LCM: " + lcm;
	}

	public static void main(String[] args) {
		System.out.println(findGCDALCM(30, 40));
		findGCDALCM(30, 40);
	}

}
