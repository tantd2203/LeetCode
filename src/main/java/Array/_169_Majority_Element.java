package Array;

import java.util.Arrays;
import java.util.HashMap;

public class _169_Majority_Element {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }


}
