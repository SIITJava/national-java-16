package ro.siit.session3;

import java.util.Random;

public class Trigonometry {
    public static void main(String[] args) {
        Random randomizer = new Random();

        String firstArgument = args[0];

        Double number = randomizer.nextDouble(180.0);

        Double shouldBeOne = Math.sin(number) * Math.sin(number) + Math.pow(Math.cos(number), 2);
        System.out.println("sin^2(" + number + ")+cos^2(" + number + ")=" + shouldBeOne);
    }
}
