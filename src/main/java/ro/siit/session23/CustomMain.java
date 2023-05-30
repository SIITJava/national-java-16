package ro.siit.session23;

public class CustomMain {
    public static void main(String[] args) {
        CustomizableCounter counter1 = new CustomizableCounter("John", 10, 35, 2);
        CustomizableCounter counter2 = new CustomizableCounter("Marcia", 10, 35, 2);
        CustomizableCounter counter3 = new CustomizableCounter("Celia", 100, 120, 1);

        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);
        Thread thread3 = new Thread(counter3);
        thread1.setPriority(1);
        thread1.start();
        thread2.setPriority(10);
        thread2.start();
        thread3.setDaemon(true);
        thread3.start();
    }
}
