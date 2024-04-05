package testcase.lab5;

import static org.junit.Assert.*;


import org.junit.Test;
import lab5.*;

public class Ex2_Test {

	@Test
	public void findMaxValue() {

		int[][] matrix1 = { { 1, 2, 3 }, { 0, 4, 5 }, { 0, 0, 6 } };
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix3 = { { 0, 2, 3 }, { 0, 0, 6 }, { 0, 0, 0 } };

		assertEquals(true, Ex2.isUpperTriangular(matrix1));
		assertEquals(false, Ex2.isUpperTriangular(matrix2));
		assertEquals(true, Ex2.isUpperTriangular(matrix3));
	}

	@Test
	public void isSymmetric() {

		int[][] matrix1 = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix3 = { { 1, 2, 3 }, { 2, 4, 2 }, { 3, 2, 1 } };

		assertEquals(true, Ex2.isSymmetric(matrix1));
		assertEquals(false, Ex2.isSymmetric(matrix2));
		assertEquals(true, Ex2.isSymmetric(matrix3));
	}

	@Test
	public void isSymmetricAcrossCenter() {

		int[][] matrix1 = { { 1, 2, 3 }, { 2, 4, 2 }, { 3, 2, 1 } };
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix3 = { { 1, 2, 3, 4 }, { 2, 5, 6, 7 }, { 3, 6, 8, 9 }, { 4, 7, 9, 10 } };

		assertEquals(true, Ex2.isSymmetricAcrossCenter(matrix1));
		assertEquals(false, Ex2.isSymmetricAcrossCenter(matrix2));
		assertEquals(false, Ex2.isSymmetricAcrossCenter(matrix3));
	}
}
