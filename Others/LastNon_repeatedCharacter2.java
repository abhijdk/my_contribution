package mar_16_2023;
//Write a program to print last non-repeated character from the given String.
public class LastNon_repeatedCharacter2 
{
	public static void string(String s)
	{		
		for (int i=s.length()-1;i>=0;i--)
		{
			boolean flag =true;
			for(int j=s.length()-1;j>=0;j--)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					flag=false;
				}
			}
			if (flag)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}
		
	}
	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();/**/
		String s="abbccddeff";/**/
		string(s);
	}
}
