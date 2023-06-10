package apr_25_2023_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Customer implements Comparator<Customer> 
{
	private Integer customerNumbe;
	private String customerName;
	private Double customerBill;
	protected Customer(Integer customerNumbe, String customerName, Double customerBill) 
	{
		super();
		this.customerNumbe = customerNumbe;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}
	@Override
	public String toString() {
		return "Customer [customerNumbe=" + customerNumbe + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	@Override
	
	public int compare(Customer o1, Customer o2) {
		return this.customerBill.compareTo(o1.customerBill);
	}
}

public class CustomerDemo
{
	public static void main(String[] args)
	{
		ArrayList< Customer> al=new ArrayList<Customer>();
		al.add(new Customer(101, "AAA", 152.2));
		al.add(new Customer(105, "EEE", 105.2));
		al.add(new Customer(103, "BBB", 125.2));
		al.add(new Customer(104, "DDD", 115.2));
		al.add(new Customer(102, "CCC", 153.2));
		
		Collections.sort(al);
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		System.out.println("\n");
		al.forEach(prod -> System.out.println(prod));
	}
}
