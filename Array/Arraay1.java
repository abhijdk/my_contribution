package Array;


//Given an array of integers, return true if 15 appears as either the first or last element in the array. The array will be length 1 or more.


public class Arraay1 {

	public static void main(String[] args) 
	{
		int []x = {19,78,45,89,19};
		
      boolean b = firstLast(x);
      System.out.println("15 is available :"+b);
	}
	
	public static boolean firstLast(int[] nums) 
	{
		if (nums[0] == 15 || nums[nums.length-1] == 15) 
			return true;
		else 
			return false;
	}
}