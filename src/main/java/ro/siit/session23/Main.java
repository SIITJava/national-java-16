package ro.siit.session23;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Hello");
        Counter counter = new Counter();
        counter.start();
        counter.start();
//        counter.run();
//        counter.run();
        System.out.println(Thread.currentThread().getName() + " Good bye!");
    }
}
