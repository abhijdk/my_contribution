package may_exm1;

public class Difference_Between_Equals_Operator_And_equals_Method{
	public static void main(String ...s){
		String s1="India";
		String s2="India";
		String s3=new String("India");
		String s4=new String("India");
		System.out.println("\nBy Using == operator\n");
		System.out.println(s1==s2);  //true
		System.out.println(s2==s3);  //false
		System.out.println(s3==s4);  //false
		System.out.println(s4==s1);  //false
		

		System.out.println("\nBy Using .equals() method\n");
		System.out.println(s1.equals(s4));  //true
		System.out.println(s2.equals(s4));  //true
		System.out.println(s3.equals(s4));  //true
		System.out.println(s4.equals(s4));  //true
	}
}
