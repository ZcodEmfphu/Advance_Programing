package lab3_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import lab3.Ex9;

public class Ex9_Test {

	@Test
	public void calculateFinalAmount() {

		assertEquals(1629.0, Ex9.calculateFinalAmount(1000, 0.05, 10), 0.1);
		assertEquals(8053.0, Ex9.calculateFinalAmount(5000, 0.1, 5), 0.1);
		assertEquals(3428.0, Ex9.calculateFinalAmount(2000, 0.08, 7), 0.1);

	}

}
