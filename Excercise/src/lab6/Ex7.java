package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ex7 {

	public static char findSecondMostFrequentChar(String str) {
		Map<Character, Integer> charFrequencyMap = new HashMap<>();

		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
			}
		}

		int maxFrequency = 0;
		int secondMaxFrequency = 0;
		char secondMostFrequentChar = '\u0000';

		for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
			int frequency = entry.getValue();
			if (frequency > maxFrequency) {
				secondMaxFrequency = maxFrequency;
				maxFrequency = frequency;
			} else if (frequency > secondMaxFrequency) {
				secondMaxFrequency = frequency;
				secondMostFrequentChar = entry.getKey();
			}
		}

		return secondMostFrequentChar;
	}

	public static void main(String[] args) {
		String inputString = "Lê Khánh Vănh";
		char secondMostFrequent = findSecondMostFrequentChar(inputString);
		System.out.println("Ký tự thứ hai xuất hiện nhiều nhất: " + secondMostFrequent);
	}
}
