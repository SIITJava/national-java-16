package ro.siit.session12.testing;

public class Ortodox implements Person{
    @Override
    public String sayHi() {
        if (Calendar.isWithin40Days()) {
            return "Hristos a inviat!";
        } else {
            return "Buna ziua!";
        }
    }

    public int getAge(){
        return 0;
    }
}
