package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class _136_Single_Number {
    public static int singleNumber_HashMap(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static int singleNumber_XOR(int[] nums) {

        int unique = 0;
        for (int num : nums) {
            unique ^= num;
        }
        return unique;
    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // Handle the edge case when there's only one element
        if (n == 1) {
            return nums[0];
        }

        for (int i = 0; i < n - 1; i += 2) {
            // If the current element is not equal to the next one, it is the single element
            if (i == n - 1 || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        // If we haven't found the single element in pairs, it must be the last element
        return nums[n - 1];
    }

}



/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.*/