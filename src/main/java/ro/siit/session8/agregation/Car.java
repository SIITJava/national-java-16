package ro.siit.session8.agregation;

public class Car {
    private SteeringWheel steeringWheel;
    private Headlight leftHeadlight;
    private Headlight rightHeadlight;
    private Engine engine;

    public Car(SteeringWheel steeringWheel,
               Headlight leftHeadlight,
               Headlight rightHeadlight,
               Engine engine) {
        this.steeringWheel = steeringWheel;
        this.leftHeadlight = leftHeadlight;
        this.rightHeadlight = rightHeadlight;
        this.engine = new Car.Engine();
    }

    public Car(){

    }

    private static class Engine{

    }

    static class Headlight {
        public int getLuminosity(){
            return 100;
        }
    }

    static class SteeringWheel extends Car{

    }

    public static class EngineOld {
    }
}
