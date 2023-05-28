package mar_08_023;
	import java.util.Arrays;
	import java.util.Scanner;

public class Array_Minimum_Element 
{
		public static int m1(int []arr)
		{	int min=arr[0];
			for (int i=1;i<arr.length;i++)
			{
				if(min>arr[i])
				{
					min=arr[i];
				}
			}
			return min;
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
			System.out.println("The Minimum of the Array is"+m1(arr));
			}
	}

