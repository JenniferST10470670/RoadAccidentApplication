package Question2;

public abstract class RoadAccidents implements IRoadAccidents {

    private String accidentVehicleType;
    private String city;
    private int accidentTotal;

    // Constructor
    public RoadAccidents(String accidentVehicleType, String city,
            int accidentTotal) {

        this.accidentVehicleType = accidentVehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    // Get vehicle type
    @Override
    public String getAccidentVehicleType() {
        return accidentVehicleType;
    }

    // Get city
    @Override
    public String getCity() {
        return city;
    }

    // Get accident total
    @Override
    public int getAccidentTotal() {
        return accidentTotal;
    }
}

