package apr_10_2023_user_defined_un_checked_exception;

import java.util.Scanner;
/*
*How to create User defined un_checked exception?
ans.
===
If any exception class whether it is a predefined exception or user defined exception, 
if extending from runtime from exception class then it is called un_checked exception &
here handling is not composelory. That means even if we don't write try-catch or throws
statement we will not get any compilation error.
/**/
class InvalidAadharException 
extends RuntimeException //un_checked_exception
{												//Handling is not compulsory				
InvalidAadharException()
{

}
InvalidAadharException(String msg)
{
super(msg);
}
}

class AadharLogic 
{
	public static String aadharLogic(String input)
	{
		if (input.length()!=12)
			throw new InvalidAadharException("InvalidAadharException");
		return input;
	}
}


public class AadharTest 
{
	public static void main(String[] args) 
	{
		//1st approach
		/*try
		{
			String s=AadharLogic.aadharLogic("258525406985");
			System.out.println(s+" is a valid aadhar number");
		}
		catch(InvalidAadharException e)
		{
			System.out.println("Error***"+e.getMessage());
		}/**/
		//2nd approach
		
		/*try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter aadhar number: ");
			String s=AadharLogic.aadharLogic(sc.nextLine());
			System.out.println(s+" is a valid aadhar number");
		}
		catch(InvalidAadharException e)
		{
			System.out.println("Error***"+e.getMessage());
		}/**/
		//3rd approach
		
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter Your aadhar number: ");
			String s=AadharLogic.aadharLogic(sc.nextLine());
			System.out.println(s+" is a valid aadhar number");
		}
		catch(InvalidAadharException e)
		{
			System.err.println("Error***"+e.getMessage());
		}		
	}
}
