package ro.siit.session11.homeworkOOP1;

public class VWGolf extends VW{
    private VWGolf(short fuelTankSize, String fuelType, short gears, float consumptionPer100Km) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km);
    }

    public VWGolf(float availableFuel, String chassisNumber){
        super((short)60, "DIESEL", (short)6, 6.1f);
        super.setChassisNumber(chassisNumber);
        super.setAvailableFuel(55);
    }
}
