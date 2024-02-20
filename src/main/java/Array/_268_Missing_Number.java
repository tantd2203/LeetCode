package Array;

import java.util.Arrays;

public class _268_Missing_Number {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum =0;
        for (int num : nums){
            sum += num;
        }
        return  total -sum;
    }

    public static void main(String[] args) {
        int[] nums = { 0};
        int result = missingNumber(nums);
        System.out.println(result);
    }
}
