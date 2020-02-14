import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceCalculatorTest {

    double calculate(double income){
        return new InsuranceCalculator().calculateInsurance(income);
    }

    @Test
    public void low() {
        assertEquals(1825, calculate(5000), 0.01);
    }

    @Test
    public void medium() {
        assertEquals(38600, calculate(25000), 0.01);
    }

    @Test
    public void high() {
        assertEquals(78500, calculate(50000), 0.01);
    }

    @Test
    public void veryHigh() {
        assertEquals(106400, calculate(100_000), 0.01);
    }

}