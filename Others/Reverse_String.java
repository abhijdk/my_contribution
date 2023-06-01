package mar_14_2023;

import java.util.Scanner;

public class Reverse_String
{
	public static void string(String s)
	{
		char [] arr=new char[s.length()];
		for (int i=0;i<s.length();i++)
		
			arr[i]=s.charAt(s.length()-1-i);
		
		System.out.println(arr);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();
		string(s);
	}
}


