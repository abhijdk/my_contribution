package hacker_rank_codes;


public class StringSplit{
	public static void main(String[] args) {
		String ss="A B C";
		String s[]=ss.split("\\s");
		for(String s2:s) {
			System.out.println(s2);
		}
	}
}
