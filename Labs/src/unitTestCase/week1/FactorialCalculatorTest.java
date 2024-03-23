package unitTestCase.week1;
import org.junit.Assert;
import org.junit.Test;

import week_1.FactorialCalculator;

import static org.junit.Assert.*;

public class FactorialCalculatorTest {

	@Test
	public void main() {
		assertEquals(6, FactorialCalculator.calculateFactorial(3));
		assertNotEquals(3, FactorialCalculator.calculateFactorial(2));
		assertEquals(1, FactorialCalculator.calculateFactorial(0));
		assertEquals(1, FactorialCalculator.calculateFactorial(1));
		assertEquals(24, FactorialCalculator.calculateFactorial(4));
	}
}