package mar_23_2023_oops_again;

import java.util.Scanner;

//Employee class
class Employee 
{
	protected String name;
	protected int employeeId;
	protected double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, int employeeId, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	}


//Manager Class
class Manager extends Employee
{

	public Manager(String name, int employeeId, double salary) {
		super(name, employeeId, salary);
	}
	
	private ManagerType type;
	
	public ManagerType getType() {
		return type;
	}
	public void setType(ManagerType type) {
		this.type = type;
	}
	public Manager(String name, int employeeId, double salary, ManagerType type) {
		super(name, employeeId, salary);
		this.type = type;
		this.setSalary(salary);
	}
	@Override
	public void setSalary(double salary) {
		if (this.type==ManagerType.HR)
			super.setSalary(salary+10000);
		else if (this.type==ManagerType.SALES)
			super.setSalary(salary+5000);
	}
	@Override
	public String toString() {
		return super.toString()+"Manager [type=" + type + "]";
	}
	
	
	
}


//Clerk class
class Clerk extends Employee
{

	public Clerk(String name, int employeeId, double salary) {
		super(name, employeeId, salary);
	}
	
	private int speed;
	private int accuracy;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public Clerk(String name, int employeeId, double salary, int speed, int accuracy) {
		super(name, employeeId, salary);
		this.speed = speed;
		this.accuracy = accuracy;
		this.setSalary(salary);
	}
	@Override
	public void setSalary(double salary) {
		
		boolean amount=true;
		if(amount && this.speed>70 && this.accuracy>80)
		{
			super.setSalary(salary+1000);
			amount=false;
		}
		else
			super.setSalary(salary);
	}
	@Override
	public String toString() {
		return super.toString()+"Clerk [speed=" + speed + ", accuracy=" + accuracy + "]";
	}
	

}


//ManagerTYpe
enum ManagerType 
{
	HR,SALES
}

//EmployeeTester class with main method
public class EmployeeTester 
{
	public static void main(String[] args) 
	{
		/*Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Role of the Employee: ");
		String post=sc.nextLine().toUpperCase();
		ManagerType role=null;
		if (ManagerType.HR==ManagerType.valueOf(post.trim()))
		{
			role=ManagerType.HR;
		}
		else if (ManagerType.SALES==ManagerType.valueOf(post.trim()))
		{
			role=ManagerType.SALES;
		}
		Manager m1= new Manager("Abhi", 101, 40000, role);
		System.out.println(m1);/**/
		
		Clerk c1=new Clerk("Mantu", 102, 40000, 95, 90);
		System.out.println(c1);
	}
}