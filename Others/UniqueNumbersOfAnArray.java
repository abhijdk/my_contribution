package mar_09_2023;

import java.util.Scanner;

public class UniqueNumbersOfAnArray
{
	static Scanner sc=new Scanner(System.in);
	static int  length;
	
	public static int sumOfArray(int [] num)
	{
		int sum=0;
		if (length<=0)
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
					count=0;
					for (int j=0;j<num.length;j++)
					{
						if (num[i]==num[j])
							count++;
					}
					if (count ==1)
						sum+=num[i];
				}
			}
		}
		return sum;
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
		System.out.println("The value returned by the method sumOfArray() is: "+new UniqueNumbersOfAnArray().sumOfArray(num));
	}

}
