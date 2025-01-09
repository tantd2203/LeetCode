package Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i <nums.length ; i++) {

            int asn = target  - nums[i];

            if (map.containsKey(asn)){

                return  new int[]{map.get(asn), i};
            }

            map.put(nums[i],i);
        }


        throw new ArrayIndexOutOfBoundsException("ss");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 17;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);  // Output: Indices: 0, 1
    }
}
