package Week_1.Test;

import Week_1.Labs1.NumberAdder;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberAdderTest {

    @Test
    public void main() {
        assertEquals(5, NumberAdder.addNumbers(2, 3));
        assertEquals(-10, NumberAdder.addNumbers(-5, -5));
        assertEquals(0, NumberAdder.addNumbers(0, 0));
        assertEquals(100, NumberAdder.addNumbers(50, 50));
    }
}