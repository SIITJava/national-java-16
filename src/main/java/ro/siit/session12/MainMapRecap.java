package ro.siit.session12;


import ro.siit.session9.model.Person;

import java.util.HashMap;
import java.util.Map;

public class MainMapRecap {
    public static void main(String[] args) {
        Map<String, Person> persons = new HashMap<>();
        persons.put("1234567890123", new Person("Filip", 25));

        Map<Person, String> phoneNumbers = new HashMap<>();
        Person key1 = new Person("Filip", 25);
        System.out.println(key1.hashCode());
        phoneNumbers.put(key1, "0745630370");

        Person key2 = new Person("Filip", 25);
        System.out.println(key2.hashCode());
        phoneNumbers.put(key1, "1232134567");
        System.out.println(phoneNumbers.get(key2));

        System.out.println(key1.equals(key2));
    }
}
