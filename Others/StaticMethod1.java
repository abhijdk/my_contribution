package may_20_2023;

interface Vehicle
{
	static void move()
	{
		System.out.println("Static method of Vehicle");
	}
}
class StaticMethod1 implements Vehicle
{
	
  	public static void main(String[] args) 
	{
	    Vehicle.move(); 
	    
	    
//		move();   //error

//		StaticMethod1.move(); //error

        StaticMethod1 sm = new StaticMethod1(); 
        
//		sm.move(); //error
	} 
}
