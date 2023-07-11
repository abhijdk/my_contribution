package Demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private int age;
	private String gender;
	private String department;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department + "]";
	}
	protected Employee(String name, int age, String gender, String department) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
	}
	
}


public class Program1 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("ABC", 30, "Female", "HR"));
        emp.add(new Employee("PQR", 25, "Male", "IT"));
        emp.add(new Employee("LMN", 30, "Male", "HR"));
        emp.add(new Employee("XYZ", 28, "Female", "IT"));


//        Set<String> distinctDepartments = new HashSet<String>();
//        for (Employee employee : emp) {
//            distinctDepartments.add(employee.getDepartment());
//        }
//
//        for (String department : distinctDepartments) {
//            System.out.println(department);
//        }


        emp.stream().map(Employee::getDepartment).collect(Collectors.toSet()).forEach(System.out::println);;

    }

}
