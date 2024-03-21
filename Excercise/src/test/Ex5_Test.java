package test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.Ex5;

public class Ex5_Test {

	@Test
	public void calculateIntersectionLength() {
		assertEquals(0, Ex5.calculateIntersectionLength(3, 4, 4, 3));
		assertEquals(4, Ex5.calculateIntersectionLength(4, 8, 4, 9));
		assertEquals(6, Ex5.calculateIntersectionLength(-3, 4, -4, 3));
	}

	public void calculateUnionLength() {
		assertEquals(0, Ex5.calculateUnionLength(3, 4, 4, 3));
		assertEquals(5, Ex5.calculateUnionLength(4, 8, 4, 9));
		assertEquals(8, Ex5.calculateUnionLength(-3, 4, -4, 3));
	}
}