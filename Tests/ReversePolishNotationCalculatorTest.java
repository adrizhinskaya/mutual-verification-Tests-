import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
    @Test
    public void testSumOperations() {
        int result = calculator.calculatePolishNotation("8 2 2 + +");
        assertEquals(12, result);
        result = calculator.calculatePolishNotation("8 2 + 2 +");
        assertEquals(12, result);
    }

    @Test
    public void testSubOperations() {
        int result = calculator.calculatePolishNotation("8 2 - 2 -");
        assertEquals(4, result);
        result = calculator.calculatePolishNotation("8 2 2 - -");
        assertEquals(8, result);
    }

    @Test
    public void testMulOperations() {
        int result = calculator.calculatePolishNotation("8 2 * 2 *");
        assertEquals(32, result);
        result = calculator.calculatePolishNotation("8 2 2 * *");
        assertEquals(32, result);
    }

    @Test
    public void testSumAndSubOperations() {
        int result = calculator.calculatePolishNotation("8 2 + 2 -");
        assertEquals(8, result);
        result = calculator.calculatePolishNotation("8 2 2 - +");
        assertEquals(8, result);
    }

    @Test
    public void testSumAndMulOperations() {
        int result = calculator.calculatePolishNotation("8 2 + 2 *");
        assertEquals(20, result);
        result = calculator.calculatePolishNotation("8 2 2 * +");
        assertEquals(12, result);
    }

    @Test
    public void testSubAndMulOperations() {
        int result = calculator.calculatePolishNotation("8 2 - 2 *");
        assertEquals(12, result);
        result = calculator.calculatePolishNotation("8 2 2 * -");
        assertEquals(4, result);
    }
}