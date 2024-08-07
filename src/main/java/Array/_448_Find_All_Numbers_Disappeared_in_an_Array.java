package Array;

import java.util.*;
import java.util.ArrayList;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1]; // Tạo mảng đánh dấu, kích thước n+1 để dễ xử lý

        // Đánh dấu các số đã xuất hiện
        for (int num : nums) {
            seen[num] = true;
        }

        // Tìm các số bị thiếu
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                result.add(i);
            }
        }

        return result;
    }


    public static List<Integer> findDisappearedNumbers_useSet(int[] nums) {

        Set<Integer> listNumberUnique = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            listNumberUnique.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {

            if (!listNumberUnique.contains(i)) {
                result.add(i);
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers);
    }
}
