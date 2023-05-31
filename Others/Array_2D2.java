
//Program: 2
package mar_13_2023;


import java.util.Scanner;


public class Array_2D2 
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
				System.out.print("Elements["+i+"]["+j+"]=");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Find the element");
		int find=sc.nextInt();
		for (int i=0;i<arr.length;i++)
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if(find==arr[i][j])
				{
					System.out.print("["+i+"]["+j+"]"+" ");
					System.out.print(arr[i][j]+" ");
				}	
			}
			System.out.println();
		}
	}
}
