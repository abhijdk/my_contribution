package may_19_2023;
/*
 * From Java 8 onwards, 
 * a new feature was introduced in Java 
 * where it became possible to write concrete 
 * methods inside an interface.
 */
interface HotDrink{
	void drink();
	default void xpressTea() {}// Default method Inside Interface (java 8v)
}
public class MyInterfaceDefaultMethod {
	public static void main(String[] args) {
		HotDrink tea=new HotDrink() {
			@Override
			public void drink() {
				System.out.println("Tea Is ready for serve");
			}
			@Override
			public void xpressTea() {
				System.out.println("xpressTea Is ready for serve");
			}
		};
		tea.drink(); tea.xpressTea();
		System.out.println("\n.............................\n");
		HotDrink coffee=new HotDrink() {
			@Override
			public void drink() {
				System.out.println("Coffee Is ready for serve");
			}
		};
		coffee.drink();
	}
}
