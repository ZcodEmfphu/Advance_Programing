package lab4_5.lab4;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static int[] countPositiveNegativeZero(int[] arr) {
		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;
		for (int items : arr) {
			if (items < 0) {
				countPositive++;
			} else if (items == 0) {
				countZero++;
			} else {
				countNegative++;
			}
		}
		return new int[] { countPositive, countNegative, countZero };

	}

	public static int[] findMaxPositiveAndMinPositive(int[] arr) {
		int maxNegative = Integer.MIN_VALUE;
		int minPositive = Integer.MAX_VALUE;

		for (int items : arr) {
			if (items > maxNegative && items < 0) {
				maxNegative = items;
			}
		}
		for (int items : arr) {
			if (items > 0 && items < minPositive) {
				minPositive = items;
			}
		}
		return new int[] { maxNegative, minPositive };
	}

	public static boolean isNegativeSumEqualToPositiveSum(int[] arr) {

		int sumNegative = 0;
		int sumPositive = 0;

		for (int items : arr) {
			if (items < 0) {
				sumNegative += items;
			}
		}
		for (int items : arr) {
			if (items > 0) {
				sumPositive += items;
			}
		}
		if (Math.abs(sumNegative) == sumPositive) {
			return true;
		} else {
			return false;
		}
	}

	public static int[] getNegativeNumbers(int[] arr) {

		int count = 0;
		for (int num : arr) {
			if (num < 0) {
				count++;
			}
		}
		int[] list = new int[count];

		int index = 0;
		for (int items : arr) {
			if (items < 0) {
				list[index] = items;
				index++;
			}
		}
		return list;

	}

}
