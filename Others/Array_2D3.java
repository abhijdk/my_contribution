//Program: 3
package mar_13_2023;


import java.util.Arrays;
import java.util.Scanner;

public class Array_2D3 
{	
	public static void main(String [] args)
	{//1st 2d arr
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
				System.out.print("1st Elements["+i+"]["+j+"]=");
				arr[i][j]=sc.nextInt();
			}
		}
		//2nd 2d arr
		int [][] arr2=new int [row][col] ;
		for (int i=0;i<arr2.length;i++)
		{
			for (int j=0;j<arr2.length;j++)
			{
				System.out.print("2nd arr Elements["+i+"]["+j+"]=");
				arr2[i][j]=sc.nextInt();
			}
		}
		//addition
		int [][] arrAdd=new int [row][col] ;
		for (int i=0;i<arr2.length;i++)
		{
			for (int j=0;j<arr2.length;j++)
			{
				arrAdd[i][j]=arr[i][j]+arr2[i][j];
			}
		}
		System.out.println("1st arr");
		for (int[] x:arr)//1st arr
			System.out.println(Arrays.toString(x));
		System.out.println("2nd arr");
		for (int[] x:arr2)//2nd arr
			System.out.println(Arrays.toString(x));
		System.out.println("Addition of both arr");
		for (int[] x:arrAdd)//addition of both arr
			System.out.println(Arrays.toString(x));
	}
}
