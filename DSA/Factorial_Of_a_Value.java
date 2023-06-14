package june_14_2023;

import java.util.Scanner;

public class Factorial_Of_a_Value {
	
	public static void main(String[] args) {
		System.out.print("Enter An Number: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num=num1,fact=1;
		while(num!=0) {
			fact*=num;
			num-=1;
		}
			System.out.println("Factorial_Of_a_Value "+num1+" is "+fact);
		sc.close();
	}
}

