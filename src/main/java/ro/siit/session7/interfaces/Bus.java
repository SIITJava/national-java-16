package ro.siit.session7.interfaces;

public abstract class Bus implements Vehicle{
    @Override
    public void stop() {
        System.out.println("Bus stop");
    }
}
