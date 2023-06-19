//Given an integer array length 2, 
//return true if it does not contain a number 2 or 3. 

package com.ravi.array_basic;

public class ArrayDemo12 {

	public static void main(String[] args) 
	{
		int []x = {13,24};
	    boolean b = has2OR3(x);
	    System.out.println("Array does not contain 2 or 3 :"+b);
	}
	
	 public static boolean has2OR3(int[] nums) 
	 {
		 if (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3) 
			 return true;
		 else
		     return false;
     }

}
