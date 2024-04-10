package lab6;

public class Ex14 {
	
	public static String removeWhiteSpaces(String str) {
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (!Character.isWhitespace(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
