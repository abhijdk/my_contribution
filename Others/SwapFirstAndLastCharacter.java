package mar_16_2023;
//Write a program to swap first and last character from the given String.
public class SwapFirstAndLastCharacter 
{
	public static void string(String s)
	{
		char []ch=s.toCharArray();
		char temp='a';
		temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		
		System.out.println(ch);
		
		
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
