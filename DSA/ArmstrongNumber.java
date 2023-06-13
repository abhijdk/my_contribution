package june.month;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.print("Enter A Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=num;
		int sum=0;
		int len=Integer.toString(i).length();
		while(i!=0) {
			int j=(i%10);
			double val = Math.pow(j, len);
			sum+=val;
			i=i/10;
		}
		if(sum==num) {
			System.out.println(num+" is a Armstrong Number");
		}else {
			System.out.println(num+" is not a Armstrong Number");
		}
	}
}
