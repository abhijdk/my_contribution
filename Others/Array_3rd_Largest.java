package mar_08_023;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class Array_3rd_Largest
{
	public static int m1(int []arr)
	{
		int temp;
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	System.out.println("Elements of array sorted in ascending order:\n "+Arrays.toString(arr));       
		return arr[2];
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Array Length");
		int length=sc.nextInt();
		int arr[]= new int[length];
		for (int i=0;i<arr.length;i++)
		{
			System.out.print("\nEnter Array Element ["+i+"]");
			arr[i]=sc.nextInt();
		}
		System.out.println("\n\nArray Elements are\n "+Arrays.toString(arr));
		System.out.println("The 3rd_Largestm of the Array is"+m1(arr));
		}
}



