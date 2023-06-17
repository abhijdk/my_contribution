public class ArrayDemo2 
{
	public static void main(String[] args)
	{
		int []x = {12,12,90,89,56,12};
		boolean b = sameFirstLast(x);
		System.out.println(b);
	}

	public static boolean sameFirstLast(int[] nums)
	{
		if (nums.length >= 1 && nums[0] == nums[nums.length-1]) 
			return true;
		else
		   return false;
	}

}
