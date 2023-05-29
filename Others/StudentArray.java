package mar_09_2023;

/*
Write a Program to print student information using Array
Create a BLC class called Student
Instance Variable:
private Integer studentId;
private String studentName;
Create a parameterized constructor to initialize the instance variables.
Override toString() method to print Student class properties.
Create an ELC class called StudentArray which contains main method
In this main method create a Student array object by taking the array size from the user input.
Initialize 5 Students object data using for loop by taking the input from the user.
Print the Student object data using for each loop
 */
import java.util.Arrays;
import java.util.Scanner;
public class StudentArray 
{
	public static void main(String[] args)
	{
		System.out.print("Enter array size");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		Student [] stu=new Student[length];
		for (int i=0;i<stu.length;i++)
		{
			System.out.print("Enter Student Id [ "+i+" ]");
			int id=sc.nextInt();
			System.out.print("Enter Student Name [ "+i+" ]");
			String name=sc.nextLine();
			name = sc.nextLine();
			stu[i]=new Student(id,name);
		}
		for (Student x:stu)
		{
			System.out.println(x);
		}
	}
}
