package may_24_2023;

//"Write a Java program that converts a number to a string using a predefined functional interface."
import java.util.Scanner;
import java.util.function.Function;

public class My_Pre_Fun2 {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a NUMBER");
	        int number = sc.nextInt();
	        
	        Function<Integer, String> f=x-> String.valueOf(number);
	        System.out.println(f.apply(number));
	    }
}
