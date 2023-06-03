package mar_15_2023;
//Write a program to count the consonants and vowels in the given String.
import java.util.Scanner;

public class CountTheConsonantsAndVowels 
{
	public static void string(String s)
	{
		s=s.toUpperCase();
		int count=0,count1=0;
		char [] c=s.toCharArray();
		for (int i=0;i<s.length();i++)
		{
			if(c[i]==65||c[i]==69||c[i]==73||c[i]==79||c[i]==85)
				count++;
			else
				count1++;
		}
		System.out.println("In the given String  : "+count+ " Vowels & "+count1+" Consonants are avalable");
	}
	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();/**/
		String s="IMback";/**/
		string(s);
	}

}
