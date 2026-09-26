
package Question2;

public class RoadAccidentReport extends RoadAccidents {

    // Constructor
    public RoadAccidentReport(String accidentVehicleType, String city,
            int accidentTotal) {

        super(accidentVehicleType, city, accidentTotal);
    }

    // Print accident report
    public void PrintAccidentReport() {

        System.out.println();
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("************************");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
        System.out.println("************************");
    }
}
