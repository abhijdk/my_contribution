package may_19_2023;
/*
 * From Java 8 onwards, 
 * a new feature was introduced in Java 
 * where it became possible to write 
 *  Lambda Expression to Short the code
 * here I am using another class Named Restaurant
 */
interface Hot_Drink{
	void drink();
}
class Restaurant{
	public void createObj(Hot_Drink hd)
	{
		hd.drink();
	}
}

public class Main{
	public static void main(String[] args) {
		Hot_Drink tea=() ->System.out.println("Tea Is ready for serve");
		Hot_Drink coffee=() ->System.out.println("Coffee Is ready for serve");
		Restaurant r=new Restaurant();
		r.createObj(tea);
		System.out.println("\n.............................\n");
		r.createObj(coffee);
	}
}