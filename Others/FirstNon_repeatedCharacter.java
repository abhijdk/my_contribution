package mar_16_2023;
//Write a program to print first non-repeated character from the given String.
public class FirstNon_repeatedCharacter 
{
	public static void string(String s)
	{		
		for (int i=0;i<s.length();i++)
		{
			boolean flag=true;
			for (int j=0;j<s.length();j++)
			{
				if (i!=j && s.charAt(i)==s.charAt(j))
					flag=false;
			}
			if(flag)
			{
				System.out.println(s.charAt(i));
			}
		}
	}
	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();/**/
		String s="WACBABC";/**/
		string(s);
	}
}
