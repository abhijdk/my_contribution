package may_19_2023;
/*
 * From Java 8 onwards, 
 * a new feature was introduced in Java 
 * where it became possible to write concrete 
 * methods inside an interface .
 * Here I am using Lambda Expression to Short the code
 */
interface HotDrinks{
	void drink();
	default void xpressTea() {
		System.out.println("xpressTea Is ready for serve");
		}// Default method Inside Interface (java 8v)
}
public class MyInterfaceDefaultMethodUsingLambda {
	public static void main(String[] args) {
		HotDrinks tea=()->System.out.println("Tea Is ready for serve");
		tea.drink(); tea.xpressTea();
		
		System.out.println("\n.............................\n");
		HotDrinks coffee=() ->System.out.println("Coffee Is ready for serve");
		coffee.drink();
	}
}
