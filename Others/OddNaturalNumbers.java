package mar_02_2023;

import java.util.Scanner;

public class OddNaturalNumbers 
{
	public static void m1(int a)
	{
		int sum=0,i=1;
		for (int j=0;j<a;j++)
		{
			sum+=i;
			System.out.println(i);
			i+=2;
		}
		System.out.println("The Sum of odd Natural Number upto 5 terms is: "+sum);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Input number of terms is : ");
		m1(sc.nextInt());
	}

}
