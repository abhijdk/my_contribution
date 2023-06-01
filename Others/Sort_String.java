package mar_14_2023;
//Write a program to sort the String data.
import java.util.Scanner;

public class Sort_String
{
	public static void string(String s)
	{
		s = s.toLowerCase();
		int temp;
		char [] c=s.toCharArray();
		for (int i=0;i<s.length()-1;i++)
		{
			for (int j=0;j<s.length()-1;j++)
			{
				if (c[j]>c[j+1])
				{
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=(char)temp;
				}
			}
		}
		s=c.toString();
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();/**/
		/*String s="back";/**/
		string(s);
		
	}
}