package mar_08_023;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Students_Marks_Avg 
{
	static int sum;
	static double avg;
	public static int m1(int []arr)
	{	
		for (int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		return sum;
	}
	public static double m2(int arr[])
	{	
		avg=(double)sum/arr.length;
		return avg;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Array Length");
		int length=sc.nextInt();
		int arr[]= new int[length];
		for (int i=0;i<arr.length;i++)
		{
			System.out.print("\nEnter Student Marks ["+i+"]");
			arr[i]=sc.nextInt();
		}
		System.out.println("\n\nArray Elements are\n "+Arrays.toString(arr));
		System.out.println("The Sum of the Marks is"+m1(arr));
		System.out.println("The Average of the Marks is"+m2(arr));
	}
}
