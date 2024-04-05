package testcase.lab4;

import static org.junit.Assert.*;


import org.junit.Test;

import lab4.*;

public class Ex4_Test {

	@Test
	public void reverseArray() {
		int[] arr1 = { 1, 4, 6, 8, 3 };
		int[] arr2 = { -1, -4, -6, -8, 3 };
		int[] arr3 = { 0 };

		assertArrayEquals(new int[] { 3, 8, 6, 4, 1 }, Ex4.reverseArray(arr1));
		assertArrayEquals(new int[] { 3, -8, -6, -4, -1 }, Ex4.reverseArray(arr2));
		
		Ex4.print(arr1);
		Ex4.print(arr2);

	}

}
