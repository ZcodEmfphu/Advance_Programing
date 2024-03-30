package lab3_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lab3.Ex1;
import lab3.Ex2;
import lab3.Ex3;
import lab3.Ex4;

public class Ex3_Test {

	@Test
	public void calculateYearsToDoubleAge() {

		assertEquals(27, Ex3.calculateYearsToDoubleAge(35, 4));
	}

}
