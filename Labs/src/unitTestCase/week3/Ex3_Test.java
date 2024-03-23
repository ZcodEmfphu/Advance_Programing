package unitTestCase.week3;

import static org.junit.Assert.*;

import org.junit.Test;

import week_3.Example3;

public class Ex3_Test {

	@Test
	public void test() {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 5, 2, 1, 9, 8, 12 };
		int[] arr3 = { 0 };

		Example3.reverseArray(arr1);
		Example3.reverseArray(arr2);
		Example3.reverseArray(arr3);

		assertArrayEquals(new int[] { 3, 2, 1 }, arr1);
		assertArrayEquals(new int[] { 12, 8, 9, 1, 2, 5 }, arr2);
		assertArrayEquals(new int[] { 0 }, arr3);
	}

}
