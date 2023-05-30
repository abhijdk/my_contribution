package mar_10_2023;

import java.util.Date;
import java.util.Scanner;

class Employee
{
	private Integer employeeId;
	private String employeeName;
	private Date dateOfJoining;
	public Employee(Integer employeeId, String employeeName, Date dateOfJoining) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfJoining = dateOfJoining;
	}
	
	public String toString() {
		return "Employee [employeeId= " + employeeId + ", employeeName= " + employeeName + ", dateOfJoining= "+dateOfJoining+"]";
	}
	
}

public class EmployeeInfo
{

	public static void main(String[] args) 
	{
		System.out.print("Enter array size");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		Employee [] emp=new Employee[length];
		for (int i=0;i<emp.length;i++)
		{
			System.out.print("Enter Employee Id [ "+i+" ]");
			int id=sc.nextInt();
			System.out.print("Enter Employee Name [ "+i+" ]");
			String name=sc.nextLine();
			name=sc.nextLine();
			
			Date date = new Date();
			emp[i]=new Employee(id,name,date);
		}
		for (Employee x:emp)
		{
			System.out.println(x);
		}
	}

}
