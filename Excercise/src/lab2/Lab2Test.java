package lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lab2Test {

	@Test
	public void test() {

		// find max
		assertEquals(3.0, Ex1_1.findMaxNumber(2, 3), 0);
		assertEquals(2.0, Ex1_1.findMaxNumber(2, -3), 0);
		assertEquals(2.32f, Ex1_1.findMaxNumber(2.31f, 2.32f), 0);
		assertEquals(3.0, Ex1_1.findMaxNumber(3, 3), 0);

		// isLeapYear
		assertFalse(Ex1_2.isLeapYear(1000));
		assertTrue(Ex1_2.isLeapYear(2024));

		// day of month/year
		assertEquals(29, Ex1_2.getDayInMonth(2, 2024));
		assertEquals(28, Ex1_2.getDayInMonth(2, 2023));
		assertEquals(30, Ex1_2.getDayInMonth(6, 2024));
		assertEquals(31, Ex1_2.getDayInMonth(5, 2024));
		
		
	}

}
