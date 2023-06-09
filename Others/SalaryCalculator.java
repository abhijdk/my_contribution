package apr_14_2023_multithreaded;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter basic salary
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate allowances
        double houseRentAllowance = 0.25 * basicSalary;
        double dearnessAllowance = 0.15 * basicSalary;

        // Calculate gross salary
        double grossSalary = basicSalary + houseRentAllowance + dearnessAllowance;

        // Calculate income tax
        double incomeTax = 0;
        if (grossSalary >= 50000) {
            incomeTax = 0.2 * grossSalary;
        } else if (grossSalary >= 30000) {
            incomeTax = 0.15 * grossSalary;
        } else if (grossSalary >= 20000) {
            incomeTax = 0.1 * grossSalary;
        }

        // Calculate net salary
        double netSalary = grossSalary - incomeTax;

        // Display the calculated salary
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("House Rent Allowance: $" + houseRentAllowance);
        System.out.println("Dearness Allowance: $" + dearnessAllowance);
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("Income Tax: $" + incomeTax);
        System.out.println("Net Salary: $" + netSalary);

        // Close the Scanner
        scanner.close();
    }
}
