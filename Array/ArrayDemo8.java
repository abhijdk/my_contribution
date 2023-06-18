//Given an array of integers, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, return 0 if the array is having length 0.

package com.ravi.array_basic;

public class ArrayDemo8 {

	public static void main(String[] args) 
	{
		int []x = {15,16};
		int sum = sum2(x);
		System.out.println("Sum is :"+sum);
	}

	public static int sum2(int[] nums) 
	{ 
		if (nums.length == 1)
		    return nums[0];
		
		if (nums.length == 0) 
			return 0;
		else
		    return nums[0] + nums[1];
	}

}
