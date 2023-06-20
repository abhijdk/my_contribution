package may_24_2023;

//"Write a Java program that return the string using Supplier functional interface."
import java.util.function.Supplier;

public class My_Pre_Fun3 {
	 public static void main(String[] args) {
	        
	        Supplier<String> sup=()-> "I LOVE JAVA";
	        System.out.println(sup.get());
	    }
}
