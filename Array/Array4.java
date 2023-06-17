package Array;


public class Array4 {

	public static void main(String[] args) 
	{
		int []x = {15,15,200};
		int total = sum3(x);
		System.out.println("Sum is :"+total);
	}
	
	public static int sum3(int[] nums) 
	{
		return nums[0] + nums[1] + nums[2];
	}


}
