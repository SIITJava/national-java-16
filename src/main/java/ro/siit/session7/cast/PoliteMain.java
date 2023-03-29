package ro.siit.session7.cast;

import java.util.ArrayList;
import java.util.List;

public class PoliteMain {
    public static void main(String[] args) {
        List<Polite> politePeople = new ArrayList<>();
        politePeople.add(new Person());
        politePeople.add(new Teenager());
        politePeople.add(new Teenager());

        for (Polite politePerson: politePeople) {
            politePerson.sayHi();
            if (politePerson instanceof Person) {
                ((Person) politePerson).getSalary();
            }
        }
    }
}
