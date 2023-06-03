package mar_15_2023;
//Write a program to append three given Strings without using predefined methods.
import java.util.Arrays;

public class AppendThreeGivenStrings 
{
	public static void string(String s1,String s2,String s3)
	{
		
		char chNew[]=new char[s1.length()+s2.length()+s3.length()];
		int count=0;
		for (int i=0;i<s1.length();i++)
		{
			chNew[count]=s1.charAt(i);
			count++;
		}
		for (int i=0;i<s2.length();i++)
		{
			chNew[count]=s2.charAt(i);
			count++;
		}
		for (int i=0;i<s3.length();i++)
		{
			chNew[count]=s3.charAt(i);
			count++;
		}
		String concat=new String (chNew);
		System.out.println(concat);
	}
	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();/**/
		String s1="JAVA";
		String s2="IS";
		String s3="back";/**/
		string(s1,s2,s3);
	}
}

