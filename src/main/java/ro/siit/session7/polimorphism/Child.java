package ro.siit.session7.polimorphism;

public class Child extends Parent{

    public void method(double value) {
        System.out.println("You typed double value " + value);
    }

    @Override
    public void method(int value) {
        super.method(value);
    }

    public static void main(String[] args) {
        Child child = new Child();

        child.method(9.0);

        Parent parent = new Parent();
        parent.method(2);
    }
}
