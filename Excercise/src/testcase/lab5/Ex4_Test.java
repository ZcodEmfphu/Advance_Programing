package testcase.lab5;

import static org.junit.Assert.*;


import org.junit.Test;
import lab5.*;

public class Ex4_Test {

	@Test
	public void sumRows() {

		int[][] matrix1 = { { 1, 2, 3 }, { 0, 4, 5 }, { 0, 0, 6 } };
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix3 = { { 0, 2, 3 }, { 0, 0, 6 }, { 0, 0, 0 } };

		assertArrayEquals(new int[] { 6, 9, 6 }, Ex4.sumRows(matrix1));
		assertArrayEquals(new int[] { 6, 15, 24 }, Ex4.sumRows(matrix2));
		assertArrayEquals(new int[] { 5, 6, 0 }, Ex4.sumRows(matrix3));
	}

	@Test
	public void findMaxSumRowIndex() {

		int[][] matrix1 = { { 1, 2, 3 }, { 0, 4, 5 }, { 0, 0, 6 } };
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix3 = { { 0, 2, 3 }, { 0, 0, 6 }, { 0, 0, 0 } };

		assertEquals(1, Ex4.findMaxSumRowIndex(Ex4.sumRows(matrix1)));
		assertEquals(2, Ex4.findMaxSumRowIndex(Ex4.sumRows(matrix2)));
		assertEquals(1, Ex4.findMaxSumRowIndex(Ex4.sumRows(matrix3)));
	}
}
