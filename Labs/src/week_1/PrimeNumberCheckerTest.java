package week_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberCheckerTest {

	@Test
	public void main() {
		// Test các trường hợp số nguyên tố
		assertTrue(PrimeNumberChecker.isPrime(2));
		assertTrue(PrimeNumberChecker.isPrime(3));
		assertTrue(PrimeNumberChecker.isPrime(5));
		assertTrue(PrimeNumberChecker.isPrime(7));
		assertTrue(PrimeNumberChecker.isPrime(11));
		assertTrue(PrimeNumberChecker.isPrime(13));
		assertTrue(PrimeNumberChecker.isPrime(17));

		// Test các trường hợp không phải số nguyên tố
		assertFalse(PrimeNumberChecker.isPrime(1));
		assertFalse(PrimeNumberChecker.isPrime(4));
		assertFalse(PrimeNumberChecker.isPrime(6));
		assertFalse(PrimeNumberChecker.isPrime(8));
		assertFalse(PrimeNumberChecker.isPrime(9));
		assertFalse(PrimeNumberChecker.isPrime(10));
		assertFalse(PrimeNumberChecker.isPrime(12));
		assertFalse(PrimeNumberChecker.isPrime(14));
	}

}