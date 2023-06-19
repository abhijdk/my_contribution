//Given an integer array length 2,return true if it contains a number 2 or 3. 

package com.abhi.array_basic;

public class ArrayDemo11 {

	public static void main(String[] args) 
	{
		int []x = {2,5};
	    boolean b = has2Or3(x);
	    System.out.println("Array contains 2 or 3 :"+b);
	}
	
	public static boolean has2Or3(int[] nums) 
	{
		if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) 
			return true;
		else
		    return false;
	}

}
