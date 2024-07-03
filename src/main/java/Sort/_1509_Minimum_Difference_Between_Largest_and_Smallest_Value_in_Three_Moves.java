package Sort;

import java.util.Arrays;
import java.util.Map;

public class _1509_Minimum_Difference_Between_Largest_and_Smallest_Value_in_Three_Moves {
    public int minDifference(int[] nums) {
            int n = nums.length;
            if (n <= 4) return 0;

            // Sort the array
            Arrays.sort(nums);

            // Evaluate the minimum difference possible with at most 3 moves

            return  Math.min(
                    Math.min(nums[n - 1] - nums[3], nums[n - 2] - nums[2]),
                    Math.min(nums[n - 3] - nums[1], nums[n - 4] - nums[0])
            );
    }
    public static void main(String[] args) {
        _1509_Minimum_Difference_Between_Largest_and_Smallest_Value_in_Three_Moves tester = new _1509_Minimum_Difference_Between_Largest_and_Smallest_Value_in_Three_Moves();
        tester.runTests();
    }

    public void runTests() {
        testMinDifference(new int[]{5, 3, 2, 4}, 0);
        testMinDifference(new int[]{1, 5, 0, 10, 14}, 1);
        testMinDifference(new int[]{6, 6, 0, 1, 1, 4, 6}, 2);
        testMinDifference(new int[]{1, 5, 6, 14, 15}, 1);
        testMinDifference(new int[]{1, 2, 3, 4, 5, 6}, 2);
        testMinDifference(new int[]{1}, 0);
        testMinDifference(new int[]{1, 2}, 0);
        testMinDifference(new int[]{1, 2, 3}, 0);
        testMinDifference(new int[]{1, 2, 3, 4}, 0);
        testMinDifference(new int[]{9, 48, 92, 78, 15, 22, 40}, 33);
    }

    private void testMinDifference(int[] nums, int expected) {
        int result = minDifference(nums);
        System.out.println("Test with input: " + Arrays.toString(nums));
        System.out.println("Expected: " + expected + ", Result: " + result);
        System.out.println(result == expected ? "PASS" : "FAIL");
        System.out.println();
    }

}
