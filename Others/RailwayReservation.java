package apr_06_2023_proble_with_multithreading;

class Reservation implements Runnable
{
	int avalable=3;
	int want;
	public Reservation(int want)
	{
		this.want=want;
	}
	@Override
	public synchronized void run()
	{
		if (avalable>=want)
		{
			System.out.println(want+" seat is alort for "+Thread.currentThread().getName());
			avalable-=want;
		}
		else
			System.out.println("Seat is not avalable for "+Thread.currentThread().getName());
	}
	
}


public class RailwayReservation
{

	 public static void main(String[] args)
		{
			Reservation r=new Reservation(1);
			Thread t1=new Thread(r,"Ravi SIR");
			Thread t2=new Thread(r,"HK SIR");			
			Thread t3=new Thread(r,"Prasanta");
			Thread t4=new Thread(r,"Kishan");
			t1.start(); t2.start();
			t3.start(); t4.start();
		}

}
