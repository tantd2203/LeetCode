package BinarySearch;

import java.util.HashMap;

public class BinarySearch {

    public static int binary_search(int[] nums, int target) {
        int size = nums.length;
        int ILeft = 0;
        int IRight = size - 1;

        while (ILeft <= IRight) {

            int IMid = (IRight + ILeft) / 2;

            if (nums[IMid] == target) {
                return IMid;
            } else if (target > nums[IMid]) {

                ILeft = IMid + 1;

            } else {
                IRight = IMid - 1;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(binary_search(a, 9));
        HashMap<String, String> a = new HashMap<>();
        a.put("2", "");
        a.put("1","");
        System.out.println(a);
    }

}
