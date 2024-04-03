package lab4_5.lab4;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {

	public static int[] findCountMax(int[] arr) {
		Map<Integer, Integer> countMap = new HashMap<>();
		int maxCount = 0;
		int maxElement = Integer.MIN_VALUE;

		for (int items : arr) {
			if (countMap.containsKey(items)) {
				countMap.put(items, countMap.get(items) + 1);
			} else {
				countMap.put(items, 1);
			}
		}
		for (Map.Entry<Integer, Integer> items : countMap.entrySet()) {
			int key = items.getKey();
			int value = items.getValue();
			if (value > maxCount) {
				maxCount = value;
				maxElement = key;
			}
		}
		return new int[] { maxCount, maxElement };
	}

}
