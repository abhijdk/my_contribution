package mar_09_2023;

import java.util.Scanner;

public class GetOddCount
{
	static Scanner sc=new Scanner(System.in);
	static int  length;
	
	public static int sumOfArray(int [] num)
	{
		if (num.length<5)
		return -1;
		else
		{
			for (int i=0;i<num.length;i++)
			{
				int count=0;
				if(num[i]<0)
				{
					return -2;
				}
				
				else 
				{
						if(num[i]%2==0)
						{
							count++;
						}
						if(count==num.length+1)
						{
							return -3;
						}
						else
							return num[length/2];
				}				
			}
		}
		return 0;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter Length");
		length=sc.nextInt();
		int [] num=new int[length];
		for (int i=0;i<length;i++)
		{
			System.out.print("enter number");
			num[i]=sc.nextInt();
		}
		System.out.println("medal of the element :\n "+sumOfArray(num));
	}

}
