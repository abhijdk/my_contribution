package may_exm1;

import java.util.ArrayList;
import java.util.List;

class Employee{
	private String name;
	private int age;
	private double salary;
	public Employee(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
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
		this.age=age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalaey() {
		this.salary=salary;
	}
	public void increment() {
		this.salary=salary+salary*.1;
	}
}

public class MyEmployees{
	public static void main(String[] args) {
		List< Employee> emp=new ArrayList<>();
		emp.add(new Employee("AAA",22, 10000));
		emp.add(new Employee("BBB",23, 12000));
		emp.add(new Employee("CCC",24, 14000));
		emp.add(new Employee("DDD",26, 20000));
		emp.add(new Employee("EEE",28, 10000));
		
		System.out.println("Previous Salary");
        emp.forEach(employee -> {
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        });

        System.out.println("After Increment Of Salary");

        // Increase salary for employees older than 25 by 10%
        emp.stream()
                .filter(employee -> employee.getAge() > 25)
                .forEach(employee -> employee.increment());

        // Print the updated employee information
        emp.forEach(employee -> {
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        });
	}
}
