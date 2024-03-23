package test2;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.Ex6;

public class Ex6_Test {

	@Test
	public void test() {
		assertEquals(12.0, Ex6.trianglePerimeter(3, 4, 5), 0);
		assertEquals(6.0, Ex6.triangleArea(3, 4, 5), 0);
		assertEquals(36.86989764584401, Ex6.cornerX(Ex6.cosinCornerA(3, 4, 5)), 0);
		assertEquals(53.13010235415598, Ex6.cornerX(Ex6.cosinCornerB(3, 4, 5)), 0);
		assertEquals(90.0, Ex6.cornerX(Ex6.cosinCornerC(3, 4, 5)), 0);
	}

}
