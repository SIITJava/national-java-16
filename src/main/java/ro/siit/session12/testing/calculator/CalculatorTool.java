package ro.siit.session12.testing.calculator;

public class CalculatorTool implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int substract(int a, int b) {
        return a - b;
    }
}
