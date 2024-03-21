package lab2;

public class Ex7 {

	public static String checkTriagle(double a, double b, double c) {
		String resutl = "Không phải Tam Giác";
		if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
			if (a == b && b == c) {
				return "Tam giác đều";
			} else if (a == b || b == c || a == c) {
				return "Tam giác cân";
			} else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
				return "Tam giác vuông";
			} else {
				return "Tam giác thường";
			}
		}
		return resutl;
	}

}
