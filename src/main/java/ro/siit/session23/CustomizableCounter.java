package ro.siit.session23;

public class CustomizableCounter implements Runnable{
    private String name;
    private  int start;
    private  int end;
    private  int step;

    public CustomizableCounter(String name, int start, int end, int step) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i = i + step) {
            System.out.println(name + " " + i);
        }
    }
}
