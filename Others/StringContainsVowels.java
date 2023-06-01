package mar_14_2023;
/*
Write a program to check whether a String contains vowels or not.
 */
public class StringContainsVowels 
{
	public static void main(String[] args)
	{
		String s= "JAVA",s1=s;
		s=s.toUpperCase();
		char ch []=s.toCharArray();
		int c=0;
		for (int i=0;i<s.length();i++)
		{
			if (ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			c++;
		}
		if (c>0)
			System.out.println(s1+ " ContainsVowel's");
		else
			System.out.println(s1+ " is not ContainsVowels");
	}
}
