package may_exm1;

import java.util.ArrayList;
import java.util.List;

class Employee{
	private String name;
	private int age;
	private double salary;
	protected Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public void increaseSalary(double percentage) {
        salary += salary * percentage;
    }
	
}
public class MyEmployee {
public static void main(String[] args){
	List<Employee> list=new ArrayList<>();
	Employee e1=new Employee("Aa", 21, 10000);
	Employee e2=new Employee("Ba", 22, 12000);
	Employee e3=new Employee("Ca", 23, 15000);
	Employee e4=new Employee("Dd", 28, 16000);
	Employee e5=new Employee("Ee", 26, 20000);
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	list.add(e5);
	
	System.out.println("Previous Salay");
	for (Employee employee : list) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println();
    }
	
	System.out.println("After Increment Of Salary");
	
	// Increase salary for employees older than 25 by 10%
    for (Employee employee : list) {
        if (employee.getAge() > 25) {
            employee.increaseSalary(0.10);
        }
    }

    // Print the updated employee information
    for (Employee employee : list) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println();
    }
    }
}
