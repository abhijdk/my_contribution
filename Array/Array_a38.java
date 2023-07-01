package may_exm1;


import java.util.HashMap;
import java.util.Map;

public class Array_a38 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4, 2, 2, 2};
        int majorityElement = getMajorityElement(nums);
        
        if (majorityElement != -1) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }
    
    public static int getMajorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = nums.length / 2;
        
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > majorityCount) {
                return num;
            }
        }
        
        return -1; // No majority element found
    }
}
