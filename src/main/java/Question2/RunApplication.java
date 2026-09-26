
package Question2;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Capture accident information
        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = input.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = input.nextLine();

        System.out.print("Enter the total " + vehicleType
                + " accidents for " + city + ": ");
        int accidentTotal = input.nextInt();

        // Create the accident report
        RoadAccidentReport report = new RoadAccidentReport(
                vehicleType, city, accidentTotal);

        report.PrintAccidentReport();

        input.close();
    }
}