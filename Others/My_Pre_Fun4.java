package may_24_2023;

//"Write a Java program that find the length of a string using Consumer functional interface."
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class My_Pre_Fun4 {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Name");
	        String s=sc.nextLine();
	        
	        Consumer<String> con=x->System.out.println(x.length());
	        con.accept(s);
	    }
}
