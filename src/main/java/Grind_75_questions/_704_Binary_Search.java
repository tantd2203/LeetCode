package Grind_75_questions;

public class _704_Binary_Search {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;


        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target >nums[mid] ) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {-1,0,3,5,9,12};
        int target1 = 9;
        System.out.println("Index of " + target1 + ": " + search(nums1, target1));
    }

}
