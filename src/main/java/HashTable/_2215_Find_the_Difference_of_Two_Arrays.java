package HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _2215_Find_the_Difference_of_Two_Arrays {

    public List<Integer> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        List<List<Integer>> result = new ArrayList<>();
        for (Integer i : nums1) {
            hashSet1.add(i);
        }
        for (Integer i : nums2) {
            hashSet2.add(i);
        }

        hashSet1.removeAll(hashSet2);
        return new ArrayList<>(hashSet1);
    }

    public static void main(String[] args) {

    }
}
