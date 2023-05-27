package mar_02_2023;
import java.util.Scanner;
public class OddNaturalNumber
{
	public static void odd()
	{
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number");
		int num1=sc.nextInt();
		System.out.print("Enter 2nd Number");
		int num2=sc.nextInt();
		System.out.print("Enter 3rd Number");
		int num3=sc.nextInt();
		System.out.print("Enter 4th Number");
		int num4=sc.nextInt();
		System.out.print("Enter 5th Number");
		int num5=sc.nextInt();
		if (num1%2!=0)
			num +=num1;
		if (num2%2!=0)
			num +=num2;
		if (num3%2!=0)
			num +=num3;
		if (num4%2!=0)
			num +=num4;
		if (num5%2!=0)
			num +=num5;
		System.out.println("The Sum of odd Natural Number upto 5 terms is: " + num);
		
	}
	public static void main(String[] args) 
	{
		
	odd();	
	}
}
