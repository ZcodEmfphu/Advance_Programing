package lab4_5_test.lab5;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4_5.lab5.*;

public class Ex1_Test {

	@Test
	public void findMaxValue() {

		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 9, 2, 5 }, { 3, 7, 1 }, { 8, 4, 6 } };
		int[][] matrix3 = { { -1, -4, -3, -7 }, { -9, -2, -6, -5 }, { -8, -11, -10, -12 }, { -15, -13, -14, -16 } };

		assertEquals(9, Ex1.findMaxValue(matrix1));
		assertEquals(9, Ex1.findMaxValue(matrix2));
		assertEquals(-1, Ex1.findMaxValue(matrix3));
	}

	@Test
	public void findMinValue() {

		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 9, 2, 5 }, { 3, 7, 1 }, { 8, 4, 6 } };
		int[][] matrix3 = { { -1, -4, -3, -7 }, { -9, -2, -6, -5 }, { -8, -11, -10, -12 }, { -15, -13, -14, -16 } };

		assertEquals(1, Ex1.findMinValue(matrix1));
		assertEquals(1, Ex1.findMinValue(matrix2));
		assertEquals(-16, Ex1.findMinValue(matrix3));
	}

	@Test
	public void sumMatrix() {

		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 9, 2, 5 }, { 3, 7, 1 }, { 8, 4, 6 } };
		int[][] matrix3 = { { -1, -4, -3, -7 }, { -9, -2, -6, -5 }, { -8, -11, -10, -12 }, { -15, -13, -14, -16 } };

		assertEquals(45, Ex1.sumMatrix(matrix1));
		assertEquals(45, Ex1.sumMatrix(matrix2));
		assertEquals(-136, Ex1.sumMatrix(matrix3));
	}

}
