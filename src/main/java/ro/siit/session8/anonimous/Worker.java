package ro.siit.session8.anonimous;

public interface Worker {
    void work();

    void workForMoney(double amount);

    default void defMethod(){

    }
}
