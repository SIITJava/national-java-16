package ro.siit.session23.prodcons;

import java.util.Random;

public class Consumer extends Thread{
    private Buffer buffer;

    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.getNumber();
        }
    }
}
