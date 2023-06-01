
package mar_14_2023;

import java.util.Scanner;

public class String_02
{
	public static void string(String s)
	{
		char c[]=s.toCharArray();
		int temp=0;
			for (int j=0;j<s.length()-1;j++)
			{
				if (c[j]>c[j+1])
				{
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=(char)temp;
				}
			}
		
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		String s="eabcde";
		string(s);
	}
}

