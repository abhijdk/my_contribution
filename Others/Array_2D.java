//Program: 1
package mar_13_2023;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2D 
{	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Row length");
		int row =sc.nextInt();
		System.out.print("Enter Column length");
		int col=sc.nextInt();
		
		int [][] arr=new int [row][col] ;
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				System.out.print("Enter Array Elements");
				arr[i][j]=sc.nextInt();
			}
		}
		for (int[] x:arr)
			System.out.println(Arrays.toString(x));
	}
}
