package test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.Ex2;

public class Ex2_Test {

	@Test
	public void isLeapYear() {
		assertFalse(Ex2.isLeapYear(1000));
		assertTrue(Ex2.isLeapYear(2024));
	}

	@Test
	public void getDayInMonth() {
		assertEquals(29, Ex2.getDayInMonth(2, 2024));
		assertEquals(28, Ex2.getDayInMonth(2, 2023));
		assertEquals(30, Ex2.getDayInMonth(6, 2024));
		assertEquals(31, Ex2.getDayInMonth(5, 2024));
	}

}
