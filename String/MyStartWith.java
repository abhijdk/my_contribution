package Demo;

public class MyStartWith {
    
	   public static void main(String[] args)
	    {
	        String s1="Java was developed by James Gosling";
	        String s2="Java was introduced in the year of 1995";
	        String s3="Python was developed by Guido van Rossum";
	        
	        String found="java";
	        
	        System.out.println(s1.startsWith(found));
	        System.out.println(s2.startsWith(found));
	        System.out.println(s3.startsWith(found));
	    }
}
