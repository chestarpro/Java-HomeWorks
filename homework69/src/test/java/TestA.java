import TaskA.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestA {

    @Test
    public void testOperation() {
        boolean result = Calculator.operationValidate("*");
        assertTrue(result, "Не правильное значение операции");
    }

    @Test
    public void testDivideByZero() {
        boolean result = Calculator.divideByZero(2, "*");
        assertTrue(result, "На ноль делить нельзя");
    }

    @Test
    public void testCalculator() {
        int result = Calculator.calculate(1, 2, "*");
        assertEquals(result, 2);
    }
}
