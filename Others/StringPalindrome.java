package mar_15_2023;
//Write a program to check a String is palindrome or not.
public class StringPalindrome
{
	public static void string(String s)
	{
		s=s.toUpperCase();
		char [] c=s.toCharArray();
		char [] pal=new char[s.length()];
		for (int i=s.length()-1;i>=0;i--)
		{
			pal[i]=c[i];
		}
		//System.out.println(pal+" "+c);
		String reverse=new String(pal) ;
		if (s.equals(reverse))
			System.out.println("Given string is a Palindrome");
		else

			System.out.println("Given string is not a Palindrome");
		}
	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();/**/
		String s="mam";/**/
		string(s);
	}
}
