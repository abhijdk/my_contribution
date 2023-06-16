package may_23_2023;

//Find the length of a String by using lambda
import java.util.Scanner;

@FunctionalInterface
interface Length
{
	 int getLength(String str);
}
public class MyLambda 
{
	public static void main(String[] args) 
	{
		 Length l =  str -> str.length();		

        Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name :");
		String name = sc.nextLine();
		System.out.println("Length of "+name+" is :"+l.getLength(name));
	}
}
