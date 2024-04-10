package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ex7 {

	public static String findSecondMostFrequentChar(String str) {
		Map<Character, Integer> charFrequencyMap = new HashMap<>();

		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
			}
		}

		int maxFrequency = Integer.MIN_VALUE;
		int secondMaxFrequency = Integer.MIN_VALUE;
		char secondMostFrequentChar = '\0';

		for (Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
			int frequency = entry.getValue();
			if (frequency > maxFrequency) {
				secondMaxFrequency = maxFrequency;
				maxFrequency = frequency;
			} else if (frequency > secondMaxFrequency && frequency != maxFrequency) {
				secondMaxFrequency = frequency;
				secondMostFrequentChar = entry.getKey();
			}
		}

		String secondMostFrequent = Character.toString(secondMostFrequentChar);

		return secondMostFrequent;
	}

	public static void main(String[] args) {
		String inputString = "Phú";
		String secondMostFrequent = findSecondMostFrequentChar(inputString);
		System.out.println("Ký tự thứ hai xuất hiện nhiều nhất: " + secondMostFrequent);
	}
}
