package may_20_2023;

/*
 * Default methods are having low priority 
 * than normal methods (Concrete Method). 
 * class is having more power than interface
 */
interface I
{
	default void demo()
	{
		System.out.println("Demo Method in interface I1");
	}
}

class A
{
	public void demo()
	{
		System.out.println("Demo Method in class A");
		
	}
}

class B extends A implements I
{	
	
}

public class DefaultMethodPriority
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.demo();
	}
}
