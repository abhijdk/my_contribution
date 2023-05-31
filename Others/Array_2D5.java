//Program: 3
package mar_13_2023;


import java.util.Scanner;

public class Array_2D5 
{	
	public static void main(String [] args)
	{
		int [][]arr= {{1,2,3},{4,5,6}};
		int sum=0;
		/*for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				sum+=arr[i][j]+arr[j][i];
			}
		}*/
		for (int a[]:arr)
		{
			for (int b:a)
				sum+=b;
		}
			
		System.out.println(sum);
	}
}
