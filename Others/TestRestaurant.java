package mar_28_2023;

//HotDrink interface
interface HotDrink 
{
	public abstract void prepare();
}


//Horlicks class
class Horlicks implements HotDrink {

	@Override
	public void prepare() 
	{
		System.out.println("Horlicks is prepare for serve");
	}

}

//Coffee class
class Coffee implements HotDrink {

	@Override
	public void prepare() 
	{
		System.out.println("Coffee is prepare for serve");
	}

}

//Boost class
class Boost implements HotDrink {

	@Override
	public void prepare() 
	{
		System.out.println("Boost is prepare for serve");
	}

}

//Tea class
class Tea implements HotDrink {

	@Override
	public void prepare() 
	{
		System.out.println("Tea is prepare for serve");
	}

}

//TestRestaurant class with main method
public class TestRestaurant 
{
	public static void main(String[] args) 
	{
		Restaurant r=new Restaurant();
		r.createObject(new Tea());
		r.createObject(new Coffee());
		r.createObject(new Horlicks());
		r.createObject(new Boost());
	}
}
