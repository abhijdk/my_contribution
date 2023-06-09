package apr_13_2023_exception_propagation;

public class Propogation 
{
	public static void main(String[] args)
	{
		System.out.println("Main Start");
		m1();
		System.out.println("Main End");
	}
	public static void m1()
	{
		System.out.println("m1 start");
		m2();
		System.out.println("m1 end");
	}
	public static void m2()
	{
		System.out.println("m2 start");
		System.out.println(10/0);
		System.out.println("M2 End");
	}
}

