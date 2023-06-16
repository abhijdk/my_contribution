package may_23_2023;

//Program to check whther a name length is even or odd

import java.util.function.*;
import java.util.Scanner;
public class MyPredicate {
	public static void main(String [] args) {
			Predicate<Integer> p =  x -> x%2==0;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Number :");
			String nm = sc.nextLine();
			int num=nm.length();
			System.out.println(num +" is even ?"+p.test(num));
	}
}