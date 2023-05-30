package ro.siit.session23.prodcons;

import java.util.Random;

public class Producer  extends Thread{
    private Buffer buffer;

    public Producer (Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int number = (new Random()).nextInt(10);
            buffer.setNumber(number);
        }
    }
}
