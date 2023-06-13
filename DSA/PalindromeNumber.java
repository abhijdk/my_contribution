package june.month;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.print("Enter A Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=num;
		int sum=0;
		while(i!=0) {
			int j=(i%10);
			sum=sum*10+j;
			i=i/10;
		}
		if(sum==num) {
			System.out.println(num+" is a Palindrome Number");
		}else {
			System.out.println(num+" is not a Palindrome Number");
		}
	}
}
