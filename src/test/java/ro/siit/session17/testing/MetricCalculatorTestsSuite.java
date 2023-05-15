package ro.siit.session17.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MetricCalculatorTestsSuite {
    @Test
    public void calculator_works(){
        Assertions.assertEquals("1090 mm", MetricCalculator.calculate("10 cm + 1 m - 10 mm"));
    }

    @Test
    public void calculator_works2(){
        Assertions.assertEquals("10 cm", MetricCalculator.calculateRegexp("10 cm + 1 m - 10 dm"));
    }
}
