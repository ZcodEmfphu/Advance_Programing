package testcase.lab5;

import static org.junit.Assert.*;


import org.junit.Test;
import lab5.*;
public class Ex6_Test {

	@Test
	public void multiplyMatrices() {
		int[][] matrixA = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] matrixB = { { 7, 8, 9 }, { 10, 11, 12 } };

		assertArrayEquals(new int[][] { { 27, 30, 33 }, { 61, 68, 75 }, { 95, 106, 117 } },
				Ex6.multiplyMatrices(matrixA, matrixB));

	}

}
