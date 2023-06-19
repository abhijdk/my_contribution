//How to retrieve the values of an array by using for loop and for each loop and toString() method 

package com.ravi.array_demo;
import java.util.Arrays;
public class Arr1 
{
	public static void main(String[] args) 
	{
		int []a ={12,45,78,90,87,9};

		Arrays.sort(a);

        System.out.println("The length of array is :"+a.length);

        System.out.println("Elements of an array using toString()...");
		System.out.println(Arrays.toString(a)); 
		
		System.out.println("Elements of an array using for loop...");
		
		for(int i=0;i<a.length ;i++)  
		{
			System.out.println(a[i]);
		}

         System.out.println("Elements of an array using for each loop");

		for(int x : a) 
		{
			System.out.println(x);
		}	

	}
}
