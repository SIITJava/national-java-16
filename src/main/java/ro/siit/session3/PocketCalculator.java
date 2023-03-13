package ro.siit.session3;

import java.util.Scanner;

public class PocketCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double op1 = PocketCalculatorUtils.readOperand(keyboard);
        double op2 = PocketCalculatorUtils.readOperand(keyboard);
        String operator = PocketCalculatorUtils.readOperator(keyboard);
        PocketCalculatorUtils.printResult(op1, op2, operator);

    }

}
