package TwoPointers;

import java.util.Arrays;

public class _1679_Max_Number_of_K_Sum_Pairs {
    public static int maxOperations(int[] nums, int k) {

        int l = 0;
        int r = nums.length - 1;
        int count = 0;
        Arrays.sort(nums);
        while (l < r) {
            int sum = nums[l] + nums[r];

            if (sum == k) {
                count++;
                r--;
                l++;

            } else if (sum < k) {
                l++;
            } else {
                r--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int nums[] = {3, 1, 3, 4, 3,2};
        int k = 3;
        System.out.println(maxOperations(nums,k));

    }
}
