package ro.siit.session7.cast;

public class Person implements Polite{
    @Override
    public void sayHi() {
        System.out.println("I am a person, hello!");
    }

    public void getSalary(){
        System.out.println("I'm receiving money");
    }
}
