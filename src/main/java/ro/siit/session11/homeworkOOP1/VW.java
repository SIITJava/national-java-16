package ro.siit.session11.homeworkOOP1;

public abstract class VW extends Car{
    protected VW(short fuelTankSize, String fuelType, short gears, float consumptionPer100Km) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km);
    }
}
