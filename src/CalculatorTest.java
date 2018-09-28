import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void sumMethodTest() {
        Calculator c = new Calculator();
        int expectedSum = 4;
        int actualSum = c.sum(2, 2);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void difMethodTest() {
        Calculator c = new Calculator();
        int expectedSum = 0;
        int actualSum = c.diff(2, 2);

        assertEquals(expectedSum, actualSum);
    }
}