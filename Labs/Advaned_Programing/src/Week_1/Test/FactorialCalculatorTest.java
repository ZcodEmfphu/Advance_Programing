package Week_1.Test;

import Week_1.Labs2.FactorialCalculator;
import org.junit.Assert;
import org.junit.Test;

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