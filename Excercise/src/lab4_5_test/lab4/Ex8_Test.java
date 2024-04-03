package lab4_5_test.lab4;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4_5.lab4.*;

public class Ex8_Test {

	@Test
	public void checkPalindrome() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		assertArrayEquals(new int[] { 1, 9 }, Ex8.findMinMax(matrix));
	}

	@Test
	public void checkAlternating() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		assertEquals(45, Ex8.calculateSum(matrix));
	}

}
