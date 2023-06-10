package apr_25_2023_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

class Product  implements Comparable<Product>
{
	private Integer productNumbe;
	private String productName;
	private Double productPrice;
	protected Product(Integer productNumbe, String productName, Double productPrice) {
		super();
		this.productNumbe = productNumbe;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productNumbe=" + productNumbe + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	public int compareTo(Product p)
	{
		return this.productName.compareTo(p.productName);
	}
    
	
	
}


public class ProductDemo
{
	public static void main(String[] args) 
	{
		ArrayList<Product> al = new ArrayList<Product>();
		Product p1=new Product(333, "Camera", 15000.89);
		al.add(p1);
		al.add(new Product(222, "Mobile", 25000.89));
		al.add(new Product(111, "Laptop", 55000.89));
		
		Collections.sort(al);
		
		al.forEach(prod -> System.out.println(prod));
	
	}
}
