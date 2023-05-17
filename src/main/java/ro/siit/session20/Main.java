package ro.siit.session20;

import ro.siit.session8.agregation.Car;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Angela");

        Box<Double> doubleBox = new Box<>(2.6);
        doubleBox.getEntity();

        Box<Car> carBox = new Box<>(new Car());
        Car entity = carBox.getEntity();
        for (Annotation annotation: Box.class.getDeclaredAnnotations()) {
            System.out.println(annotation.getClass());
        }

    }
}
