package mar_02_2023;
import java.util.Scanner;
public class GCD
{
	public static int getGCD(int i, int j)
	{
		int gcd=1;
		for (int k=1; k<=i && k<=j; k++)
		{
			if (i%k==0 && j%k==0)
			{
				gcd=k;
			}
		}
		return gcd;
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st Number for GCd :");
		int i =sc.nextInt();
		System.out.print("Enter 2nd Number for GCd :");
		int j= sc.nextInt();
	System.out.println(getGCD(i,j));	
	}
}
