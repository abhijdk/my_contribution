package Array;

import java.util.Arrays;

public class Array5 
{
	public static void main(String[] args) 
	{
		int []x = {1,2,3};

		int []arr = rotateLeft3(x);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] rotateLeft3(int[] nums) 
	{
       nums[0] = 2;
       nums[1] = 3;
       nums[2] = 1;
       return nums;
	}


}
