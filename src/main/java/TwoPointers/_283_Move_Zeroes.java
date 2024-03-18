package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        while (index < n) {
            nums[index++] = 0;
        }

        Arrays.stream(nums).forEach(num -> System.out.print( num +" "));

    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        moveZeroes(a);
    }
}
