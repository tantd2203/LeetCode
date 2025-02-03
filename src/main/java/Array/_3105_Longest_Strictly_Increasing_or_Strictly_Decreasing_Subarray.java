package Array;

public class _3105_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray {

    public static int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 0) return 0;

        int max = 1;
        int increasing = 1;
        int decreasing = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                increasing++;
                decreasing = 1;
            } else if (nums[i] < nums[i - 1]) {
                decreasing++;
                increasing = 1;
            } else {
                increasing = 1;
                decreasing = 1;
            }

            max = Math.max(max, Math.max(increasing, decreasing));
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 3, 2};
        System.out.println(longestMonotonicSubarray(nums));
    }
}
