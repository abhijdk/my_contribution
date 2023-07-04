import java.util.ArrayList;
import java.util.List;

public class Array_a55 {
    public static List<Integer> findEquilibriumIndices(int[] nums) {
        List<Integer> equilibriumIndices = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return equilibriumIndices;
        }

        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            // Exclude the current element from the left sum
            totalSum -= nums[i];

            if (leftSum == totalSum) {
                equilibriumIndices.add(i);
            }

            // Add the current element to the left sum for the next iteration
            leftSum += nums[i];
        }

        return equilibriumIndices;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        List<Integer> equilibriumIndices = findEquilibriumIndices(nums);

        if (equilibriumIndices.isEmpty()) {
            System.out.println("No equilibrium indices found.");
        } else {
            System.out.println("Equilibrium indices found at:");
            for (int index : equilibriumIndices) {
                System.out.println(index);
            }
        }
    }
}
