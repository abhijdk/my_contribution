package apr_14_2023_multithreaded;

class WaterPark implements Runnable
{
	private int avalable=2;
	int book;
	int ticketNo=100;
	public WaterPark(int book)
	{
		this.book=book;
	}
	public synchronized void run()
	{
		if(avalable<book)
		{
			System.out.println("Ticket is not avalable for "+Thread.currentThread().getName());
		}
		else
		{
			ticketNo++;
			avalable-=book;
			System.out.println("Ticket no is "+ticketNo+" booked for "+Thread.currentThread().getName());
		}
	}
}

public class Test_WaterPark
{
	public static void main(String[] args) 
	{
		WaterPark a=new WaterPark(1);
		Thread t1=new Thread(a,"Ravi Sir");
		Thread t2=new Thread(a, "Hk sir");
		Thread t3=new Thread(a, "Prasanta sir");
		t1.start();
		t2.start();
		t3.start();
		
	}
}