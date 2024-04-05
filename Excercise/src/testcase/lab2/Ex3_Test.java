package testcase.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.Ex2;

public class Ex3_Test {

	@Test
	public void getDayInMonth() {
		assertEquals(29, Ex2.getDayInMonth(2, 2024));
		assertEquals(28, Ex2.getDayInMonth(2, 2023));
		assertEquals(30, Ex2.getDayInMonth(6, 2024));
		assertEquals(31, Ex2.getDayInMonth(5, 2024));
	}

}
