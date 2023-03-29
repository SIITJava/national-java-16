package ro.siit.session8.containment;

public class Main {
    public static void main(String[] args) {
        // Building.Apartment apartment = new Building.Apartment();
        Building building = new Building("10");
        Building.Apartment apartment = building.new Apartment("1");
        apartment.listAddress();
    }
}
