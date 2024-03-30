package lab3_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lab3.Ex8;

public class Ex8_Test {

	@Test
	public void calculateSum() {

		assertEquals(45, Ex8.calculateSum(9));
		assertEquals(1, Ex8.calculateSum(1));
		assertEquals(0, Ex8.calculateSum(0));
	}

	@Test
	public void calculateFactorial() {

		assertEquals(362880, Ex8.calculateFactorial(9));
		assertEquals(1, Ex8.calculateFactorial(1));
		assertEquals(1, Ex8.calculateFactorial(0));
	}

}
