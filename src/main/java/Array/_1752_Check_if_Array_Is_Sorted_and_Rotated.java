package Array;

import java.util.ArrayList;
import java.util.List;

public class _1752_Check_if_Array_Is_Sorted_and_Rotated {
    public boolean checkV2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }
        return count <= 1;

}

public static boolean check(int[] nums) {


    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] > nums[j]) {
                int[] result = rotate(nums, j);
                return isIncreasing(result);

            }
        }
    }

    return true;
}

public static int[] rotate(int[] nums, int i) {
    List<Integer> first = new ArrayList<>();
    List<Integer> second = new ArrayList<>();

    for (int j = 0; j < nums.length; j++) {

        if (j < i) {
            first.add(nums[j]);
        } else {
            second.add(nums[j]);
        }
    }
    second.addAll(first);

    return second.stream().mapToInt(Integer::intValue).toArray();

}

public static boolean isIncreasing(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return false;
        }
    }
    return true;
}


public static void main(String[] args) {

    int[] expected = {3, 4, 5, 1, 2};

    System.out.println(check(expected));
}
}

