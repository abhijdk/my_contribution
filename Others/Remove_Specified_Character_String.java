package mar_14_2023;
/*
Write a program to remove a specified character from the given String.
 */
import java.util.Scanner;

public class Remove_Specified_Character_String 
{
	public static void string(String s,char ch)
	{
		StringBuilder sb=new StringBuilder();
		for (char c:s.toCharArray())
		{
			if(ch!=c)
				sb=sb.append(c);
		}
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();
		System.out.print("remove a specified character");
		char ch=sc.next().charAt(0);/**/
		//String s="back";/**/
		string(s,ch);
	}
}
