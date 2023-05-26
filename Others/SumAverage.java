package mar_01_2023;

import java.util.Scanner;

public class SumAverage 
{
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st Number");
		int a=sc.nextInt();
		System.out.print("Enter 2nd Number");
		int b=sc.nextInt();
		System.out.print("Enter 3rd Number");
		int c=sc.nextInt();
		System.out.print("Enter 4th Number");
		int d=sc.nextInt();
		System.out.print("Enter 5th Number");
		int e=sc.nextInt();
		m1(a,b,c,d,e);
	}
public static void m1(int a, int b, int c, int d, int e)
{
	int sum = a+b+c+d+e;
	double average = sum/5;
	System.out.println("Input the 5 numbers :\n"+ a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n");
	System.out.println("The sum of 5 no is : "+sum);
	System.out.println("The Average is : "+average );
}
public static void main(String[] args)
{
	SumAverage s=new SumAverage();
}
}
