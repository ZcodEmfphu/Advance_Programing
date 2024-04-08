package testcase.lab6;

import static org.junit.Assert.*;

import org.junit.Test;

import lab6.*;

public class Ex1_Test {

	@Test
	public void test() {
		assertEquals("cba", Ex1.reverseString("abc"));
	}

}
