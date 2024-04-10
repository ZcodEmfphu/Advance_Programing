package lab6;

public class Ex10 {

	public static boolean containsOnlyDigits(String str) {

		for (int i = 0; i < str.length(); i++) {

			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}

		return true;
	}

}
