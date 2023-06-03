package mar_15_2023;
//Write a program to count capital and small letters in the given String.
import java.util.Scanner;

public class CapitalAndSmall_Letters 
{
	public static void string(String s)
	{
		int count=0,count1=0;
		char [] c=s.toCharArray();
		for (int i=0;i<s.length();i++)
		{
			if(c[i]<96)
				count++;
			else
				count1++;
		}
		System.out.println("In "+ s+" : "+count+ " Capital & "+count1+" Small Letters are avalable");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();/**/
		/*String s="IMback";/**/
		string(s);
	}

}
