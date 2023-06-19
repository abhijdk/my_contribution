//Given an array of integers length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

package com.abhi.array_basic;

import java.util.Arrays;

public class ArrayDemo6 {
	public static void main(String[] args) 	{
		int []x = {11,22,33};
		int []y = reverse3(x);
		System.out.println("Reverse is :"+Arrays.toString(y));
	}

	public static int[] reverse3(int[] nums) 	{ 
		int[] myArray = new int[3];	 
	    myArray[0] = nums[2]; 
	    myArray[1] = nums[1]; 
	    myArray[2] = nums[0]; 
	    return myArray;
	}
}
