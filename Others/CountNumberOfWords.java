package mar_17_2023;
//Write a program to count number of words in the given String.
public class CountNumberOfWords
{

	public static void string(String s)
	{
		System.out.println(s.length());		
	}
	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();/**/
		String s="I   M    b a c k";/**/
		string(s.replaceAll(" ",""));
	}
}
