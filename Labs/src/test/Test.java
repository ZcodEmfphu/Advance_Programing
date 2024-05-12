package test;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {

//		double a = 7;
//		double b = 8;
//		double c = 9;

//		assertEquals(8.0, Ex1.isThan(0, 0), 0);
//		assertEquals(9.0, Ex1.isThan(a, c), 0);
	}

//	@org.junit.Test
//	public void testyear() {
//		assertEquals(true, Ex2.checkYear(1000));
//		assertEquals(false, Ex2.checkYear(2023));

//	}

	@org.junit.Test
	public void testday() {

		assertEquals(31, Ex2.checkDay(1, 2022));

	}

}
