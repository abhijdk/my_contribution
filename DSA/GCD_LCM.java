package june.month;

import java.util.Scanner;

public class GCD_LCM {
	public static void main(String[] args) {
		System.out.print("Enter 1st Number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print("Enter 2nd Number");
		int b=sc.nextInt();
		int gcd=0;
		for (int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD OF "+ a +" & "+ b+" is "+gcd);
		
		int lcm=(a*b)/gcd;
		System.out.println("LCM OF "+ a +" & "+ b+" is "+lcm);
	}
}
