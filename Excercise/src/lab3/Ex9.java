package lab3;

public class Ex9 {

	public static double calculateFinalAmount(double P, double r, int n) {
		double F = P * Math.pow(1 + r, n);
		return Math.round(F);
	}
}
