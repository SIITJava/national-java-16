package ro.siit.session23;

public class Counter100 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <30; i++) {
            System.out.println(i);
            if(i%10 == 0){
                System.out.println("tenth");
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        (new Thread(new Counter100())).start();
    }
}
