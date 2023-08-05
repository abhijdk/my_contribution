package hacker_rank_codes;

import java.util.Scanner;

public class Calculation {
    static Scanner sc = new Scanner(System.in);

    public static void cal(double x, double y) {
        System.out.println("Please Enter a Calculation Symbol (+, -, *, /):");
        String symbol = sc.next();
        switch (symbol) {
            case "+": {
                System.out.println(x + y);
                break;
            }
            case "-": {
                System.out.println(x - y);
                break;
            }
            case "*": {
                System.out.println(x * y);
                break;
            }
            case "/": {
                if (y == 0) {
                    System.out.println("Cannot divide by zero. Please try again.");
                } else {
                    System.out.println(x / y);
                }
                break;
            }
            default:
                System.out.println("Invalid symbol. Please try again.");
                cal(x, y);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter 1st Number");
        double x = sc.nextDouble();
        System.out.println("Enter 2nd Number");
        double y = sc.nextDouble();

        cal(x, y);

        sc.close(); // Close the scanner at the end of the program.
    }
}
