package Grind_75_questions;

import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum {
    public static int[] twoSum_hasMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int ans = target - nums[i];

            if (map.containsKey(ans) && map.get(ans) != i) {

                return new int[]{i, map.get(ans)};
            }
        }


        return new int[]{};
    }

    public static int[] twoSum_twoFor(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum_twoFor(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
