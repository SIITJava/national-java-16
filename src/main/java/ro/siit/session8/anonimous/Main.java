package ro.siit.session8.anonimous;

public class Main {
    public static void main(String[] args) {
        Worker c1 = new Constructor();
        Worker c2 = new Constructor();
        // ....

        c1.work();

        Worker site = new Worker() {
            @Override
            public void work() {
                System.out.println("I take care of processes!");
            }

            @Override
            public void workForMoney(double amount) {

            }
        };

        site.work();

        Constructor manole = new Constructor(){
            @Override
            public void work() {
                super.work();
                System.out.println("I demolish houses!");
            }
        };

        manole.work();
    }
}
