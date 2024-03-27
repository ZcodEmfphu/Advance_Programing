package test3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lab3.Ex1;
import lab3.Ex2;
import lab3.Ex3;
import lab3.Ex4;

public class Ex6_Test {

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

	@Test
	public void testCountDigits() {

		assertEquals(5, Ex2.countDigits(12345));
		assertEquals(1, Ex2.countDigits(9));
		assertEquals(6, Ex2.countDigits(-987654));
		assertEquals(1, Ex2.countDigits(-3));
		assertEquals(1, Ex2.countDigits(0));

	}

	@Test
	public void testReverseNumber() {

		assertEquals(54321, Ex2.reverseNumber(12345));
		assertEquals(9, Ex2.reverseNumber(9));
		assertEquals(-456789, Ex2.reverseNumber(-987654));
		assertEquals(-3, Ex2.reverseNumber(-3));
		assertEquals(0, Ex2.reverseNumber(0));
	}

	@Test
	public void calculateYearsToDoubleAge() {

		assertEquals(27, Ex3.calculateYearsToDoubleAge(35, 4));
	}

	@Test
	public void findGCDALCM() {

		assertEquals("GCD: 6 LCM: 36", Ex4.findGCDALCM(12, 18));
		assertEquals("GCD: 7 LCM: 140", Ex4.findGCDALCM(35, 28));
		assertEquals("GCD: 1 LCM: 731", Ex4.findGCDALCM(17, 43));
	}

}
