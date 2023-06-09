package apr_14_2023_multithreaded;

class Account implements Runnable 
{
	private double balance=50000;
	double withdrawal;
	
	public Account(double withdrawal)
	{
		this.withdrawal=withdrawal;
	}
	public synchronized  void run()
	{
		if(balance<=withdrawal)
		{
			try
			{
				throw new Insufficient_Balance_Exception(Thread.currentThread().getName()+"\n Amount Withdrawal UNsuccessfully \n Available balance is "+balance);
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
			//System.out.println(Thread.currentThread().getName()+"\n Amount Withdrawal UNsuccessfully \n Available balance is "+balance);
		}
		else
		{
			balance-=withdrawal;
			System.out.println(Thread.currentThread().getName()+"\n Amount Withdrawal successfully \n remaining balance after withdrawale is "+balance);
		}
	}
	
}


class Insufficient_Balance_Exception extends Exception
{
	public Insufficient_Balance_Exception()
	{
		
	}
	public Insufficient_Balance_Exception(String msg)
	{
		super(msg);
	}
}


public class Test_Account  
{
	public static void main(String[] args) 
	{
		Account a=new Account(40010);
		Thread t1=new Thread(a,"Ravi Sir");
		Thread t2=new Thread(a, "Hk sir");
		t1.start();
		t2.start();
		
	}
}
