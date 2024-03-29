package lab3;

public class Ex6 {

	public static void printTrigValues() {
		for (int degrees = 0; degrees <= 90; degrees += 5) {
			double radians = Math.toRadians(degrees);
			double sinValue = Math.sin(radians);
			double cosValue = Math.cos(radians);
			double tanValue;
			double cotValue;

			if (degrees % 90 != 0) {
				tanValue = Math.tan(radians);
				cotValue = 1 / tanValue;
			} else {
				tanValue = Double.POSITIVE_INFINITY;
				cotValue = Double.POSITIVE_INFINITY;
			}

			System.out.println("Góc: " + degrees + " độ");
			System.out.println("sin(" + degrees + ") = " + sinValue);
			System.out.println("cos(" + degrees + ") = " + cosValue);
			System.out.println("tan(" + degrees + ") = " + tanValue);
			System.out.println("cot(" + degrees + ") = " + cotValue);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printTrigValues();
	}

}
