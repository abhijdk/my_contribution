package lambda;

/*
 * write a program for lambda expression
 * so I write 3 functional interface 
 * and I implemented that functional 
 * interface to LambdaExpression  in 
 * a class (that class name is InitialPointOfLambda)
 */

//1st Interface
import java.util.ArrayList;
import java.util.HashSet;

interface InterfaceA 
{
	void m1(HashSet hs, ArrayList al);
}


//2nd Interface
interface InterfaceB
{
	String m2(int a, String s,char c );
}

//3rd Interface
interface InterfaceC
{
	int[] m3(int arr[], ClassB b);
}


//A normal class for 3rd Interface
class ClassB {

}

public class InitialPointOfLambda
{
	public static void main(String[] args) 
	{
		InterfaceA a=(HashSet hs, ArrayList al)-> System.out.println("1st method With Lambda");
		a.m1(new HashSet(), new ArrayList());
		
		InterfaceB b=(int i,String s,char c)->
			{
				System.out.println("2nd method With Lambda");
				return "Java";
			};
		b.m2(10,"Java",'J');
		
		InterfaceC c=(int arr[], ClassB o)->
			{
				System.out.println("3rd Method With Lambda");
				return arr;
			};
		c.m3(new int[]{1, 2, 3}, new ClassB());
	}
}
