package may_23_2023;

//Program to check whther a number is even or odd

import java.util.function.*;
import java.util.Scanner;
public class MyPredicate2 {
	public static void main(String [] args) {
			Predicate<Integer> p =  x -> x%2==0;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Number :");
			int num = sc.nextInt();
			System.out.println(num +" is even ?"+p.test(num));
	}
}