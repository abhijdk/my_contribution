package Demo;

public class MyReplace1 {
    
	   public static void main(String[] args)
	    {
	        String str = "JAVA IS A LANGUAGE";

	        String new_str = str.replaceAll("IS", "is");
	        System.out.println("Original string: " + str);
	        System.out.println("New String: " + new_str);
	    }
	}
