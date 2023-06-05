package mar_17_2023;
//Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
public class CompareTwoStringsLexicographically 
{ 		//s1="I M back"; s2="I M back";
	public static void string(String s1,String s2)
	{
		int count=0;
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					count++;
				}
			}
		}
		if(count==s1.length())
			System.out.println("The given strings is  lexicographically");
		else
			System.out.println("The given strings is not lexicographically");
	}
	
	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();/**/
		String s1="Java Is Good";/**/
		String s2="Jav";/**/
		//string(s1,s2);
		System.out.println(s1.compareTo(s2));
	}
}
