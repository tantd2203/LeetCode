package Array;

public class _80_Remove_Duplicates_from_Sorted_Array_II {

    public static int removeDuplicates(int[] nums) {
        int next = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[next - 1] || nums[i] != nums[next - 2]) {
                nums[next++] = nums[i];
            }
        }
        return next;
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3, 3, 4}));
    }

    }
