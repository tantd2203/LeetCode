package Interview;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Initialize an empty hash map
        Map<Integer, Integer> numMap = new HashMap<>();

        // Iterate over the array of numbers with their indices
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // Check if the complement is in the hash map
            if (numMap.containsKey(complement)) {
                // If it is, return the indices
                return new int[] { numMap.get(complement), i };
            }

            // If not, add the current number and its index to the hash map
            numMap.put(nums[i], i);
        }

        // If no solution is found, return an empty array or throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);  // Output: Indices: 0, 1
    }
}
