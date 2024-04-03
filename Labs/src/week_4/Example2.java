package week_4;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void countCharacters(String str) {

		Map<Character, Integer> charsCountMap = new HashMap<>();
		char[] chars = str.toCharArray();

		for (char items : chars) {
			if (charsCountMap.containsKey(items)) {
				charsCountMap.put(items, charsCountMap.get(items) + 1);
			} else {
				charsCountMap.put(items, 1);
			}
		}
		for (Map.Entry<Character, Integer> items : charsCountMap.entrySet()) {
			System.out.println("Character: " + items.getKey() + ", Count: " + items.getValue());
		}
	}

}
