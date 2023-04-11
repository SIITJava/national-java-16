package ro.siit.session11.testing;

public class Vacation {
    public boolean sleepIn(boolean weekday, boolean vacation)  {
        return !weekday || vacation;
    }
}
