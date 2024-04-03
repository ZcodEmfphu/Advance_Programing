package lab4_5_test.lab4;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4_5.lab4.*;

public class Ex10_Test {

	@Test
	public void testIsUpperTriangular() {
		int[][] matrix1 = { { 1, 2, 3 }, { 0, 4, 5 }, { 0, 0, 6 } };

		int[][] matrix2 = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };

		assertEquals(true, Ex10.isUpperTriangular(matrix1));
		assertEquals(false, Ex10.isUpperTriangular(matrix2));
	}

	@Test
	public void testIsSymmetric() {
		int[][] matrix1 = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };

		int[][] matrix2 = { { 1, 2, 3 }, { 2, 4, 2 }, { 3, 2, 1 } };

		assertEquals(true, Ex10.isSymmetric(matrix1));
		assertEquals(true, Ex10.isSymmetric(matrix2));
	}

	@Test
	public void testIsSymmetricAboutCenter() {
		int[][] matrix1 = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };

		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		assertEquals(false, Ex10.isSymmetricAboutCenter(matrix1));
		assertEquals(false, Ex10.isSymmetricAboutCenter(matrix2));
	}
}
