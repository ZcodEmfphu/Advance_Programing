package lab4_5_test.lab4;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4_5.lab4.Ex3;

public class Ex3_Test {

	@Test
	public void countPositiveNegativeZero() {

		int[] arr = { -2, 0, 4, -6, 0, 8, 0, -10 };
		int[] arr1 = { 0, 0, 0, 0, 0 };

		assertArrayEquals(new int[] { 3, 2, 3 }, Ex3.countPositiveNegativeZero(arr));
		assertArrayEquals(new int[] { 0, 0, 5 }, Ex3.countPositiveNegativeZero(arr1));
	}

	@Test
	public void findMaxPositiveAndMinPositive() {

		int[] arr = { -2, 0, 4, -6, 0, 8, 0, -10 };
		assertArrayEquals(new int[] { -2, 4 }, Ex3.findMaxPositiveAndMinPositive(arr));
	}

	@Test
	public void isNegativeSumEqualToPositiveSum() {
		int[] arr = { -2, 0, 4, -6, 0, 8, 0, -10 };
		int[] arr1 = { 2, 0, -4, -6, 0, 8, 0 };
		assertEquals(false, Ex3.isNegativeSumEqualToPositiveSum(arr));
		assertEquals(true, Ex3.isNegativeSumEqualToPositiveSum(arr1));

		Ex3.getNegativeNumbers(arr);
	}

	@Test
	public void getNegativeNumbers() {
		int[] arr = { -2, 0, 4, -6, 0, 8, 0, -10 };

		assertArrayEquals(new int[] { -2, -6, -10 }, Ex3.getNegativeNumbers(arr));

	}

}
