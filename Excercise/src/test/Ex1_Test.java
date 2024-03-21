package test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.Ex1;

public class Ex1_Test {

	@Test
	public void findMaxNumber() {
		assertEquals(3.0, Ex1.findMaxNumber(2, 3), 0);
		assertEquals(2.0, Ex1.findMaxNumber(2, -3), 0);
		assertEquals(2.32f, Ex1.findMaxNumber(2.31f, 2.32f), 0);
		assertEquals(3.0, Ex1.findMaxNumber(3, 3), 0);
	}

}
