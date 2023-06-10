package apr_24_2023_ArrayList;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class StoreObject 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FileOutputStream fos = new FileOutputStream("D:\\ObjectFile.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

			System.out.print("How many objects you want to write? ");
			int n =Integer.parseInt(br.readLine());     
			ArrayList<Student> al=new ArrayList<Student>();
			for(int i=0; i<n; i++)                     
			{
				Student s1 = Student.getStudentObject();
				oos.writeObject(s1);
				al.add(s1);
			}
			System.out.println(al);
	}
}


class Student implements Serializable
{
	private Integer studentId;
	private  String studentName;
	private  Double studentFees;
	private  Date dateOfAdmission;
	static Scanner sc=new Scanner(System.in);
	protected Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission)
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static Student getStudentObject()
	{
		System.out.print("Student Id: ");
		Integer studentId=sc.nextInt();
		System.out.print("Student Name");
		String studentName=sc.nextLine();
		sc.next();
		System.out.print("Student fee");
		Double studentFees=sc.nextDouble();
		Date d=new Date();
		Student s1=new Student(studentId, studentName, studentFees, d);
		return new Student(studentId, studentName, studentFees, d);
	}

//	@Override
//	public String toString() {
//		return "[studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
//				+ ", dateOfAdmission=" + dateOfAdmission + "]";
//	}
	
	
	
}


public class GetObj
{
	public static void main(String[] args)  throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\ObjectFile.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		try(fis; ois)
		{
			Student e;
		while((e = (Student) ois.readObject()) !=null)
			{
				System.out.println(e.toString());
			}
		}
		catch (Exception ee) 
		{
			System.out.println("End of file reached :"+ee);
		}
		
	}
}
