package testcase.lab4;

import static org.junit.Assert.*;


import org.junit.Test;

import lab4.*;

public class Ex9_Test {

	@Test
	public void checkPalindrome() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		assertArrayEquals(new int[] { 6, 15, 24 }, Ex9.calculateRowSums(matrix));
	}

	@Test
	public void checkAlternating() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] rowSums = Ex9.calculateRowSums(matrix);

		assertEquals(2, Ex9.findMaxRowIndex(rowSums));
	}

}
