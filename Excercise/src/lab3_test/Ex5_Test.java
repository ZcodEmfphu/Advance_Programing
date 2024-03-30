package lab3_test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import lab3.Ex5;

public class Ex5_Test {

	@Test
	public void findLargestOddDivisor() {

		assertEquals(7, Ex5.findLargestOddDivisor(49));
		assertEquals(9, Ex5.findLargestOddDivisor(36));
		assertEquals(1, Ex5.findLargestOddDivisor(17));
	}

	@Test
	public void checkPrime() {

		assertEquals(true, Ex5.checkPrime(17));
		assertEquals(false, Ex5.checkPrime(1));
		assertEquals(false, Ex5.checkPrime(-7));
		assertEquals(false, Ex5.checkPrime(0));
	}

	@Test
	public void primeFactorization() {

		int[] arr1 = { 17 };
		int[] arr2 = { 2, 2, 3, 3 };
		int[] arr3 = {};

		assertArrayEquals(arr1, Ex5.primeFactorization(17));
		assertArrayEquals(arr2, Ex5.primeFactorization(36));
		assertArrayEquals(arr3, Ex5.primeFactorization(0));

	}

	@Test
	public void findAllPrimeNumbersLowerThan() {

		int[] arr1 = { 2, 3, 5, 7, 11, 13, 17, 19 };
		int[] arr2 = { 2, 3, 5, 7 };
		int[] arr3 = {};

		assertArrayEquals(arr1, Ex5.findAllPrimeNumbersLowerThan(20));
		assertArrayEquals(arr2, Ex5.findAllPrimeNumbersLowerThan(10));
		assertArrayEquals(arr3, Ex5.findAllPrimeNumbersLowerThan(2));
		assertArrayEquals(arr3, Ex5.findAllPrimeNumbersLowerThan(-14));
	}

}





















