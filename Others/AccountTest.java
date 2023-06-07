package apr_05_2023_multi_threading;

//Account class
class Account
{
	private int balance;
	
	 protected Account(int balance)
	 {
		this.balance = balance;
	}
	void deposit(int amount)
	{
		balance+=amount;
	}
	 void  withdraw(int amount)
	{
		if (balance<amount)
		{
			System.out.println("'WITHDRAW' Insufficient Balance");
		}
		else
		{
			balance-=amount;
		}
		
	}
	@Override
	public String toString() {
		return "Account [balance is=" + balance + "]";
	}
}


public class AccountTest
{
	public static void main(String[] args) 
	{
		Account ac=new Account(10000);
		//main thread
		ac.deposit(50000);
		ac.withdraw(5000);
		System.out.println(ac);
		
		//multi_Thread_Operation
		
	}
}
/*
Thread depositThread = new Thread(() -> {
for (int i = 0; i < 100; i++) {
    account.deposit(1);
}
});

Thread withdrawThread = new Thread(() -> {
for (int i = 0; i < 50; i++) {
    account.withdraw(2);
}
});

depositThread.start();
withdrawThread.start();
depositThread.join();
withdrawThread.join();
System.out.println("Multi-threaded balance: " + account.getBalance());
}
}
In this test class, we first test the deposit and withdraw methods in a single-threaded context, and then test them in a multi-threaded context. In the multi-threaded test, we create two threads - one that repeatedly deposits $1 into the account, and one that repeatedly withdraws $2 from the account. We then start both threads and wait for them to complete using the join method. Finally, we print the balance of the account to check that it is correct.

Note that in the multi-threaded test, the output may vary between runs because of the non-deterministic nature of concurrent execution. However, the balance should always be correct and there should be no thread interference or errors.





/**/