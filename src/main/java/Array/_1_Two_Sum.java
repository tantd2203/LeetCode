package Array;

import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int soConLai = target - nums[i];

            if (map.containsKey(soConLai)) {

                return  new int[]{map.get(i) ,i};
            }

            map.put(nums[i], i); // save key = value  and   value = index
        }


        return  new int[0];

    }

    public static void main(String[] args) {

        int[] n = {2, 7, 11, 8};
        int target = 10;

        twoSum(n, target);

    }
}
