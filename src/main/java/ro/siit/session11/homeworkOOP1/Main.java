package ro.siit.session11.homeworkOOP1;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car(); // this should not compile.

        // Car car = new Dacia(27, "oiqe0934hkkadsn"); // this should not compile! If I want to create a Dacia car, I will need to create an instance of a Dacia model.

        Car car = new Logan(27, "oiqe0934hkkadsn"); // Logan can extend from Dacia, while Dacia extends from Car

        car.setTireSize((short)17);
        car.start();

        car.shiftGear((short)1);

        car.drive(0.01f); // drives 0.01 KMs

        car.shiftGear((short)2);

        car.drive(0.02f);

        car.shiftGear((short)3);

        car.drive(0.5f);

        car.shiftGear((short)4);

        car.drive(0.5f);

        car.shiftGear((short)4);

        car.drive(0.5f);

        car.shiftGear((short)5);

        car.drive(10);

        car.shiftGear((short)4);

        car.drive(0.5f);

        car.shiftGear((short)3);

        car.drive(0.1f);

        car.stop();

        float availableFuel = car.getAvailableFuel();
        System.out.println(availableFuel);

        float fuelConsumedPer100Km = car.getAverageFuelConsumption();
        System.out.println(fuelConsumedPer100Km);



        Vehicle vehicle = new VWGolf(30, "1987ddkshik289"); // available fuel and chassis number

        vehicle.start();

        vehicle.drive(1);

        vehicle.stop();

        Car car2 = (Car) vehicle;

        float availableFuel2 = car2.getAvailableFuel();
        System.out.println(availableFuel2);

        float fuelConsumedPer100Km2 = car2.getAverageFuelConsumption();
        System.out.println(fuelConsumedPer100Km2);
    }
}
