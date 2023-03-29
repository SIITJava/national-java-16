package ro.siit.session8.containment;

public class Building {

    private String buildingNo;

    public Building(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    class Apartment {
        private String apNo;

        public Apartment(String apNo) {
            this.apNo = apNo;
        }

        public void listAddress(){
            System.out.println("Building: " + buildingNo + " ap. " + apNo);
        }
    }
}
