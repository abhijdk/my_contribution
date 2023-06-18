//Given an array of integers length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

package com.ravi.array_basic;

import java.util.Arrays;

public class ArrayDemo7 {

	public static void main(String[] args) 
	{
		int []x = {45,222,138};
		
		int []y = maxEnd3(x);
		System.out.println("Return larger value :"+Arrays.toString(y));
	}
	
	   public static int[] maxEnd3(int[] nums) 
	   {
		int larger = Math.max(nums[0], nums[2]);  //max is Math class static method
		System.out.println("larger value is :"+larger);
		nums[0] = larger;
		nums[1] = larger; 
		nums[2] = larger; 
		return nums;
	   }

}
