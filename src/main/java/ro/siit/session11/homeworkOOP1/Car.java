package ro.siit.session11.homeworkOOP1;

public abstract class Car implements Vehicle{
    private final short fuelTankSize;
    private final String fuelType;
    private final short gears;
    private final float consumptionPer100Km;

    private float availableFuel;
    private short tireSize;
    private String chassisNumber;

    private short currentGear; // 1-6

    private float tripConsumption;
    private float tripLength;

    private float averageFuelConsumption;

    protected Car(short fuelTankSize, String fuelType, short gears, float consumptionPer100Km) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
    }

    void shiftGear(short gear){
        currentGear = gear;
    }

    @Override
    public void start() {
        currentGear = 1;
        tripConsumption = 0;
        tripLength = 0;
    }

    @Override
    public void stop() {
        System.out.println("Trip consumption " + tripConsumption);
        System.out.println("Trip length " + tripLength);
        availableFuel -= tripConsumption;
        averageFuelConsumption = tripConsumption / tripLength;
    }

    private float getRatioConsumption(){
        if(tireSize == 16){
            if(currentGear == 2) {
                return 0.7f;
            } else if (currentGear == 3){
                return 0.43f;
            } // .....
        } else if (tireSize == 17){
            //
        } else {
            //
        }
        return 1f;
    };

    @Override
    public void drive(float kilometers) {
        float[][] ratioConsumption = new float[][]{
            new float[]{1, 0.8f, 0.6f, 0.5f, 0.4f, 0.3f}, // 15'
            new float[]{1.1f, 0.7f, 0.43f, 0.98f, 1.5f, 0.66f}, // 16'
            new float[]{1.2f, 1.2f, 3.1f, 4.1f, 5.2f, 6.6f} // 17'
        };
        int index = 0;
        if(tireSize == 16) {
            index = 1;
        }else if(tireSize == 17){
            index = 2;
        }
        tripLength += kilometers;
        // 1-6 -> 0-5 => v-1
        tripConsumption += consumptionPer100Km * ratioConsumption[index][currentGear - 1] * kilometers / 100;
    }

    public float getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public float getAvailableFuel() {
        return availableFuel;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public void setAvailableFuel(float availableFuel) {
        this.availableFuel = availableFuel;
    }

    public void setTireSize(short tireSize) {
        this.tireSize = tireSize;
    }
}
