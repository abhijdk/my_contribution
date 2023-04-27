

/*
 * here I create a new class for implementing Comparator interface
 * (for order the Employ data)  
 * then I write a parameterized method compare 
 * (that method having Employ class name as ) 
 * 	and that method return the shorting order
 */
import java.util.Comparator;

public class ComparatorLogic implements Comparator<Emp_Comparator>
{
@Override
public int compare(Emp_Comparator o1, Emp_Comparator o2) 
{
//	return o1.empId-o2.empId;
//	return o1.empName.compareTo(o2.empName);
	return o1.empAdd.compareTo(o2.empAdd);
}

}

