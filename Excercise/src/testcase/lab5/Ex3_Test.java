package testcase.lab5;

import static org.junit.Assert.*;
import lab5.*;
import org.junit.Test;

public class Ex3_Test {

	@Test
	public void transpose() {

		int[][] matrix1 = { { 1, 2, 3 }, { 0, 4, 5 }, { 0, 0, 6 } };
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix3 = { { 0, 2, 3 }, { 0, 0, 6 }, { 0, 0, 0 } };

		assertArrayEquals(new int[][] { { 1, 0, 0 }, { 2, 4, 0 }, { 3, 5, 6 } }, Ex3.transpose(matrix1));
		assertArrayEquals(new int[][] { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } }, Ex3.transpose(matrix2));
		assertArrayEquals(new int[][] { { 0, 0, 0 }, { 2, 0, 0 }, { 3, 6, 0 } }, Ex3.transpose(matrix3));

		System.out.println("=== matrix 1 ===");
		Ex3.printMatrix(matrix1);
		System.out.println("=== transpose 1 ===");
		Ex3.printMatrix(Ex3.transpose(matrix1));

		System.out.println("=== matrix 2 ===");
		Ex3.printMatrix(matrix2);
		System.out.println("=== transpose 2 ===");
		Ex3.printMatrix(Ex3.transpose(matrix2));

		System.out.println("=== matrix 3 ===");
		Ex3.printMatrix(matrix3);
		System.out.println("=== transpose 3 ===");
		Ex3.printMatrix(Ex3.transpose(matrix3));
	}

	@Test
	public void swapColumns() {

		int[][] matrix1 = { { 1, 2, 3 }, { 0, 4, 5 }, { 0, 0, 6 } };
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix3 = { { 0, 2, 3 }, { 0, 0, 6 }, { 0, 0, 0 } };

		assertArrayEquals(new int[][] { { 3, 2, 1 }, { 5, 4, 0 }, { 6, 0, 0 } }, Ex3.swapColumns(matrix1));
		assertArrayEquals(new int[][] { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 } }, Ex3.swapColumns(matrix2));
		assertArrayEquals(new int[][] { { 3, 2, 0 }, { 6, 0, 0 }, { 0, 0, 0 } }, Ex3.swapColumns(matrix3));

		System.out.println("=== matrix 1 ===");
		Ex3.printMatrix(matrix1);
		System.out.println("=== swapColumns 1 ===");
		Ex3.printMatrix(Ex3.swapColumns(matrix1));

		System.out.println("=== matrix 2 ===");
		Ex3.printMatrix(matrix2);
		System.out.println("=== swapColumns 2 ===");
		Ex3.printMatrix(Ex3.swapColumns(matrix2));

		System.out.println("=== matrix 3 ===");
		Ex3.printMatrix(matrix3);
		System.out.println("=== swapColumns 3 ===");
		Ex3.printMatrix(Ex3.swapColumns(matrix3));
	}
}
