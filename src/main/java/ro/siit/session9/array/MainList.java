package ro.siit.session9.array;

import ro.siit.session9.model.Person;
import ro.siit.session9.model.Student;

import java.util.*;

public class MainList {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        System.out.println(persons.size());
        persons.add(new Student("Ionescu Paul", 20));
        System.out.println(persons.size());
        // persons.get(1).getName();
        persons.add(new Student("Angela Dumitriu", 17));
        persons.get(1).getName();
        for (Person person: persons
             ) {
            System.out.println(person);
        }

        List unParameterizedList = new ArrayList();
        unParameterizedList.add("Ana");
        unParameterizedList.add(2);
        unParameterizedList.add(new Person("Ion", 34));

        // unParameterizedList.get(2).getName();
    }
}
