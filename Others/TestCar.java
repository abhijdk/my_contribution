package mar_28_2023;

//Car class
abstract class Car 
{
	protected int speed=90;

	protected Car() 
	{
		super();
		System.out.println("Car Constructor");
	}
	public void getDetails()
	{
		System.out.println("That Car is HighSpeed car & The speed of the car is: "+speed);
	}
	public abstract void run();
	
}

//Naxon class
class Naxon extends Car {
	//speed, details and run method.
	@Override
	public void run()
	{
        System.out.println("The Naxon  run() method");
	}

}

public class TestCar {
		
	public static void main(String[] args)
	{
		Naxon naxon = new Naxon();
        System.out.println("Speed Of the car is: " + naxon.speed);
        naxon.getDetails();
        naxon.run();	

	}

}
