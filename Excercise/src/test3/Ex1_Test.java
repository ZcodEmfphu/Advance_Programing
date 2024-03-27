package test3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import lab3.Ex1;

public class Ex1_Test {

	@Test
	public void testCalculateIntegers() {

		int[] arr1 = { 5, 7, 2, 10, 8 };
		int[] arr2 = { -3, -8, -1 };
		int[] arr3 = { 0 };
		int[] arr4 = {};

		assertEquals("32 6.4 10", Ex1.calculateIntegers(arr1));
		assertEquals("-12 -4.0 -1", Ex1.calculateIntegers(arr2));
		assertEquals("0 0.0 0", Ex1.calculateIntegers(arr3));
		assertEquals("Array empty", Ex1.calculateIntegers(arr4));
	}

}
