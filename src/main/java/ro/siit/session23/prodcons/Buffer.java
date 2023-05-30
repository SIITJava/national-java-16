package ro.siit.session23.prodcons;

public class Buffer {
    private int number;
    private boolean readyToWrite = true;

    public synchronized int getNumber() {
        while(readyToWrite){
            try {
                wait(); // wait for the producer to put a value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Returning "  + number);
        readyToWrite = true;
        notifyAll();
        return number;
    }

    public synchronized void setNumber(int number) {
        while(!readyToWrite){
            try {
                wait(); // wait for the producer to put a value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.number = number;
        System.out.println("Setting " + number);
        readyToWrite = false;
        notifyAll();
    }
}
