package may_exm1;


import java.util.Arrays;

public class Array_a54{
	private static void swap_nums(int[] nums, int i, int j) {
		int t_nums = nums[i];
		nums[i] = nums[j];
		nums[j] = t_nums;
	}

	public static void main (String[] args)	{
		int[] nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };
        System.out.println("Original array:\n"+Arrays.toString(nums));
        for (int i = 1; i < nums.length; i += 2)
		{
			if (nums[i - 1] > nums[i]) {
				swap_nums(nums, i - 1, i);
			}

			if (i + 1 < nums.length && nums[i + 1] > nums[i]) {
				swap_nums(nums, i + 1, i);
			}
		}
		System.out.println("\nArray with every second element is greater than its left and right elements:\n"+Arrays.toString(nums));
	}
}




/* Out Put
Original array:
[1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14]

Array with every second element is greater than its left and right elements:
[1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]
 */
/**/
