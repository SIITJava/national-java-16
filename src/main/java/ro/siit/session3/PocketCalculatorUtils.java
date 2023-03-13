package ro.siit.session3;

import java.util.Arrays;
import java.util.Scanner;

public class PocketCalculatorUtils {
    static String readOperator(Scanner keyboard) {
        String operator;
        String[] allowedOperators = new String[]{"+", "-", "*", "/"};
        do {
            System.out.println("Type operator");
            operator = keyboard.nextLine();
        } while (!(Arrays.asList(allowedOperators)).contains(operator));

        return operator;
    }

    static void printResult(double op1, double op2, String operator) {
        System.out.print(op1 + operator + op2 + "=");

        switch (operator){
            case "+" :
                System.out.print(op1 + op2);
                break;
            case "-" :
                System.out.print(op1 - op2);
                break;
            case "*" :
                System.out.print(op1 * op2);
                break;
            case "/" :
                System.out.print(op1 / op2);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    static double readOperand(Scanner keyboard) {
        boolean noError;
        double op = 0.0;
        do {
            System.out.println("Type operand");
            String operandAsString = keyboard.nextLine();
            try {
                op = Double.parseDouble(operandAsString);
                noError = true;
            } catch (NumberFormatException numberFormatException) {
                noError = false;
            }
        } while (!noError);

        return op;
    }
}
