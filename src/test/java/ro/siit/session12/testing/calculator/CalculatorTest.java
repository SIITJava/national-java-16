package ro.siit.session12.testing.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CalculatorTest {
    Random randomizer = new Random();
    Calculator calculator  = new CalculatorTool();
    int a, b, expectedResult;

    @BeforeEach
    public void setUp(){
        a = randomizer.nextInt(10);
        b = randomizer.nextInt(10);
    }

    @Test
    public void add_works(){
        expectedResult = a + b;
        Assertions.assertEquals(expectedResult, calculator.add(a, b));
    }

    @Test
    public void substract_works(){
        expectedResult = a - b;
        Assertions.assertEquals(expectedResult, calculator.substract(a, b));
    }
}
