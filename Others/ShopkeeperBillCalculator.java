package hacker_rank_codes;
import java.util.Scanner;

public class ShopkeeperBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter the monthly house rent: ");
        double houseRent = scanner.nextDouble();

        System.out.print("Enter the electricity rate per unit: ");
        double electricityRate = scanner.nextDouble();

        System.out.print("Enter the number of units consumed in a month: ");
        double electricityUnits = scanner.nextDouble();

        scanner.close();

        // Calculate total electricity bill
        double electricityBill = electricityRate * electricityUnits;

        // Calculate total monthly bill (including rent and electricity)
        double totalBill = houseRent + electricityBill;

        // Print the results
        System.out.println("\n------- Bill Details -------");
        System.out.println("Monthly House Rent: $" + houseRent);
        System.out.println("Electricity Bill: $" + electricityBill);
        System.out.println("Total Monthly Bill: $" + totalBill);
    }
}
