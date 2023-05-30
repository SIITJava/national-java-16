package ro.siit.session23;

public class RandomNumberSum {
    public static void main(String[] args) throws InterruptedException {
        int generatorsNumber = 10;
        NumberGenerator[] generatorsThreads = new NumberGenerator[generatorsNumber];
        for (int i = 0; i < generatorsNumber; i++) {
            generatorsThreads[i] = new NumberGenerator();
            generatorsThreads[i].start();
        }

        for (int i = 0; i < generatorsNumber; i++) {
            generatorsThreads[i].join(1000);
        }

        int sum = 0;
        for (int i = 0; i < generatorsNumber; i++) {
            sum += generatorsThreads[i].getNumber();
        }

        System.out.println("SUM=" + sum);
    }
}
