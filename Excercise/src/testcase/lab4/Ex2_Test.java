package testcase.lab4;

import static org.junit.Assert.*;


import org.junit.Test;

import lab4.*;

public class Ex2_Test {

	@Test
	public void findCountMax() {
		int[] arr1 = { 1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 8, 8, 8, 8 };
		int[] arr2 = { 1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6 };
		
		assertArrayEquals(new int[] { 4, 8 }, Ex2.findCountMax(arr1));
		assertArrayEquals(new int[] { 4, 6 }, Ex2.findCountMax(arr2));
	}

}
