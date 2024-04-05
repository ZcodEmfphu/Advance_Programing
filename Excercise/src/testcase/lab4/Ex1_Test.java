package testcase.lab4;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4.*;

public class Ex1_Test {

	@Test
	public void findMax() {
		int[] arr1 = { 1, 4, 6, 8, 3 };
		int[] arr2 = { -1, -4, -6, -8, 3 };
		int[] arr3 = { 0 };

		assertArrayEquals(new int[] { 4, 8 }, Ex1.findMax(arr1));
		assertArrayEquals(new int[] { 5, 3 }, Ex1.findMax(arr2));
		assertArrayEquals(new int[] { 1, 0 }, Ex1.findMax(arr3));
	}

	@Test
	public void findMin() {
		int[] arr1 = { 1, 4, 6, 8, 3 };
		int[] arr2 = { -1, -4, -6, -8, 3 };
		int[] arr3 = { 0 };

		assertArrayEquals(new int[] { 1, 1 }, Ex1.findMin(arr1));
		assertArrayEquals(new int[] { 4, -8 }, Ex1.findMin(arr2));
		assertArrayEquals(new int[] { 1, 0 }, Ex1.findMin(arr3));
	}

	@Test
	public void findNumber() {
		int[] arr1 = { 1, 4, 6, 8, 3 };
		int[] arr2 = { -1, -4, -6, -8, 3 };
		int[] arr3 = { 0 };

		assertEquals(5, Ex1.findNumber(arr1, 3));
		assertEquals(4, Ex1.findNumber(arr2, -8));
		assertEquals(1, Ex1.findNumber(arr3, 0));
	}

	@Test
	public void sumOfArrays() {
		int[] arr1 = { 1, 4, 6, 8, 3 };
		int[] arr2 = { -1, -4, -6, -8, 3 };
		int[] arr3 = { 0 };

		assertEquals(22, Ex1.sumOfArrays(arr1));
		assertEquals(-16, Ex1.sumOfArrays(arr2));
		assertEquals(0, Ex1.sumOfArrays(arr3));
	}

}
