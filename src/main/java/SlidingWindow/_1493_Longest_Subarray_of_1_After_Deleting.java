package SlidingWindow;

public class _1493_Longest_Subarray_of_1_After_Deleting {
    public static int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int longestWindow = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }
            longestWindow = Math.max(longestWindow, i - start);
        }

        return longestWindow;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,0,1,1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
}
