package testcase.lab4;

import static org.junit.Assert.*;


import org.junit.Test;
import lab4.*;

public class Ex6_Test {

	@Test
	public void checkIncreasing() {
		int[] arr1 = { 1, 4, 6, 8, 3 };
		int[] arr2 = { 1, 4, 6, 8 };
		int[] arr3 = { 0 };

		assertEquals(false, Ex6.checkIncreasing(arr1));
		assertEquals(true, Ex6.checkIncreasing(arr2));
		assertEquals(true, Ex6.checkIncreasing(arr3));
	}

	@Test
	public void sortIncreasing() {
		int[] arr1 = { 1, 4, 6, 1, 3 };
		int[] arr2 = { -1, -4, -6, 3 };
		int[] arr3 = { 0 };

		assertArrayEquals(new int[] { 1, 1, 3, 4, 6 }, Ex6.sortIncreasing(arr1));
		assertArrayEquals(new int[] { -6, -4, -1, 3 }, Ex6.sortIncreasing(arr2));
		assertArrayEquals(new int[] { 0 }, Ex6.sortIncreasing(arr3));

	}

}
