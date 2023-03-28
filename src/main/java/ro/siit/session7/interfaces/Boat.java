package ro.siit.session7.interfaces;

public class Boat implements Vehicle{
    @Override
    public void start() {
        System.out.println("Start boat");
    }

    @Override
    public void stop() {
        System.out.println("Stop Boat");
    }
}
