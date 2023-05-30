package ro.siit.session23;

import java.util.List;
import java.util.Random;

public class NumberGeneratorContainer extends Thread{
    private List<Integer> generatedNumbers;

    public NumberGeneratorContainer(List<Integer> generatedNumbers){
        this.generatedNumbers = generatedNumbers;
    }

    @Override
    public void run() {
        int generatedNumber = (new Random()).nextInt(10);
        generatedNumbers.add(generatedNumber);
        System.out.println("generated:" + generatedNumber);
    }
}
