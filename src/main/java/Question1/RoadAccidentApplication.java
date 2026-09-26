package Question1;

import java.util.Scanner;

public class RoadAccidentApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Store the cities and vehicle types
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        String[] vehicleTypes = {"CAR", "MOTOR BIKE"};

        // Store the accident numbers
        int[][] accidents = new int[3][2];

        // Capture accident information
        for (int row = 0; row < cities.length; row++) {

            System.out.print("Enter the number of car accidents for "
                    + cities[row] + ": ");
            accidents[row][0] = input.nextInt();

            System.out.print("Enter the number of motor bike accidents for "
                    + cities[row] + ": ");
            accidents[row][1] = input.nextInt();
        }

        System.out.println("--------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("--------------------------------------------------");

        System.out.println("\t\t" + vehicleTypes[0]
                + "\t\t" + vehicleTypes[1]);

        // Display the road accident report
        for (int row = 0; row < accidents.length; row++) {

            System.out.print(cities[row] + "\t");

            for (int col = 0; col < accidents[row].length; col++) {
                System.out.print("\t" + accidents[row][col]);
            }

            System.out.println();
        }

        System.out.println("--------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int highestTotal = 0;
        String highestCity = "";

        // Calculate total accidents for each city
        for (int row = 0; row < accidents.length; row++) {

            int total = 0;

            for (int col = 0; col < accidents[row].length; col++) {
                total += accidents[row][col];
            }

            System.out.println(cities[row] + "\t" + total);

            // Find the city with the most accidents
            if (total > highestTotal) {
                highestTotal = total;
                highestCity = cities[row];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: "
                + highestCity);

        System.out.println("--------------------------------------------------");

        input.close();
    }
}
