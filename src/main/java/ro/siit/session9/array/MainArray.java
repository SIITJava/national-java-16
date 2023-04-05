package ro.siit.session9.array;

import ro.siit.session9.model.Person;
import ro.siit.session9.model.Student;

public class MainArray {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        for(int i = 0; i < persons.length; i++){
            persons[i] = new Person("Name " + i, 10 * i);
        }
        persons[2] = new Student("John Doe", 21);
        for (Person person: persons) {
            System.out.println(person);
        }

        System.out.println(persons[2]);

//        int[] intArray = new int[2];
//        intArray[0] = 1;
//        intArray[1] = 7;

        int x = -7;
        int[] intArray = new int[]{1, x};
    }
}
