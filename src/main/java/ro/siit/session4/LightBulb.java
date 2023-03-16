package ro.siit.session4;

public class LightBulb {
    private int lifeSpan = 150;
    private boolean isOn = false;

    public void on() {
        isOn = true;
    }

    public void off() {
        if (isOn) {
            isOn = false;
            lifeSpan = Math.max(0, --lifeSpan);
        }
    }

    public boolean isBroken() {
        return lifeSpan == 0;
    }
}
