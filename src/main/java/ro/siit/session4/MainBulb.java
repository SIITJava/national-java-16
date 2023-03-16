package ro.siit.session4;

public class MainBulb {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();

        for (int i = 0; i < 100; i++) {
            lightBulb.on();
            lightBulb.off();
        }

        if (lightBulb.isBroken()) {
            System.out.println("Buy new Lightbulb!");
        }

        for (int i = 0; i < 1500000; i++) {
            System.out.println(i);
            lightBulb.on();
            lightBulb.off();
            if (lightBulb.isBroken()) {
                System.out.println("Buy new Lightbulb!");
                break;
            }
        }

        // lightBulb.lifeSpan = 100;

    }
}
