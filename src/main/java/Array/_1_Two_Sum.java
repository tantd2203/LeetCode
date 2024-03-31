package Array;

import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
// Create a HashMap to store elements and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, put the current element and its index into the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[0];
    }
}
