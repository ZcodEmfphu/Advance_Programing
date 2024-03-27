package test3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import lab3.Ex2;

public class Ex2_Test {

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
}
