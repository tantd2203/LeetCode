package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2089 {
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                indices.add(i);
            }
        }

        return indices;

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 2, 3};
        List<Integer> result = targetIndices(a, 2);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
