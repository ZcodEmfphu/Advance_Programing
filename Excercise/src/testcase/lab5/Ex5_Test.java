package testcase.lab5;

import static org.junit.Assert.*;


import org.junit.Test;
import lab5.*;
public class Ex5_Test {

	@Test
	public void addMatrices() {
		double[][] matrixA = { { 1.5, 2.5, 3.5 }, { 4.5, 5.5, 6.5 }, { 7.5, 8.5, 9.5 } };
		double[][] matrixB = { { 0.5, 1.5, 2.5 }, { 3.5, 4.5, 5.5 }, { 6.5, 7.5, 8.5 } };

		assertArrayEquals(new double[][] { { 2.0, 4.0, 6.0 }, { 8.0, 10.0, 12.0 }, { 14.0, 16.0, 18.0 } },
				Ex5.addMatrices(matrixA, matrixB));
	}

	@Test
	public void subtractMatrices() {
		double[][] matrixA = { { 1.5, 2.5, 3.5 }, { 4.5, 5.5, 6.5 }, { 7.5, 8.5, 9.5 } };
		double[][] matrixB = { { 0.5, 1.5, 2.5 }, { 3.5, 4.5, 5.5 }, { 6.5, 7.5, 8.5 } };

		assertArrayEquals(new double[][] { { 1.0, 1.0, 1.0 }, { 1.0, 1.0, 1.0 }, { 1.0, 1.0, 1.0 } },
				Ex5.subtractMatrices(matrixA, matrixB));

	}

}
