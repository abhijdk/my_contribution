package june_14_2023;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) 
	{
			System.out.println("Enter an Number: ");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt(),b=a,c=0;
			for (int i=2;i<=a;i++) {
				if(b%i==0)
					c++;
			}
			if(c==1)
				System.out.println(a+" is a Prime numebr");
			else 
				System.out.println(a+" is not a Prime numebr");
			sc.close();
	}
}
