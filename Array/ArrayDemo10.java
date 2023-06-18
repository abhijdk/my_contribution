//Given an array of integers, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

package com.ravi.array_basic;

import java.util.Arrays;

public class ArrayDemo10 {

	public static void main(String[] args) 	{
		int []x = {12};
		int []y = makeEnds(x);
		System.out.println("Array value is :"+Arrays.toString(y));
		
		int [] p= {12,89,78,34,99};
		int []q = makeEnds(p);
		System.out.println("Array value is :"+Arrays.toString(q));		
	}
	
	public static int[] makeEnds(int[] nums) 	{ 
		int[] myArray = new int[2];
		
		if (nums.length == 1)	{
			myArray[0] = nums[0]; 
			myArray[1] = nums[0];
		} 
		else 	{
			myArray[0] = nums[0];
			myArray[1] = nums[nums.length-1];
		}
		return myArray;
	}
}
