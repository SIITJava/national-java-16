package ro.siit.session23;

public class Counter extends Thread{
    private final int start = 10;
    private final int end = 20;
    private final int step = 2;
    @Override
    public void run() {
        for (int i = start; i < end; i = i + step) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
