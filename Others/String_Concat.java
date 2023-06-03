package mar_15_2023;

import java.util.*;

public class String_Concat
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st String ");
		String s1 = s.nextLine();
		System.out.println("Enter the 2nd String ");
		String s2 = s.nextLine();
		System.out.println("Enter the 3rd String ");
		String s3 = s.nextLine();
		
		char []ch = new char[s1.length()+s2.length()+s3.length()];
		int index = 0;
		for(int i=0;i<s1.length();i++)
		{
			ch[index] = s1.charAt(i);
			index++;
		}
		for(int i=0;i<s2.length();i++)
		{
			ch[index] = s2.charAt(i);
			index++;
		}
		for(int i=0;i<s3.length();i++)
		{
			ch[index] = s3.charAt(i);
			index++;
		}
		String concat = new String(ch);
		System.out.println(concat);
	}
}
