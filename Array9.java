package mar_06_2023;
import java.util.Arrays;
import java.util.Scanner;
public class Array9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int len=3;
		int []a=new int [len];
		for (int i=0;i<a.length;i++)
		{
			System.out.print("\nEnter Array Element ["+i+"]");
			a[i]=sc.nextInt();
		}
		len=3;
		int []b=new int [len];
		for (int i=0;i<b.length;i++)
		{
			System.out.print("\nEnter Array Element ["+i+"]");
			b[i]=sc.nextInt();
		}
		System.out.println("\n\n1st Array Elements\n"+Arrays.toString(a));
		System.out.println("\n2nd Array Elements\n"+Arrays.toString(b));
		System.out.println("\nNew Array Elements are\n"+Arrays.toString(m1(a,b)));
	}
	public static int [] m1(int []a,int b[])
	{	
		int []arr= {a[1],b[1]};
		return arr;
	}
	}
