package ro.siit.session23;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class RandomNumberSumContainer {
    public static void main(String[] args) throws InterruptedException {
        int generatorsNumber = 10;
        List<Integer> generatedNumbers = new Vector<>();

        NumberGeneratorContainer[] generatorsThreads = new NumberGeneratorContainer[generatorsNumber];
        for (int i = 0; i < generatorsNumber; i++) {
            generatorsThreads[i] = new NumberGeneratorContainer(generatedNumbers);
            generatorsThreads[i].start();
        }

        for (int i = 0; i < generatorsNumber; i++) {
            generatorsThreads[i].join(1000);
        }

        int sum = 0;
        for (Integer number: generatedNumbers) {
            sum += number;
        }

        System.out.println("SUM=" + sum);
    }
}
