package may_25_2023;

import java.util.function.Supplier;

class Student{
	private int sId;
	private String sName;
	private float fee;
	protected Student(int sId, String sName, float fee) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", fee=" + fee + "]";
	}
	
	
}
public class Lambda_Supplier_1 {
	public static void main(String[] args) {
		Supplier <Student> mySpu=()-> new Student(101, "OMM",2500);
		System.out.println(mySpu.get());
	}
}
