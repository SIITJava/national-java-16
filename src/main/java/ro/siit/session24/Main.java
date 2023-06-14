package ro.siit.session24;

public class Main {
    public static void main(String[] args) {
        Person politePerson = () -> "Hello! Nice to meet you";

        System.out.println(politePerson.sayHello());

        Person notSoPolitePerson = new Person() {
            @Override
            public String sayHello() {
                return "Whazz'up?";
            }
        };

        System.out.println(notSoPolitePerson.sayHello());
    }
}
