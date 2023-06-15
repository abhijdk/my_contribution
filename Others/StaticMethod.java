package may_20_2023;

//static method implementation common for all
interface HotDrink
{
	void prepare();

	static void expressPrepare() //o
	{
		System.out.println("Prepare without sugar...");
	}	
}
class Tea implements HotDrink
{
	public void prepare()
	{
		System.out.println("Preparing Tea");
	}	
}
class Coffee implements HotDrink
{
public void prepare()
	{
		System.out.println("Preparing Coffee");
	}
}
public class StaticMethod 
{
	public static void main(String[] args) 
	{
		HotDrink hk1 = new Tea();
		HotDrink hk2 = new Coffee();
		HotDrink.expressPrepare();  //common for all
		hk1.prepare();
      hk2.prepare();		
	}
}
