package Array;
// Hoc Thuoc bai nay
public class _53_Maximum_Subarray {
    public static int maxSubArray_Kadane_Algorithm(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];
        int n = nums.length;


        for (int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static int maxSubArray_SlidingWindow(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        for (int num : nums) {
            // If windowSum is negative, reset it to the current number

            if (windowSum < 0) {
                windowSum = num;
            } else {
                // Otherwise, add the current number to the window
                windowSum += num;
            }
            // Update maxSum if the current windowSum is greater

            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray_SlidingWindow(nums);
        System.out.println("The maximum subarray sum is: " + result);  // Output: 6
    }
//

}
