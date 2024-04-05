package testcase.lab4;

import static org.junit.Assert.*;


import org.junit.Test;

import lab4.*;

public class Ex7_Test {

	@Test
	public void checkPalindrome() {
		int[] arr1 = { -1, 4, -6, 4, -1 };
		int[] arr2 = { 1, 4, 6, 8 };
		int[] arr3 = { 0 };

		assertEquals(true, Ex7.checkPalindrome(arr1));
		assertEquals(false, Ex7.checkPalindrome(arr2));
	}

	@Test
	public void checkAlternating() {
		int[] arr1 = { -1, 4, -6, 4, -1 };
		int[] arr2 = { 1, 4, 6, 8 };
		int[] arr3 = { 0 };

		assertEquals(true, Ex7.checkAlternating(arr1));
		assertEquals(false, Ex7.checkAlternating(arr2));
	}

}
