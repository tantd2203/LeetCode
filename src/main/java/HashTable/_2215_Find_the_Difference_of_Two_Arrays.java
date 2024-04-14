package HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _2215_Find_the_Difference_of_Two_Arrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums1) {
            hashSet1.add(num);
        }
        for (int num : nums2) {
            hashSet2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Find elements in nums1 but not in nums2
        for (int num : hashSet1) {
            if (!hashSet2.contains(num)) {
                list1.add(num);
            }
        }
        result.add(list1);

        // Find elements in nums2 but not in nums1
        for (int num : hashSet2) {
            if (!hashSet1.contains(num)) {
                list2.add(num);
            }
        }
        result.add(list2);

        return result;
    }

    public static void main(String[] args) {
        _2215_Find_the_Difference_of_Two_Arrays ftd = new _2215_Find_the_Difference_of_Two_Arrays();
        int[] nums1 = {-1000};
        int[] nums2 = {-1000};
        List<List<Integer>> result = ftd.findDifference(nums1, nums2);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
