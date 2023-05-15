package ro.siit.session17;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu distanta in cifre (e.g., 2 km, 5 m: ");
        String expression = scanner.nextLine();

        double meters = convertToMeters(expression);

        System.out.print("Introdu unitatea in care vrei sa se converteasca (cm, mm): ");
        String outputUnit = scanner.nextLine();

        double outputValue = convertFromMeters(meters, outputUnit);

        System.out.println("The distance in " + outputUnit + " is: " + outputValue);

        scanner.close();
    }

    public static double convertToMeters(String expression) {
        double totalMeters = 0;

        String[] parts = expression.split(" ");
        for (int i = 0; i < parts.length; i += 2) {
            double value = Double.parseDouble(parts[i]);
            String unit = parts[i + 1];

            switch (unit) {
                case "km":
                    totalMeters += value * 1000;
                    break;
                case "m":
                    totalMeters += value;
                    break;
                case "cm":
                    totalMeters += value * 0.01;
                    break;
                case "mm":
                    totalMeters += value * 0.001;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown unit: " + unit);
            }
        }

        return totalMeters;
    }

    public static double convertFromMeters(double meters, String outputUnit) {
        switch (outputUnit) {
            case "m":
                return meters;
            case "km":
                return meters / 1000;
            case "dm":
                return meters * 10;
            case "cm":
                return meters * 100;
            case "mm":
                return meters * 0.001;
            default:
                throw new IllegalArgumentException("Unknown output unit: " + outputUnit);
        }
    }
}
