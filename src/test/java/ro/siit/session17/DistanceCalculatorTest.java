package ro.siit.session17;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DistanceCalculatorTest {

    private String input;
    private double expectedOutput;

    public DistanceCalculatorTest(String input, double expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {"2 km 500 m", 2500.0},
                {"5 m", 5.0},
                {"25 cm", 0.25},
                {"1000 mm", 1.0},
                {"1 km 500 m 25 cm 1000 mm", 2525.1}
        });
    }

    @Test
    public void testConvertToMeters() {
        assertEquals(expectedOutput, DistanceCalculator.convertToMeters(input), 0.01);
    }
}

