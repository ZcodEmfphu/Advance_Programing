package unitTestCase.week3;

import static org.junit.Assert.*;

import org.junit.Test;

import week_3.Example2;

public class Ex2_Test {

	@Test
	public void testFindMax() {
		assertEquals(1, Example2.findMax(new int[] { 1, 1, 1, 1, 1, 1 }));
		assertEquals(10, Example2.findMax(new int[] { 10, 7, 2, 6, 9, 5 }));
		assertEquals(-1, Example2.findMax(new int[] { -9, -6, -1, -17 }));
		assertEquals(0, Example2.findMax(new int[] {0}));
	}

}
