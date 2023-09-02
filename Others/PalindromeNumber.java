package hacker_rank_codes;


public class PalindromeNumber{
		static int newCopy;
	public static void main(String[] args) {
		int a=143;
		int copy=a;
		while(copy!=0) {
			newCopy=newCopy*10+copy%10;
			copy/=10;
		}
		if(newCopy==a)
			System.out.println(a+" is a Palindrome Number");
		else
		System.out.println(a+" is not a Palindrome Number");
	}
}
