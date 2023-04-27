

/*
 * Here I create a Employ Class with class level variable 
 * then initialize these variable by using a parameterized constructor
 * then for showing Employ details I create a toString method
 * then for order the Employ data I implements Comparable interface 
 * 							then I write a method compareTo 
 * 						and that method return the shorting order
 */
public class Emp_Comparable implements Comparable<Emp_Comparable>
{
	int empId;
	String empName;
	String empAdd;
	public Emp_Comparable(int empId, String empName, String empAdd)
	{	
		this.empId=empId;
		this.empName=empName;
		this.empAdd=empAdd;
	}
	
	@Override
	public String toString() {
		return "Emp_Comparable [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + "]";
	}

	public int compareTo(Emp_Comparable e)
	{
//		return this.empId-e.empId; // Sorting basing on empID
//		return this.empName.compareTo(e.empName); // Sorting basing on empName
		return this.empAdd.compareTo(e.empAdd); // Sorting Basing on empAdd
	}
}