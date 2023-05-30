package ro.siit.session23;

import java.util.Random;

public class NumberGenerator  extends Thread{
    private int generatedNumber;

    @Override
    public void run() {
        generatedNumber = (new Random()).nextInt(10);
        System.out.println("generated:" + generatedNumber);
    }

    public int getNumber(){
        return generatedNumber;
    }
}
