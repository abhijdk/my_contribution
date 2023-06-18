//Given 2 integer arrays, a and b, each length is 3, return a new array length 2 containing their middle elements.

package com.ravi.array_basic;

import java.util.Arrays;

public class ArrayDemo9 {
	public static void main(String[] args) 	{
		int []x = {65,99,78};
		int []y = {15,98,99};
		
		int []arr = middleWay(x, y);
		System.out.println("Middle element is :"+Arrays.toString(arr));
	}
	
	public static int[] middleWay(int[] a, int[] b)	{
		int[] myArray = new int[]{a[1], b[1]};  
		return myArray;
	}
}
