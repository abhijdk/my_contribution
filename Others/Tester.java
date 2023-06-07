package apr_05_2023_multi_threading;
import java.util.Iterator;


class TicketDispenser
{
	final private int maxSeat=500;
	int allotedSeats=0;
	public int allotSeatNumber()
	{
		if (allotedSeats<maxSeat)
		{
			allotedSeats++;
			return allotedSeats;
		}
		else
		return -1;	
	}
}
/*
final private int maxSeat=100;
	int allotSeatNumber=0;
	public int allotSeatNumber()
	{
		if (allotSeatNumber<maxSeat)
		{
			allotSeatNumber++;
			return allotSeatNumber;
		}
		else
		return -1;
	}
/**/

public class Tester 
{
	public static void main(String[] args) throws InterruptedException
	{
		TicketDispenser ob = new TicketDispenser();
		Thread [] th=new Thread[200];
		for(int i=0;i<th.length;i++)
		{
			th[i]=new Thread()
					{
						public void run()
						{
							int seat=ob.allotSeatNumber();
							System.out.println("Seat "+seat+" by "+Thread.currentThread().getName());
						}
					};	
		}
		for(Thread thread:th)
		{
			thread.start();
			thread.join();
		}
		
		
		
		
		/**/
		/*Runnable r1 = () ->
		{
			for(int i=1;i<100;i++)
			{
				int seatNumber = ob.allotSeatNumber();
				if(seatNumber!=-1)
				{
					System.out.println("Your seat Booked Seat Number Is: "+seatNumber);
				}
				else
				{
					System.out.println("All seats are Booked.");
				}
			}
		};
		
		Thread t1 = new Thread(r1,"t1");
		Thread t2 = new Thread(r1,"t2");
		Thread t3 = new Thread(r1,"t3");
		Thread t4 = new Thread(r1,"t4");
		t1.start();t1.join();
		t2.start();t2.join();
		t3.start();t3.join();
		t4.start();t4.join();/**/
	}
}
