package mar_27_2023_oops;

//Shape class
class Shape 
{
	private int x;

	public Shape(int x)
	{
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
}


//Square class
class Square extends Shape 
{

	public Square(int x)
	{
		super(x);
	}

	public void areaOfSquare()
	{
		System.out.println("Area of the Squre :"+getX()*getX());
		//int area=getX()*getX();
	}

}


//Rectangle class
class Rectangle extends Shape 
{
	private int length;

	public Rectangle(int x, int length)
	{
		super(x);
		this.length = length;
	}

	public void areaOfRectangle()
	{
		System.out.println("Area of the Rectangle :"+getX()*length);
		//int area=getX()*length;
	}
}

//TestShape class with main method
public class TestShape {

	public static void main(String[] args)
	{
		Square s1=new Square(5);
		Rectangle r1=new Rectangle(5, 10);
		
		s1.areaOfSquare();
		r1.areaOfRectangle();
	}

}
