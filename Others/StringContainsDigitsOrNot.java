package mar_15_2023;

public class StringContainsDigitsOrNot 
{
	public static void string(String s)
	{
		char ch[]= s.toCharArray();
		int count=0;
		for (int i=0;i<s.length();i++)
		{
			if(Character.isDigit(ch[i]))
			{
				count++;
			}
		}
		if(count>0)
		System.out.println("String Contains Digits");
		else
			System.out.println("String don't ContainsDigits");
	}
	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();/**/
		String s="IMback 1";/**/
		string(s);
	}
}
