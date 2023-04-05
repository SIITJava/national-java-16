package ro.siit.session9.array;

import ro.siit.session9.model.Person;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        Person p = new Person("John Doe", 25);
        Person p2 = new Person("John Doe", 25);

        System.out.println(p.equals(p2));
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());

        persons.add(p);
        persons.add(p2);

        System.out.println(persons.size());
    }
}
