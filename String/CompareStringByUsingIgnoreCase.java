package Demo;

public class CompareStringByUsingIgnoreCase{
	public static void main(String[] args) {
		String s1="Java is Language and Spring is a Framework";
		String s2="Java is language and Spring is a framework";

		// Display the results of the equality checks by using ignore case
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
