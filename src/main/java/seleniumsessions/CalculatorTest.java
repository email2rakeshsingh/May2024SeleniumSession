package seleniumsessions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    // Simple calculator methods
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // TestNG test methods
    @Test
    public void testAdd() {
        CalculatorTest calculator = new CalculatorTest();
        int result = calculator.add(2, 3);
        Assert.assertEquals(result, 5, "Addition result is incorrect");
    }

    @Test
    public void testSubtract() {
        CalculatorTest calculator = new CalculatorTest();
        int result = calculator.subtract(5, 3);
        Assert.assertEquals(result, 2, "Subtraction result is incorrect");
    }
}
