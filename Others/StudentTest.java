package mar_23_2023_oops;

import java.util.Scanner;

//Student class
class Student
{
	int studentId ; 
	String name ;
	double examFee;
	public String displayDetails()
	{
		return "";
	}
	public double payFee(double amount)
	{
		return amount;
	}
	public Student() {
		super();
	}
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	
}



//DayScholar class
class DayScholar extends Student 
{

	double transportFee;

	public DayScholar(int studentId, String name, double examFee,double transportFee) {
		super(studentId, name, examFee);
		this.transportFee=transportFee;
	}
	public double payFee(double deposit1Amount)
	{
		return transportFee+examFee-deposit1Amount;
	}



	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	
	
}

//Hosteller class
class Hosteller extends Student
{
	double hostelFee;
	


	public Hosteller(int studentId, String name, double examFee,double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee=hostelFee;
	}
	public double payFee(double deposit1Amount)
	{
		return hostelFee+examFee-deposit1Amount;
	}


	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	
}

//StudentTest with main method
public class StudentTest {

	public static void main(String[] args) 
	{ 
		double examFee=1000;
		double transportFee=2500;
		double hostelFee=5000;
		
		System.out.println("ExamFee-1000.00/-\nTransportFee-2500.00/-\nHostelFee-5000.000/-");
		Scanner sc=new Scanner(System.in);
		System.out.print("How Much Amount You Pay Now: ");
		double deposit1Amount=sc.nextInt();
		
		DayScholar d1=new DayScholar(101, "Abhi", examFee, transportFee);
		System.out.println(d1);
		System.out.println("You should Return: "+d1.payFee(deposit1Amount));
		
		Hosteller h1=new Hosteller(102, "Mantu", examFee, hostelFee);
		System.out.println(h1);
		System.out.println("You should Return: "+h1.payFee(deposit1Amount));
	}

}
