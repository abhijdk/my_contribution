package Demo;

public class StringEnds{
	public static void main(String[] args) {
		String s1="Java is Language and Spring is a Framework";
		String s2="Framework";
		
		System.out.println("Original String is ");
		System.out.println("\""+s1+"\"");
		System.out.println("Contains ");
		System.out.println("\""+s2+"\"");
		System.out.println(s1.endsWith(s2));
	}
}
