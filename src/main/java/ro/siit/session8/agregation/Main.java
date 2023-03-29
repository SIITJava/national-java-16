package ro.siit.session8.agregation;

public class Main {
    public static void main(String[] args) {
        Car.Headlight headlight = new Car.Headlight();

        Car car  = new Car(new Car.SteeringWheel(),
                new Car.Headlight(),
                new Car.Headlight(),
                null);
    }
}
