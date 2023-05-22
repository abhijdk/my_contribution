package may_21_2023;

import java.util.Scanner;
import java.util.function.BinaryOperator;
/*
 * In this program, we use lambda expressions to define different
 * operations such as addition, subtraction, multiplication, and 
 * division using the BinaryOperator functional interface.
 * The program prompts the user to enter two numbers, performs 
 * the calculations using the lambda functions, and prints the results.
 */

public class LambdaCalculus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define lambda functions for the calculator operations
        BinaryOperator<Double> addition = (x, y) -> x + y;
        BinaryOperator<Double> subtraction = (x, y) -> x - y;
        BinaryOperator<Double> multiplication = (x, y) -> x * y;
        BinaryOperator<Double> division = (x, y) -> x / y;

        // Prompt the user for input
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        // Perform calculations based on user input
        double resultAddition = addition.apply(num1, num2);
        double resultSubtraction = subtraction.apply(num1, num2);
        double resultMultiplication = multiplication.apply(num1, num2);
        double resultDivision = division.apply(num1, num2);

        // Print the results
        System.out.println("Addition: " + resultAddition);
        System.out.println("Subtraction: " + resultSubtraction);
        System.out.println("Multiplication: " + resultMultiplication);
        System.out.println("Division: " + resultDivision);

        scanner.close();
    }
}
