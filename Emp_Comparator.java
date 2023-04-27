
/*
 * Here I create a Employ Class with class level variable 
 * then initialize these variable by using a parameterized constructor
 * then for showing Employ details I create a toString method
 */
public class Emp_Comparator
{
	int empId;
	String empName;
	String empAdd;
	public Emp_Comparator(int empId, String empName, String empAdd)
	{
		this.empId=empId;
		this.empName=empName;
		this.empAdd=empAdd;
	}
	@Override
	public String toString() {
		return "Emp_Comparator [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + "]";
	}	
}