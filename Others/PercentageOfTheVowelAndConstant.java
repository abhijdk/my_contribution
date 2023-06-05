package mar_17_2023;
//Write a program to find percentage of the vowel and constant in the given String .
public class PercentageOfTheVowelAndConstant 
{
	public static void string(String s)
	{
		s=s.toLowerCase();
		int vowel=0,constant=0;
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==97||s.charAt(i)==101||s.charAt(i)==105||s.charAt(i)==111||s.charAt(i)==117)
				vowel++;
			else
				constant++;
		}
		int i=100/s.length();
		System.out.println("In the given String "+s+"\n\nVoweel is: "+vowel+"\n&\n  Constant is: "+constant+"\n\n");
		System.out.println("PercentageOfTheVowelAndConstant");
		System.out.println("Voweel is: "+i*vowel+"%  \n&\n  Constant is: "+i*constant+"%");
	}
	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Input String: ");
		String s= sc.next();/**/
		String s="I Mback";/**/
		//System.out.println(s.charAt(0));
		string(s.replaceAll(" ",""));
	}
}
