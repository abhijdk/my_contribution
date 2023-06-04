package mar_16_2023;
//Write a Program to remove all the occurrence of a given character from the String.
import java.util.Scanner;

public class RemoveAllTheOccurrence
{
	public static void string(String s,char remove)
	{
		StringBuilder sb=new StringBuilder();
		for (char ch: s.toCharArray())
		{
			if(ch!=remove)
			{
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();/**/
		System.out.println(s+"\nEnter which element you want\n to remove from above string");
		char remove=sc.next().charAt(0);
		string(s,remove);
	}
}
