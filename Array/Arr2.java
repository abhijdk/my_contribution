//creation of an array object using new keyword
package com.abhi.array_demo;
public class Arr2{  
public static void main(String args[]){  
		int []x=new int[3];
		x[0]=11;
		x[1]=22;  
		x[2]=33; 		
		
		for(int y : x)
		System.out.println(y);

		System.out.println("......................");

		int []p=new int[]{12,89,90,99};

	for (int q : p)
		System.out.println(q);
	}
}  
