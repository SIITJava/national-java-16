package ro.siit.session11.homeworkOOP1;

public class Logan extends Dacia{
    private Logan(short fuelTankSize, String fuelType, short gears, float consumptionPer100Km) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km);
    }

    public Logan(float availableFuel, String chassisNumber){
        super((short)50, "PETROL", (short)5, 8.1f);
        super.setChassisNumber(chassisNumber);
        super.setAvailableFuel(55);
    }
}
